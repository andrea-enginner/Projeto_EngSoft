package projeto_es2;

import java.sql.*;

public class Banco 
{   
    private final static String url = "jdbc:postgresql://localhost:5432/clinicavet";
    private final static String usuario = "postgres";
    private final static String senha = "bancodedados";
    
    public static Connection getConnection()
    {
        try
        {
           return DriverManager.getConnection(url,usuario,senha);
        }
        catch(SQLException e)
        {
            throw new RuntimeException("Erro ao conectar com o banco"+e.getMessage(), e);
        }
    }
}

