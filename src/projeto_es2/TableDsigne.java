package projeto_es2;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class TableDsigne extends JTable{
    
    
    public TableDsigne(){
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean b1, int i, int il){
                TableHeader H = new TableHeader(o+"");
                
                H.setHorizontalAlignment(JLabel.LEADING);
                
                return H;
            } 
    });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean b1, int i, int il){
                
                if(il != -1){
                    Component c = super.getTableCellRendererComponent(jtable, o, selected, b1, i, il);
                    c.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if(selected){
                        c.setForeground(Color.WHITE);
                        c.setBackground(Color.BLACK);
                    }else{
                        c.setForeground(Color.BLACK);
                    }
                    return c;
                }
                
                return new JLabel(o+"");
            }
        });
    }
}
