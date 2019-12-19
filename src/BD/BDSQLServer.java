package BD;

import BD.*;
import java.sql.*;
import BD.Core.*;
import BD.daos.*;

public class BDSQLServer
{
    public static final MeuPreparedStatement COMANDO;

    static
    {
    	MeuPreparedStatement comando = null;

    	try
        {
            comando =
            new MeuPreparedStatement (
            "com.microsoft.sqlserver.jdbc.SQLServerDriver",
            "jdbc:sqlserver://SERVIDOR:1433;databasename=DATABASE",
            "USER", "PASSWORD");
            System.out.print("Conexao feita com sucesso");
        }
        catch (Exception erro)
        {
            System.err.println ("Problemas de conexao com o BD");
            System.exit(0);
        }
        
        COMANDO = comando;
    }
}