package GUI;

import Funcionamiento.Usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Funcionamiento.Tarjeta;
import javax.swing.JOptionPane;
import GUI.MetodoDePago;

public class SaldosYPagos extends JFrame {
    
    private Usuario usuario;
    private Inicio ventanaInicio;
    private Tarjeta tarjeta;
    private String valorOriginalMensualidad5;
    private MetodoDePago metodo;

    
  
    public SaldosYPagos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        botonPagar.setVisible(false);
        jLabel2.setVisible(false);
        
        
        
        jCheckBoxPagar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBoxPagarActionPerformed(evt);
                }
    });
        
    }
    
    public SaldosYPagos(Usuario us, Inicio inicio) {
        initComponents();
        this.usuario = us;
        this.ventanaInicio = inicio;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        setUpUsuario();
        jLabel2.setVisible(false);
        panelRound4.setVisible(false);
        
        jCheckBoxPagar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBoxPagarActionPerformed(evt);
                }
    });
        
    }
        private void setUpUsuario(){
        //cuota y codigoCuota
        jmensualidad4.setText(usuario.getMensualidad());
        jmensualidad1.setText(usuario.getMensualidad());
        jmensualidad2.setText(usuario.getMensualidad());
        jmensualidad3.setText(usuario.getMensualidad());
        jmensualidad5a.setText(usuario.getMensualidad());
        jmensualidad7.setText(usuario.getMensualidad());
        jcodigoCuota.setText(usuario.getCodigoCuota());
        valorOriginalMensualidad5 = jmensualidad5.getText();
    }
        
         public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound7 = new MyContainers.PanelRound();
        As7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_cursos_titulo = new javax.swing.JLabel();
        jb_retroceder = new javax.swing.JButton();
        panelRound1 = new MyContainers.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        panelRound4 = new MyContainers.PanelRound();
        As4 = new javax.swing.JLabel();
        cuota5 = new javax.swing.JLabel();
        jmensualidad5a = new javax.swing.JLabel();
        panelRound5 = new MyContainers.PanelRound();
        As5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jmensualidad1 = new javax.swing.JLabel();
        panelRound6 = new MyContainers.PanelRound();
        As6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jmensualidad2 = new javax.swing.JLabel();
        panelRound8 = new MyContainers.PanelRound();
        As8 = new javax.swing.JLabel();
        cuota3 = new javax.swing.JLabel();
        jmensualidad3 = new javax.swing.JLabel();
        panelRound15 = new MyContainers.PanelRound();
        As10 = new javax.swing.JLabel();
        cuota4 = new javax.swing.JLabel();
        jmensualidad4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jmensualidad5 = new javax.swing.JLabel();
        botonPagar = new MyContainers.BotonCustomLogin();
        jLabel15 = new javax.swing.JLabel();
        jcodigoCuota = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelRound9 = new MyContainers.PanelRound();
        As9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxPagar = new javax.swing.JCheckBox();
        jmensualidad7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        panelRound7.setBackground(new java.awt.Color(204, 204, 204));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);
        panelRound7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As7.setForeground(new java.awt.Color(41, 61, 109));
        panelRound7.add(As7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("CUOTA 3");
        panelRound7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("S/1000.00");
        panelRound7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 12, 90, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_cursos_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_cursos_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_cursos_titulo.setText("SALDOS Y PAGOS");
        jPanel2.add(jl_cursos_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, -1, -1));

        jb_retroceder.setBackground(new java.awt.Color(38, 65, 115));
        jb_retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackIcon.png"))); // NOI18N
        jb_retroceder.setBorder(null);
        jb_retroceder.setContentAreaFilled(false);
        jb_retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_retrocederActionPerformed(evt);
            }
        });
        jPanel2.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        panelRound1.setBackground(new java.awt.Color(232, 235, 241));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(80);
        panelRound1.setRoundTopRight(80);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("PAGOS");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(232, 235, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound4.setBackground(new java.awt.Color(204, 204, 204));
        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As4.setForeground(new java.awt.Color(41, 61, 109));
        panelRound4.add(As4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        cuota5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cuota5.setForeground(new java.awt.Color(0, 0, 102));
        cuota5.setText("CUOTA 5");
        panelRound4.add(cuota5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jmensualidad5a.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad5a.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad5a.setText("precio5");
        panelRound4.add(jmensualidad5a, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 12, 90, 30));

        jPanel3.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 350, 390, 60));

        panelRound5.setBackground(new java.awt.Color(204, 204, 204));
        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As5.setForeground(new java.awt.Color(41, 61, 109));
        panelRound5.add(As5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("CUOTA 1");
        panelRound5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jmensualidad1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad1.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad1.setText("precio1");
        panelRound5.add(jmensualidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 12, 90, 30));

        jPanel3.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 390, 60));

        panelRound6.setBackground(new java.awt.Color(204, 204, 204));
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As6.setForeground(new java.awt.Color(41, 61, 109));
        panelRound6.add(As6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("CUOTA 2");
        panelRound6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jmensualidad2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad2.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad2.setText("precio2");
        panelRound6.add(jmensualidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 12, 90, 30));

        jPanel3.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 390, 60));

        panelRound8.setBackground(new java.awt.Color(204, 204, 204));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As8.setForeground(new java.awt.Color(41, 61, 109));
        panelRound8.add(As8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        cuota3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cuota3.setForeground(new java.awt.Color(0, 0, 102));
        cuota3.setText("CUOTA 3");
        panelRound8.add(cuota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jmensualidad3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad3.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad3.setText("precio3");
        panelRound8.add(jmensualidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 12, 90, 30));

        jPanel3.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, 390, 60));

        panelRound15.setBackground(new java.awt.Color(204, 204, 204));
        panelRound15.setRoundBottomLeft(20);
        panelRound15.setRoundBottomRight(20);
        panelRound15.setRoundTopLeft(20);
        panelRound15.setRoundTopRight(20);
        panelRound15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As10.setForeground(new java.awt.Color(41, 61, 109));
        panelRound15.add(As10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        cuota4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cuota4.setForeground(new java.awt.Color(0, 0, 102));
        cuota4.setText("CUOTA 4");
        panelRound15.add(cuota4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jmensualidad4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad4.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad4.setText("precio4");
        panelRound15.add(jmensualidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 12, 90, 30));

        jPanel3.add(panelRound15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 390, 60));

        jScrollPane1.setViewportView(jPanel3);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 200, 430, 150));

        jSeparator1.setForeground(new java.awt.Color(41, 61, 109));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 338, 340, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Monto:");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 395, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Documento:");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, -1));

        jmensualidad5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad5.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad5.setText("S/0.00");
        panelRound1.add(jmensualidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        botonPagar.setText("PAGAR");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });
        panelRound1.add(botonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 425, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("PAGO POR REALIZAR");
        panelRound1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jcodigoCuota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcodigoCuota.setForeground(new java.awt.Color(0, 0, 102));
        jcodigoCuota.setText("CO 1234567");
        panelRound1.add(jcodigoCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("HISTORIAL");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, 100, 20));

        panelRound9.setBackground(new java.awt.Color(204, 204, 204));
        panelRound9.setRoundBottomLeft(20);
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopLeft(20);
        panelRound9.setRoundTopRight(20);
        panelRound9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        As9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        As9.setForeground(new java.awt.Color(41, 61, 109));
        panelRound9.add(As9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("CUOTA 1");
        panelRound9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 110, -1));

        jCheckBoxPagar.setBackground(new java.awt.Color(204, 204, 204));
        panelRound9.add(jCheckBoxPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 20, -1, -1));

        jmensualidad7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jmensualidad7.setForeground(new java.awt.Color(0, 0, 102));
        jmensualidad7.setText("precio1");
        panelRound9.add(jmensualidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 12, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("NO CUENTA CON NINGÚN PAGO EN ESTE MOMENTO.");
        panelRound9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelRound1.add(panelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, 390, 60));

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 490));

        fondoCurveadoDegradado1.setRoundTopLeft(50);
        fondoCurveadoDegradado1.setRoundTopRight(50);
        fondoCurveadoDegradado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        // Crea una nueva instancia de Inicio con los datos originales
        ventanaInicio.setUsuario(usuario);
        ventanaInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void jCheckBoxPagarActionPerformed(java.awt.event.ActionEvent evt) {                                              
    if (jCheckBoxPagar.isSelected()) {
        jmensualidad5.setText(jmensualidad7.getText());
    } else {
        jmensualidad5.setText(valorOriginalMensualidad5);
    }
} 
    
    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        // TODO add your handling code here:
    
    if(jCheckBoxPagar.isSelected()) {    
        MetodoDePago ventanaMetodoDePago = new MetodoDePago(tarjeta, this, usuario);
        ventanaMetodoDePago.setVisible(true);
        this.setVisible(false);
        jLabel7.setVisible(false);
        jmensualidad7.setVisible(false);
        jCheckBoxPagar.setVisible(false);
        jLabel2.setVisible(true);
        panelRound4.setVisible(true);
    } else {
         JOptionPane.showMessageDialog(this, "Seleccione la cuota.");
         jmensualidad5.setText(valorOriginalMensualidad5);
    }
    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
    
        if(jCheckBoxPagar.isSelected()) {    
            MetodoDePago ventanaMetodoDePago = new MetodoDePago(tarjeta,this,usuario);
            ventanaMetodoDePago.setVisible(true);
            this.setVisible(false);
            jLabel7.setVisible(false);
            jmensualidad7.setVisible(false);
            jCheckBoxPagar.setVisible(false);
            jLabel2.setVisible(true);
            panelRound4.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione la cuota.");
            jmensualidad5.setText(valorOriginalMensualidad5);
        }
    }
    
    public void mostrarElementosRetroceso() {
    jLabel7.setVisible(true);
    jmensualidad7.setVisible(true);
    jCheckBoxPagar.setVisible(true);
}
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel As10;
    private javax.swing.JLabel As4;
    private javax.swing.JLabel As5;
    private javax.swing.JLabel As6;
    private javax.swing.JLabel As7;
    private javax.swing.JLabel As8;
    private javax.swing.JLabel As9;
    private MyContainers.BotonCustomLogin botonPagar;
    private javax.swing.JLabel cuota3;
    private javax.swing.JLabel cuota4;
    private javax.swing.JLabel cuota5;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JCheckBox jCheckBoxPagar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JLabel jcodigoCuota;
    private javax.swing.JLabel jl_cursos_titulo;
    private javax.swing.JLabel jmensualidad1;
    private javax.swing.JLabel jmensualidad2;
    private javax.swing.JLabel jmensualidad3;
    private javax.swing.JLabel jmensualidad4;
    private javax.swing.JLabel jmensualidad5;
    private javax.swing.JLabel jmensualidad5a;
    private javax.swing.JLabel jmensualidad7;
    private MyContainers.PanelRound panelRound1;
    private MyContainers.PanelRound panelRound15;
    private MyContainers.PanelRound panelRound4;
    private MyContainers.PanelRound panelRound5;
    private MyContainers.PanelRound panelRound6;
    private MyContainers.PanelRound panelRound7;
    private MyContainers.PanelRound panelRound8;
    private MyContainers.PanelRound panelRound9;
    // End of variables declaration//GEN-END:variables
}
