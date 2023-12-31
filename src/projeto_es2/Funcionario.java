
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
    
    public List<Funcionario> funclist = new ArrayList<Funcionario>();
    
    public void addFuncionario(Funcionario F)
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO funcionario VALUES(?,?,?,?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getCpf());
            smt.setString(2, getNome());
            smt.setString(3, getSobrenome());
            smt.setString(4, getFuncao());
            smt.setString(5, getSenha());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    public void readFuncionario()
    {
        Connection conn = Banco.getConnection();
        
        String sql = "SELECT * FROM funcionario";
        
        try(ResultSet rs = conn.createStatement().executeQuery(sql))
        {
           while(rs.next())
           {
               Funcionario aux = new Funcionario();
               
               aux.cpf = rs.getString("pkcpf");
               aux.nome = rs.getString("nome");
               aux.sobrenome = rs.getString("sobrenome");
               aux.funcao = rs.getString("funcao");
               aux.senha = rs.getString("senha");
               
               funclist.add(aux);
           }
           conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }     
    }
    
    public void funcionarioLogin(String l, String s)
    {
        Connection conn = Banco.getConnection();
        String sql = "SELECT * FROM funcionario";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            ResultSet rs = smt.executeQuery();
            while(rs.next())
            {
                if(l.equals(rs.getString("pkcpf")))
                {
                    System.out.println("Login suave");
                    if(s.equals(rs.getString("senha")))
                    {
                        System.out.println("senha correta");
                        setFuncao(rs.getString("funcao"));
                        setNome(rs.getString("nome"));
                    }
                    else System.out.println("senha incorreta");
                }
                else
                {
                    System.out.println("Login incorreto");
                }
            }
            conn.close();              
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void recuperarsenha(String l)
    {
        Connection conn = Banco.getConnection();
        String sql = "SELECT * FROM funcionario";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            ResultSet rs = smt.executeQuery();
            while(rs.next())
            {
                if(l.equals(rs.getString("pkcpf")))
                {
                    System.out.println("Login suave");
                    setSenha(rs.getString("senha"));
                }
                else
                {
                    System.out.println("Login incorreto");
                }
            }
            conn.close();              
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
        
    public void updateNomeFuncionario(Funcionario F, String N)
    {
        setNome(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE funcionario SET nome = ? WHERE pkcpf = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getNome());
            smt.setString(2, getCpf());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    public void updateSobrenomeFuncionario(Funcionario F, String N)
    {
        setSobrenome(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE funcionario SET sobrenome = ? WHERE pkcpf = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getSobrenome());
            smt.setString(2, getCpf());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    public void updateFuncaoFuncionario(Funcionario F, String N)
    {
        setFuncao(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE funcionario SET funcao = ? WHERE pkcpf = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getFuncao());
            smt.setString(2, getCpf());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    public void updateSenhaFuncionario(Funcionario F, String N)
    {
        setSenha(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE funcionario SET senha = ? WHERE pkcpf = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getSenha());
            smt.setString(2, getCpf());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
                
    }
    
    public void deleteFuncionario()
    {
                
        Connection conn = Banco.getConnection();
        String sql = "DELETE FROM funcionario WHERE pkcpf = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        { 
            smt.setString(1, getCpf());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
             
    }
        

    public Funcionario (String cpf) throws SQLException
    {
        Connection conn = Banco.getConnection();
        PreparedStatement smt = conn.prepareStatement("SELECT * FROM funcionario WHERE pkcpf = ?");
        
        smt.setString(1, cpf);
        ResultSet rs = smt.executeQuery();
        
        rs.next();
            
        this.cpf = rs.getString("pkcpf");
        this.nome = rs.getString("nome");
        this.sobrenome = rs.getString("sobrenome");
        this.funcao = rs.getString("funcao");
        this.senha = rs.getString("senha");  
        
        conn.close();
         
    } 

    public Funcionario(String nome, String sobrenome, String cpf, String funcao, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.senha = senha;
    }

    public Funcionario()
    {
        
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    public void clearList(){
        funclist.clear();
    }
    
    public int getSize(){
        return funclist.size();
    }
    
    public void setFuncionario(int i){
        setNome(funclist.get(i).nome);
        setSobrenome(funclist.get(i).sobrenome);
        setCpf(funclist.get(i).cpf);
        setFuncao(funclist.get(i).funcao);
    }
}
