package BD.daos;

import BD.dbos.Fez;
import java.sql.*;
import BD.*;
import BD.Core.*;
import static BD.daos.Alunos.cadastrado;


public class Fizeste {
    public static boolean cadastrado(int ra, int codigo) throws Exception
	{
		boolean ret = false;
		
		try
		{
			String sqlConnection;
			
			sqlConnection = "select * "+" from fezz "+" where ra = ? and cod=?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt (1, ra);
                        BDSQLServer.COMANDO.setInt (2, codigo);

			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

			ret = resultado.first();
		}
		catch (SQLException error) 
		{
			throw new Exception ("Erro ao procurar aluno");
		}
		return ret;
	}
    
       public static boolean cadastrado(int ra ) throws Exception
	{
		boolean ret = false;
		
		try
		{
			String sqlConnection;
			
			sqlConnection = "select * "+" from fezz "+" where ra = ?";

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
    
    public static void incluir (Fez fez) throws Exception
    {
            try
            {
                    String sqlConnection;

                    sqlConnection = "insert into fezz " + " (ra, cod, nota, frequencia)" + "values "+" (?,?,?,?)";

                    BDSQLServer.COMANDO.prepareStatement(sqlConnection);

                    BDSQLServer.COMANDO.setInt	  (1, fez.getRA());
                    BDSQLServer.COMANDO.setInt (2, fez.getCod());
                    BDSQLServer.COMANDO.setDouble (3, fez.getNota());
                    BDSQLServer.COMANDO.setDouble (4, fez.getFrequencia());

                    BDSQLServer.COMANDO.executeUpdate();
                    BDSQLServer.COMANDO.commit       ();

            }
            catch(SQLException erro)
            {
                    throw new Exception ("Erro ao inserir aluno");
            }
    }  
     public static void excluir (int ra,int codigo) throws Exception
    {
        if (!cadastrado (ra,codigo))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "DELETE FROM fezz " +
                  "WHERE ra=? and cod =?";

            BDSQLServer.COMANDO.prepareStatement (sql);
            BDSQLServer.COMANDO.setInt (1, ra);
            BDSQLServer.COMANDO.setInt (2, codigo);

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao excluir livro");
        }
    }
   public static void alterar (Fez fez) throws Exception
    {
        if (fez == null)
            throw new Exception (" nao fornecido");

        if (!cadastrado (fez.getRA()))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "UPDATE fezz set cod=?, nota=?, frequencia=? where ra=?";
                  

            BDSQLServer.COMANDO.prepareStatement(sql);

            BDSQLServer.COMANDO.setInt  (1, fez.getCod ());
            BDSQLServer.COMANDO.setFloat  (2, fez.getNota ());
            BDSQLServer.COMANDO.setFloat     (3, fez.getFrequencia ());
             BDSQLServer.COMANDO.setInt     (4, fez.getRA());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao atualizar dados do aluno que fez a matéria");
        }
    }

    public static void alterarNota (Fez fez) throws Exception
    {
        if (fez == null)
            throw new Exception (" nao fornecido");

        if (!cadastrado (fez.getRA()))
            throw new Exception ("Nao cadastrado");

        try
        {
            String sql;

            sql = "UPDATE fezz set nota=?, frequencia=? where ra=? and cod=?";
                  

            BDSQLServer.COMANDO.prepareStatement(sql);

           
            BDSQLServer.COMANDO.setFloat  (1, fez.getNota ());
            BDSQLServer.COMANDO.setFloat     (2, fez.getFrequencia ());
             BDSQLServer.COMANDO.setInt     (3, fez.getRA());
             BDSQLServer.COMANDO.setInt  (4, fez.getCod ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao atualizar dados de livro");
        }
    }

    public static MeuResultSet getRelatorio () throws Exception
    {
        MeuResultSet result = null;

        try
        {
            String sqlConnection;

            sqlConnection = "SELECT * " +
                  "fezz";//mudar

            BDSQLServer.COMANDO.prepareStatement (sqlConnection);

            result = (MeuResultSet)BDSQLServer.COMANDO.executeQuery ();
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro ao recuperar frequencia do aluno");
        }

        return result;
    }

}


