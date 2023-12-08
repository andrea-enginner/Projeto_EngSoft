package projeto_es2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hiago
 */
public class Medicamentos 
{
    private String nomemedicamento;
    private String quantidade;
    
    public List<Medicamentos> funclist = new ArrayList<Medicamentos>();
    
    public void addMedicamento()
    {
        Connection conn = Banco.getConnection();
        String sql = "INSERT INTO medicamentos VALUES(?,?)";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getNomemedicamento());
            smt.setString(2, getQuantidade());

            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void readMedicamento()
    {
        Connection conn = Banco.getConnection();
        
        String sql = "SELECT * FROM medicamentos";
        
        try(ResultSet rs = conn.createStatement().executeQuery(sql))
        {
           while(rs.next())
           {
               Medicamentos aux = new Medicamentos();
               
               aux.nomemedicamento = rs.getString("pknomemedicamento");
               aux.quantidade = rs.getString("quantidade");
               
               funclist.add(aux);
           }
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
        String sql = "UPDATE medicamentos SET pknomemedicamento = ? WHERE pknomemedicamento = ?";
        
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
    
    public void updateQtdmedicamento(Medicamentos m)
    {
        
        Connection conn = Banco.getConnection();
        String sql = "UPDATE medicamentos SET quantidade = ? WHERE pknomemedicamento = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        {
            smt.setString(1, getQuantidade());
            smt.setString(2, getNomemedicamento());
            ResultSet rs = smt.executeQuery();
            
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void deleteMedicamento()
    {
        Connection conn = Banco.getConnection();
        String sql = "DELETE FROM medicamentos WHERE pknomemedicamento = ?";
        
        try(PreparedStatement smt = conn.prepareStatement(sql))
        { 
            smt.setString(1, getNomemedicamento());
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
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public void clearList(){
        funclist.clear();
    }
    
    public int getSize(){
        return funclist.size();
    }
    
    public void setMedicamento(int i){
        setNomemedicamento(funclist.get(i).nomemedicamento);
        setQuantidade(funclist.get(i).quantidade);
    }
}
