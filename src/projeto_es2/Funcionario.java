package projeto_es2;

import projeto_es2.Banco.*;
import java.sql.*;
import java.util.*;

public class Funcionario 
{
    private String nome;
    private String sobrenome;
    private String funcao;
    private int cpf;
    private int senha;
    private int id;
    
    public void addFuncionario(Funcionario F)
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO funcionario VALUES(?,?,?,?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setInt(1, getCpf());
            smt.setString(2, getNome());
            smt.setString(3, getSobrenome());
            smt.setString(4, getFuncao());
            smt.setInt(5, getSenha());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    public Funcionario()
    {
        
    }
    public Funcionario(String nome, String sobrenome, int cpf, String funcao, int senha) {
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public int getSenha(){
        return senha;
    }
}
