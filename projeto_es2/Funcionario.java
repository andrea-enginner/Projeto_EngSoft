
package projeto_es2;

import projeto_es2.Banco.*;
import java.sql.*;
import java.util.*;

public class Funcionario 
{
    private String nome;
    private String sobrenome;
    private String funcao;
    private String cpf;
    private String senha;
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
    
    public Funcionario(String nome, String sobrenome, String cpf, String funcao, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.senha = senha;
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
    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
}
