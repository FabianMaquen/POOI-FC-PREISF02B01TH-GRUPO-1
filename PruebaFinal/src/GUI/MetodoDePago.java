package GUI;

import Funcionamiento.ListaTarjetas;
import Funcionamiento.Tarjeta;
import Funcionamiento.Usuario;
import java.awt.Color;
import javax.swing.JFrame;
import GUI.SaldosYPagos;
import java.util.ArrayList;
import java.util.List;

public class MetodoDePago extends JFrame {

    private Tarjeta tarjeta;
    private Usuario usuario;
    private SaldosYPagos ventanaSaldosYPagos;
    private ListaTarjetas listaTarjetas;
    private SaldosYPagos saldosYPagos;
 
    public MetodoDePago() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        this.listaTarjetas = new ListaTarjetas();
    }

    public MetodoDePago(Tarjeta tar, SaldosYPagos saldosYPagos, Usuario us) {
        initComponents();
        this.usuario = us;
        this.tarjeta = tar;
        this.ventanaSaldosYPagos = saldosYPagos;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
         this.listaTarjetas = new ListaTarjetas();
    }

    public MetodoDePago(Usuario us, SaldosYPagos saldosYPagos) {
        initComponents();
        this.usuario = us;
        this.ventanaSaldosYPagos = saldosYPagos;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
 
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

        jPanel2 = new javax.swing.JPanel();
        jl_cursos_titulo = new javax.swing.JLabel();
        jb_retroceder1 = new javax.swing.JButton();
        panelRound1 = new MyContainers.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jNombreTarjeta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNumeroTarjeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jmes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        janho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCVV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonConfirmar = new MyContainers.BotonCustomLogin();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_cursos_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_cursos_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_cursos_titulo.setText("Método de Pago");
        jPanel2.add(jl_cursos_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 30, -1, -1));

        jb_retroceder1.setBackground(new java.awt.Color(38, 65, 115));
        jb_retroceder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackIcon.png"))); // NOI18N
        jb_retroceder1.setBorder(null);
        jb_retroceder1.setContentAreaFilled(false);
        jb_retroceder1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_retroceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_retroceder1ActionPerformed(evt);
            }
        });
        jPanel2.add(jb_retroceder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        panelRound1.setBackground(new java.awt.Color(232, 235, 241));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(80);
        panelRound1.setRoundTopRight(80);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nombre del Titular de la Tarjeta ");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 280, -1));

        jNombreTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jNombreTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreTarjetaActionPerformed(evt);
            }
        });
        panelRound1.add(jNombreTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 380, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Número  de Tarjeta");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        panelRound1.add(jNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 380, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Vencimiento");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmesActionPerformed(evt);
            }
        });
        panelRound1.add(jmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("/");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 225, -1, -1));
        panelRound1.add(janho, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 235, 70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("CVV");
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, 30));
        panelRound1.add(jCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 235, 90, 30));

        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Aceptamos las principales tarjetas de crédito");
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        botonConfirmar.setText("Confirmar");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });
        panelRound1.add(botonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visalogo (1).png"))); // NOI18N
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 295, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mastercard (1) (1).png"))); // NOI18N
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 50, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-American-Express (1).png"))); // NOI18N
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 50, 40));

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 440, 390));

        fondoCurveadoDegradado1.setRoundTopLeft(50);
        fondoCurveadoDegradado1.setRoundTopRight(50);
        fondoCurveadoDegradado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 270));

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

    private void jb_retroceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retroceder1ActionPerformed
        // Crea una nueva instancia de Inicio con los datos originales
        
        
        ventanaSaldosYPagos.setUsuario(usuario);
        ventanaSaldosYPagos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retroceder1ActionPerformed

    private void jNombreTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreTarjetaActionPerformed

    private void jmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmesActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
        
        String nombre = jNombreTarjeta.getText();
        String nroCuenta = jNumeroTarjeta.getText();
        String mes = jmes.getText();
        String anho = janho.getText();
        String CVV = jCVV.getText();

        // Crear una tarjeta con la información ingresada
        Tarjeta tarjetaIngresada = new Tarjeta(nombre, nroCuenta, mes, anho, CVV);

        // Verificar si la tarjeta está en la lista
        if (this.listaTarjetas.getTarjeta().contains(tarjetaIngresada)) {
            //Aca debería aparecer el aviso de pago exitoso
            PagoExitoso ventanaPagoExitoso = new PagoExitoso(this.usuario, this.ventanaSaldosYPagos);
            ventanaPagoExitoso.setVisible(true);
            this.setVisible(false);
            
        } else {
            // Aca el de Error 
            TransaccionFallida ventanaTransaccionFallida = new TransaccionFallida(usuario, this);
            ventanaTransaccionFallida.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_botonConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MyContainers.BotonCustomLogin botonConfirmar;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JTextField jCVV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNombreTarjeta;
    private javax.swing.JTextField jNumeroTarjeta;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField janho;
    private javax.swing.JButton jb_retroceder1;
    private javax.swing.JLabel jl_cursos_titulo;
    private javax.swing.JTextField jmes;
    private MyContainers.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}