package BD.daos;

import BD.dbos.Aluno;
import java.sql.*;
import BD.*;
import BD.Core.*;
import java.awt.List;
import java.util.ArrayList;

public class Alunos
{
	public static boolean cadastrado(int ra) throws Exception
	{
		boolean ret = false;
		
		try
		{
			String sqlConnection;
			
			sqlConnection = "select * "+" from alunos"+" where ra = ?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt (1, ra);

			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

			ret = resultado.first();
		}
		catch (SQLException error) 
		{
			throw new Exception ("Erro ao procurar aluno");
		}
		return ret;
	}
        public static boolean cadastrado(String email, int ra) throws Exception
	{
		boolean ret = false;
		
		try
		{
			String sqlConnection;
			
			sqlConnection = "select * from alunos where ra=? and email =?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt (1, ra);
                        BDSQLServer.COMANDO.setString (2, email);

			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

			ret = resultado.first();
		}
		catch (SQLException error) 
		{
			throw new Exception ("Erro ao procurar aluno");
		}
		return ret;
	}
        
        public static boolean cadastrado(int ra, String nome) throws Exception
	{
		boolean ret = false;
		
		try
		{
			String sqlConnection;
			
			sqlConnection = sqlConnection = "select * "+" from alunos "+" where ra = ? and nome=?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt (1, ra);
                        BDSQLServer.COMANDO.setString (2, nome);

			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

			ret = resultado.first();
		}
		catch (SQLException error) 
		{
			throw new Exception ("Erro ao procurar aluno");
		}
		return ret;
	}
        
     
	public static void incluir (Aluno aluno) throws Exception
	{
		if(aluno == null)
			throw new Exception("Aluno n�o cadastrado");
           
		try
		{
                   
			String sqlConnection;

			sqlConnection = "insert into alunos " + " (ra, nome, email)" + "values "+" (?,?,?)";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt	  (1, aluno.getRa());
			BDSQLServer.COMANDO.setString (2, aluno.getNome());
			BDSQLServer.COMANDO.setString (3, aluno.getEmail());

			BDSQLServer.COMANDO.executeUpdate();
			BDSQLServer.COMANDO.commit       ();

		}
		catch(SQLException erro)
		{
			throw new Exception ("Erro ao inserir aluno");
		}
	}
        
            public static void alterarNome (Aluno a) throws Exception
    {
        if (a==null)
            throw new Exception ("Aluno nao fornecido");

        

        try
        {
            String sql;

            sql = "UPDATE alunos SET NOME=? WHERE RA = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, a.getNome ());
           
            BDSQLServer.COMANDO.setInt    (2, a.getRa ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao atualizar dados de aluno");
        }
    }
        
        public static void alterarEmail (Aluno a) throws Exception
    {
        if (a==null)
            throw new Exception ("Aluno nao fornecido");

        

        try
        {
            String sql;

            sql = "UPDATE alunos SET EMAIL=? WHERE RA = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, a.getEmail ());
           
            BDSQLServer.COMANDO.setInt    (2, a.getRa ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao atualizar dados de aluno");
        }
    }
	
    public static void excluir (int codigo) throws Exception
    {
        if (!cadastrado (codigo))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM alunos " +
                  "WHERE ra=?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setInt (1, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao excluir livro");
        }
    }
   public static void alterar (Aluno aluno) throws Exception
    {
        if (aluno == null)
            throw new Exception (" nao fornecido");

        if (!cadastrado (aluno.getRa()))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "UPDATE alunos " +
                  "SET NOME=? " +
                  ", EMAIL=? " +
                  "WHERE RA = ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString  (1, aluno.getNome ());
            BDSQLServer.COMANDO.setString  (2, aluno.getEmail ());
            BDSQLServer.COMANDO.setInt     (3, aluno.getRa ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao atualizar dados de livro");
        }
    }

	public static Aluno getAluno (int Ra) throws Exception
	{
		Aluno aluno = null;

		try
		{

			String sqlConnection;

			sqlConnection= "select *" + " from alunos " + "where ra = ?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt(1, Ra);

			MeuResultSet  resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
			
			if(!resultado.first())
				throw new Exception("N�o cadastrado");
			
			aluno = new Aluno (resultado.getInt       ("RA"),
							   resultado.getString  ("NOME"),
							   resultado.getString("EMAIL"));

		}
		catch(SQLException erro)
		{
			throw new Exception ("Erro ao procurar aluno");
		}
		return aluno;
	}
 
  
	public static MeuResultSet getAlunos() throws Exception
	{
		MeuResultSet resultado = null;
		try
		{
			String sqlConnection;

			sqlConnection = "select * " + "from alunos";

			BDSQLServer.COMANDO.prepareStatement (sqlConnection);

			resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

		}
		catch(SQLException erro)
		{
			throw new Exception("Erro ao recuperar Alunos");
		}
		return resultado;
	}
	
	/////////////////////////////-----------------------------/////////////////////////////////
	public static Aluno relatorio() throws Exception
	{
		Aluno alu;

		try
		{
			String sqlCon;
			
			sqlCon = "select * from alunos a, fez f where a.ra = f.ra and " + "f.frequencia = 0";
			
			BDSQLServer.COMANDO.prepareStatement(sqlCon);
			
			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
			
			alu = new Aluno (resultado.getInt       ("RA"),
							   resultado.getString  ("NOME"),
							   resultado.getString("EMAIL"));
			
		}
		catch(SQLException error)
		{
			throw new Exception("Impossivel encontrar relatorio");
		}
		return alu;
	}	
        
        
        
}