package projeto_es2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
    
    public List<Pet> funclist = new ArrayList<Pet>();
    
    public void readPet(){
        
        Connection conn = Banco.getConnection();
        String sql = "SELECT * FROM pet";
        
        try(ResultSet rs = conn.createStatement().executeQuery(sql))
        {
           while(rs.next())
           {
              Pet aux = new Pet();
              
              aux.nome = rs.getString("nomepet");
              aux.especie = rs.getString("especie");
              aux.raca = rs.getString("raca");
              aux.proprietario = rs.getString("nomeprop");
              aux.cpfdono = rs.getString("pkcpfdono");
              
              funclist.add(aux);
           }
           conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void addPet(Pet P)
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO pet VALUES(?,?,?,?,?,?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getNome());
            smt.setString(2, getEspecie());
            smt.setString(3, getRaca());
            smt.setString(4, getProprietario());
            smt.setString(5, getHistorico());
            smt.setString(6, getCpfdono());
            smt.setString(7, getData());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void setUpdatePet(Pet F, String N)
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
        String sql = "UPDATE pet SET data = ? WHERE pkcpfdono = ?";
        
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
        String sql = "DELETE FROM pet WHERE pkcpfdono = ?";
        
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
    public Pet(String nome, String especie, String raca, String proprietario, String data, String cpfdono)
    {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.proprietario = proprietario;
        this.data = data;
        this.cpfdono = cpfdono;
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
        
        conn.close();
         
    }
    
    public boolean petCadastrado(String cpfdono, String nome) {
        try (Connection conn = Banco.getConnection()) {
            String sql = "SELECT * FROM pet WHERE pkcpfdono = ? AND nomepet = ?";
            try (PreparedStatement smt = conn.prepareStatement(sql)) {
                smt.setString(1, cpfdono);
                smt.setString(2, nome);
                ResultSet rs = smt.executeQuery();
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean horarioDisponivel(String data, String horario) {
        try (Connection conn = Banco.getConnection()) {
            String sql = "SELECT * FROM consulta WHERE pkdata = ? AND pkhorario = ?";
            try (PreparedStatement smt = conn.prepareStatement(sql)) {
                smt.setString(1, data);
                smt.setString(2, horario);
                ResultSet rs = smt.executeQuery();
                return !rs.next(); // Retorna true se o horário estiver disponível
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void agendarConsulta(Pet p, String data, String horario) {
    System.out.println("Nome do Pet: " + p.getNome());
    System.out.println("CPF do Dono: " + p.getCpfdono());
    
    if (petCadastrado(p.getCpfdono(), p.getNome())) {
        System.out.println("Pet cadastrado");
        if (horarioDisponivel(data, horario)) {
            try (Connection conn = Banco.getConnection()) {
                String sql = "INSERT INTO consulta (pkdata, pkhorario, cpfdonopet) VALUES (?, ?, ?)";
                try (PreparedStatement smt = conn.prepareStatement(sql)) {
                    smt.setString(1, data);
                    smt.setString(2, horario);
                    smt.setString(3, p.getCpfdono());
                    smt.executeUpdate();
                    System.out.println("Consulta cadastrada");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Horário indisponível");
        }
    } else {
        System.out.println("O pet não está cadastrado");
    }
}
    
    public void updateConsultaData(Pet F, String data, String hora, String Ndata)
    {

        Connection conn = Banco.getConnection();
        String sql = "UPDATE consulta SET pkdata = ? WHERE pkdata = ? and pkhorario = ?";
        
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
        String sql = "UPDATE consulta SET pkhora = ? WHERE pkdata = ? and pkhorario = ?";
        
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
        String sql = "UPDATE consulta SET sintomas = ? WHERE pkdata = ? and pkhorario = ?";
        
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
        String sql = "UPDATE consulta SET medicamento = ? WHERE pkdata = ? and pkhorario = ?";
        
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
        String sql = "UPDATE consulta SET tratamento = ? WHERE pkdata = ? and pkhorario = ?";
        
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
    
    public void clearList(){
        funclist.clear();
    }
    
    public int getSize(){
        return funclist.size();
    }
    
    public void setPet(int i){
        setNome(funclist.get(i).nome);
        setEspecie(funclist.get(i).especie);
        setRaca(funclist.get(i).raca);
        setProprietario(funclist.get(i).proprietario);
        setCpfdono(funclist.get(i).cpfdono);
    }
     
}
