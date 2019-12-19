package BD.daos;
import BD.dbos.Materia;
import java.sql.*;
import BD.*;
import BD.Core.*;

public class Materias
{
	public static boolean cadastrada(int codigo) throws Exception
	{
		boolean ret = false;
		
		try
		{
			String sqlConnection;
			
			sqlConnection = "select * from"+" from materia"+" where codigo = ?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt (1, codigo);

			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

			ret = resultado.first();
		}
		catch (SQLException error) 
		{
			throw new Exception ("Erro ao procurar matéria");
		}
		return ret;
	}
	public static void incluir (Materia materia) throws Exception
	{
		if(materia == null)
			throw new Exception("Materia não cadastrada");
		try
		{
			String sqlConnection;

			sqlConnection = "insert into materia " + " (codigo, nome)" + "values "+" (?,?)";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt	  (1, materia.getCodigo());
			BDSQLServer.COMANDO.setString (2, materia.getNome());

			BDSQLServer.COMANDO.executeUpdate();
			BDSQLServer.COMANDO.commit       ();

		}
		catch(SQLException erro)
		{
			throw new Exception ("Erro ao inserir materia");
		}
	}
	
	    public static void excluir (int codigo) throws Exception
    {
       

        try
        {
            String sql;

            sql = "DELETE FROM materia " +
                  "WHERE codigo=?";

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

	public static void alterar (Materia mat) throws Exception
    {
        if (mat==null)
            throw new Exception ("Livro nao fornecido");

        try
        {
            String sql;

            sql = "UPDATE materia " +
                  "SET NOME=? " +                   
                  "WHERE codigo= ?";

            BDSQLServer.COMANDO.prepareStatement (sql);

            BDSQLServer.COMANDO.setString (1, mat.getNome ());
            
            BDSQLServer.COMANDO.setInt    (2, mat.getCodigo ());

            BDSQLServer.COMANDO.executeUpdate ();
            BDSQLServer.COMANDO.commit        ();
        }
        catch (SQLException erro)
        {
          //BDSQLServer.COMANDO.rollback ();
            throw new Exception ("Erro ao atualizar dados de livro");
        }
    }
	public static Materia getMateria (int codigo) throws Exception
	{
		Materia materia = null;

		try
		{

			String sqlConnection;

			sqlConnection = "select *" + " from materias " + "where codigo = ?";

			BDSQLServer.COMANDO.prepareStatement(sqlConnection);

			BDSQLServer.COMANDO.setInt(1, codigo);

			MeuResultSet  resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
			
			if(!resultado.first())
				throw new Exception("Não cadastrada");
			
			materia = new Materia (resultado.getInt("codigo"),
								   resultado.getString("nome"));

		}
		catch(SQLException erro)
		{
			throw new Exception ("Erro ao procurar matéria");
		}
		return materia;
	}
	public MeuResultSet getMaterias() throws Exception
	{
		MeuResultSet resultado = null;
		try
		{
			String sqlConnection;

			sqlConnection = "select * " + "from materias";

			BDSQLServer.COMANDO.prepareStatement (sqlConnection);

			resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();

		}
		catch(SQLException erro)
		{
			throw new Exception("Erro ao recuperar Materias");
		}
		return resultado;
	}
	/////////////////////////////////////////////*****************************//////////////////////////////////
	
	public static Materia reprovacoes() throws Exception
	{
		Materia mat;

		try
		{
			String sqlCon;
			
			sqlCon = "select * from materias a, fez f where a.ra = f.ra and " + "f.frequencia = 0";
			
			BDSQLServer.COMANDO.prepareStatement(sqlCon);
			
			MeuResultSet resultado = (MeuResultSet)BDSQLServer.COMANDO.executeQuery();
			
			mat = new Materia (resultado.getInt       ("COD"),
							   resultado.getString  ("NOME"));
			
		}
		catch(SQLException error)
		{
			throw new Exception("Impossivel encontrar relatorio");
		}
		return mat;
	}
}