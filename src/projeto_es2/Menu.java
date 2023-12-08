package projeto_es2;



import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Menu extends javax.swing.JPanel {

    
    private SelectedMenu evento;
    
    private String UserName;
    private String UserFuncao;
    
    /**
     * Creates new form Menu
     */
    public Menu(String F, String N) {
        initComponents();
        setOpaque(false);
        listaMenu1.setOpaque(false);
        setUserName(N);
        setUserFuncao(F);
        initListaMenu();
    }
    
    public void addSelectedMenu(SelectedMenu sm){
        this.evento = sm;
        listaMenu1.addSelectedMenu(sm);
    }
    
    private void initListaMenu(){
        listaMenu1.addItem(new ModeloMenu("Cadastrar Pet", ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("Agendar Consulta", ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("Prontuario", ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("Estoque de Medicamentos", ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("Gestão de Funcionários", ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("", ModeloMenu.TipoMenu.EMPTY));
        listaMenu1.addItem(new ModeloMenu("User: " + getUserName(), ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("Função: " + getUserFuncao(), ModeloMenu.TipoMenu.MENU));
        listaMenu1.addItem(new ModeloMenu("", ModeloMenu.TipoMenu.EMPTY));    
        listaMenu1.addItem(new ModeloMenu("Logout", ModeloMenu.TipoMenu.MENU));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogo = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        listaMenu1 = new projeto_es2.ListaMenu<>();

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogo.setOpaque(false);

        LabelLogo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        LabelLogo.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_es2/Icons/logo1.png"))); // NOI18N

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        listaMenu1.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listaMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    protected void paintChildren(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gg = new GradientPaint(0,0,Color.decode("#a8e063"),0,getHeight(),Color.decode("#56ab2f"));
        g2.setPaint(gg);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    } 
    
    private int x;
    private int y;
    
    public void initMoving(JFrame f){
        
        PanelLogo.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent m){
                x = m.getX();
                y = m.getY();
            }
        });
        PanelLogo.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent m){
                f.setLocation(m.getXOnScreen()-x,m.getYOnScreen()-y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelLogo;
    private projeto_es2.ListaMenu<String> listaMenu1;
    // End of variables declaration//GEN-END:variables


    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the UserFuncao
     */
    public String getUserFuncao() {
        return UserFuncao;
    }

    /**
     * @param UserFuncao the UserFuncao to set
     */
    public void setUserFuncao(String UserFuncao) {
        this.UserFuncao = UserFuncao;
    }
}
