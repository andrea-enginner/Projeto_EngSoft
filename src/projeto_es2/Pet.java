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
    private int cpfdono;
    
    public void addPet(Pet P)
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO pet VALUES(?,?,?,?,?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setInt(1, getCpfdono());
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

    public Pet()
    {
        
    }
    public Pet(String nome, String especie, String raca, String proprietario, String data)
    {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.proprietario = proprietario;
        this.data = data;
    }

    /**
     * @return the nome
     */
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
    public int getCpfdono() {
        return cpfdono;
    }

    /**
     * @param cpfdono the cpfdono to set
     */
    public void setCpfdono(int cpfdono) {
        this.cpfdono = cpfdono;
    }
    
    
    
}
