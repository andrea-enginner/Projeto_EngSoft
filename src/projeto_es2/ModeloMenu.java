package projeto_es2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class ModeloMenu {

    private String nomeCampo;
    
    private TipoMenu tipo;
      
    public static enum TipoMenu{
        TYTLE, MENU, EMPTY
    }
    
    public ModeloMenu(String nomeCampo, TipoMenu tipo){
        this.nomeCampo = nomeCampo;
        this.tipo = tipo;
    }
    
    
    
    
    /**
     * @return the nomeCampo
     */
    public String getNomeCampo() {
        return nomeCampo;
    }

    /**
     * @param nomeCampo the nomeCampo to set
     */
    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    /**
     * @return the tipo
     */
    public TipoMenu getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoMenu tipo) {
        this.tipo = tipo;
    }
}
