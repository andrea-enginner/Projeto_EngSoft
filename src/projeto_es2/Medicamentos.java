package projeto_es2;

import java.sql.*;

/**
 *
 * @author hiago
 */
public class Medicamentos 
{
    private String nomemedicamento;
    private int quantidade;
    
    public void addMedicamento()
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO medicamentos VALUES(?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getNomemedicamento());
            smt.setInt(2, getQuantidade());

            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateNomemedicamento(Medicamentos m, String N)
    {
       setNomemedicamento(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE medicamentos SET nomemedicamento = ? WHERE LOWER(nomemedicamento) = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, N);
            smt.setString(2, getNomemedicamento());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateQtdmedicamento(Medicamentos m, int N)
    {
       setQuantidade(N);
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE medicamentos SET quantidade = ? WHERE LOWER(nomemedicamento) = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setInt(1, N);
            smt.setString(2, getNomemedicamento());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @return the nomemedicamento
     */
    public String getNomemedicamento() {
        return nomemedicamento;
    }

    /**
     * @param nomemedicamento the nomemedicamento to set
     */
    public void setNomemedicamento(String nomemedicamento) {
        this.nomemedicamento = nomemedicamento;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
