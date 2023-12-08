/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_es2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author hiago
 */
public class Pet {
    
    private String nome;
    private String especie;
    private String raca;
    private String proprietario;
    private String data;
    private String historico;
    private String cpfdono;
    private String senha;
    
    public void addPet(Pet P)
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO pet VALUES(?,?,?,?,?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getCpfdono());
            smt.setString(2, getData());
            smt.setString(3, getNome());
            smt.setString(4, getProprietario());
            smt.setString(5, getRaca());
            smt.setString(6, getEspecie());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateNomePet(Pet F, String N)
    {
        setNome(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE pet SET nomepet = ? WHERE pkcpfdono = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getNome());
            smt.setString(2, getCpfdono());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateDataPet(Pet F, String N)
    {
        setData(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE pet SET pkdata = ? WHERE pkcpfdono = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getData());
            smt.setString(2, getCpfdono());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateNomeDono(Pet F, String N)
    {
        setProprietario(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE pet SET nomeprop = ? WHERE pkcpfdono = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getProprietario());
            smt.setString(2, getCpfdono());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateRacaPet(Pet F, String N)
    {
        setRaca(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE pet SET raca = ? WHERE pkcpfdono = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getRaca());
            smt.setString(2, getCpfdono());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateEspeciePet(Pet F, String N)
    {
        setEspecie(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE pet SET especie = ? WHERE pkcpfdono = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getEspecie());
            smt.setString(2, getCpfdono());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void deletePet()
    {
        Connection conn = Banco.getConnection();
        String sql = "DELETE FROM funcionario WHERE pkcpf = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        { 
            smt.setString(1, getCpfdono());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public Pet()
    {
        
    }
    public Pet(String nome, String especie, String raca, String proprietario, String data, String cpfdono, String senha)
    {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.proprietario = proprietario;
        this.data = data;
        this.cpfdono = cpfdono;
        this.senha = senha;
    }
    
    public Pet (String cpf) throws SQLException
    {
        Connection conn = Banco.getConnection();
        PreparedStatement smt = conn.prepareStatement("SELECT * FROM pet WHERE pkcpfdono = ?");
        
        smt.setString(1, cpf);
        ResultSet rs = smt.executeQuery();
        
        rs.next();
            
        this.cpfdono = rs.getString("pkcpfdono");
        this.nome = rs.getString("nomepet");
        this.data = rs.getString("pkdata");
        this.especie = rs.getString("especie");
        this.raca = rs.getString("raca");  
        this.senha = rs.getString("senha");
        
        conn.close();
         
    }
    
    public void agendarConsulta(Pet p, String data, String horario, String sintomas)
    {
        Connection conn = Banco.getConnection();
        String sql = "SELECT * FROM pet WHERE pkcpfdono = ? AND nomepet = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        { 
            smt.setString(1, p.getCpfdono());
            smt.setString(2, p.getNome());
            
            ResultSet rs = smt.executeQuery();
            
            if(rs.next() == true)
            {
                Connection connt = Banco.getConnection();
                String sqlt = "INSERT INTO consulta (pkdata,pkhora,sintomas,cpfdonopet) VALUES(?,?,?,?)";
        
                try(PreparedStatement smtt = connt.prepareStatement(sqlt))
                { 
                    smtt.setString(1, data);
                    smtt.setString(2, horario);
                    smtt.setString(3, sintomas);
                    smtt.setString(4, p.getCpfdono());
            
                    ResultSet rst = smtt.executeQuery();
                   
                    connt.close();
                    
                    System.out.println("Consulta cadastrada");
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("O pet nao esta cadastrado");
            }
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateConsultaData(Pet F, String data, String hora, String Ndata)
    {

        Connection conn = Banco.getConnection();
        String sql = "UPDATE consulta SET pkdata = ? WHERE pkdata = ? and pkhora = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, Ndata);
            smt.setString(2, data);
            smt.setString(3, hora);
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateConsultaHora(Pet F, String data, String hora, String Nhora)
    {

        Connection conn = Banco.getConnection();
        String sql = "UPDATE consulta SET pkhora = ? WHERE pkdata = ? and pkhora = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, Nhora);
            smt.setString(2, data);
            smt.setString(3, hora);
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateConsultaSintomas(Pet F, String data, String hora, String sintoma)
    {

        Connection conn = Banco.getConnection();
        String sql = "UPDATE consulta SET sintomas = ? WHERE pkdata = ? and pkhora = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, sintoma);
            smt.setString(2, data);
            smt.setString(3, hora);
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateConsultaMedicamento(Pet F, String data, String hora, String medicamento)
    {

        Connection conn = Banco.getConnection();
        String sql = "UPDATE consulta SET medicamento = ? WHERE pkdata = ? and pkhora = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, medicamento);
            smt.setString(2, data);
            smt.setString(3, hora);
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateConsultaTratamento(Pet F, String data, String hora, String tratamento)
    {

        Connection conn = Banco.getConnection();
        String sql = "UPDATE consulta SET tratamento = ? WHERE pkdata = ? and pkhora = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, tratamento);
            smt.setString(2, data);
            smt.setString(3, hora);
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void petLogin(String l, String s)
    {
        Connection conn = Banco.getConnection();
        String sql = "SELECT * FROM pet";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            ResultSet rs = smt.executeQuery();
            while(rs.next())
            {
                if(l.equals(rs.getString("pkcpfdono")))
                {
                    System.out.println("Login suave");
                    if(s.equals(rs.getString("senha")))
                    {
                        System.out.println("senha correta");
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
    
    

    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the historico
     */
    public String getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    /**
     * @return the cpfdono
     */
    public String getCpfdono() {
        return cpfdono;
    }

    /**
     * @param cpfdono the cpfdono to set
     */
    public void setCpfdono(String cpfdono) {
        this.cpfdono = cpfdono;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
     
}
