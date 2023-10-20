
package projeto_es2;

import projeto_es2.Banco.*;
import java.sql.*;
import java.util.*;

public class Funcionario 
{
    private String nome;
    private int id;
    
    public void addFuncionario(Funcionario F)
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO funcionario VALUES(?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getNome());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
