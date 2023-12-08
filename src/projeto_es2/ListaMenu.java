package projeto_es2;


import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 * @param <E>
 */
public class ListaMenu<E extends Object> extends JList<E>{
    
    private final DefaultListModel modelo;
    private int selectindex = -1;
    private int overIndex = -1;
    private SelectedMenu evento;
    
    public ListaMenu(){
        modelo = new DefaultListModel();
        setModel(modelo);
        addMouseListener(new MouseAdapter(){
            @Override
            public void  mousePressed(MouseEvent m){
                if(SwingUtilities.isLeftMouseButton(m)){
                    int index = locationToIndex(m.getPoint());
                    Object o = modelo.getElementAt(index);
                    
                    if(o instanceof ModeloMenu){
                        ModeloMenu menu = (ModeloMenu) o;
                        
                        if(menu.getTipo() == ModeloMenu.TipoMenu.MENU){
                            selectindex = index;
                            if(evento != null){
                                evento.Selecionado(index);
                            }
                        }
                    }else{
                        selectindex = index;
                    }
                    
                    repaint();
                }
            }
            @Override
            public void mouseExited(MouseEvent m){
                overIndex = -1;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent m){
                int index = locationToIndex(m.getPoint());
                
                if(index != overIndex){
                    Object o = modelo.elementAt(index);
                    if(o instanceof ModeloMenu){
                        ModeloMenu menu = (ModeloMenu) o;
                        
                        if(menu.getTipo() == ModeloMenu.TipoMenu.MENU){
                            overIndex = index;
                        }else{
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
        });
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus){
                ModeloMenu data;
                
                if(o instanceof ModeloMenu){
                    data = (ModeloMenu) o;
                }else{
                    data = new ModeloMenu( o + "", ModeloMenu.TipoMenu.MENU);
                }
                
                ItensMenu item = new ItensMenu(data);
                item.setSelecionado(selectindex == index);
                item.setOver(overIndex == index);
                return item;
            }
        };
    }
    
    public void addItem(ModeloMenu data){
        modelo.addElement(data);
    }
    
    public void addSelectedMenu(SelectedMenu sm){
        this.evento = sm;
    }
}
