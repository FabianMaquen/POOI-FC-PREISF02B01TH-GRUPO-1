package GUI;

import Funcionamiento.Estudiante;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

public class Fotocheck extends javax.swing.JFrame implements Runnable {
    private Estudiante estudiante;
    private Inicio ventanaInicio;
    String hora, minutos, segundos;
    Thread hilo; 

    public Fotocheck (Estudiante estudiante, Inicio inicio) {
        initComponents();
        this.estudiante = estudiante;
        this.ventanaInicio = inicio;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        setUpUsuario();
        jl_fecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    private void setUpUsuario(){
        //Nombre de usuario
        jl_nombre_usuario.setText(estudiante.getNombreCompleto());
        
        //Codigo del alumno
        jl_codigo_alumno.setText(estudiante.getCodigoEstudiante());
        
        //Logo del boton
        ImageIcon nuevaImagen;
        jl_logo_usuario.setIcon(nuevaImagen = new ImageIcon(getClass().getResource(estudiante.getFotocheckGrande())));
        jl_qr_usuario.setIcon(nuevaImagen = new ImageIcon(getClass().getResource(estudiante.getQR_Usuario())));
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    @Override
    public void run(){
        Thread current = Thread.currentThread();
        while(current == hilo){
            hora();
            jl_hora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UltimaCapa = new javax.swing.JPanel();
        jb_salir = new javax.swing.JButton();
        jb_retroceder = new javax.swing.JButton();
        jl_fotocheck = new javax.swing.JLabel();
        panelBlancoCurva = new MyContainers.PanelRound();
        jl_nombre_usuario = new javax.swing.JLabel();
        jl_codigo_alumno = new javax.swing.JLabel();
        jl_fecha = new javax.swing.JLabel();
        jl_hora = new javax.swing.JLabel();
        jl_logo_usuario = new javax.swing.JLabel();
        jl_qr_usuario = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        UltimaCapa.setMinimumSize(new java.awt.Dimension(490, 490));
        UltimaCapa.setOpaque(false);
        UltimaCapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_salir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoSalir35x35.png"))); // NOI18N
        jb_salir.setBorder(null);
        jb_salir.setBorderPainted(false);
        jb_salir.setContentAreaFilled(false);
        jb_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_salir.setFocusPainted(false);
        jb_salir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        UltimaCapa.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 20, 30, -1));

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
        UltimaCapa.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        jl_fotocheck.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_fotocheck.setForeground(new java.awt.Color(255, 255, 255));
        jl_fotocheck.setText("FOTOCHECK");
        UltimaCapa.add(jl_fotocheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 30, -1, -1));

        panelBlancoCurva.setBackground(new java.awt.Color(232, 235, 241));
        panelBlancoCurva.setRoundBottomLeft(50);
        panelBlancoCurva.setRoundBottomRight(50);
        panelBlancoCurva.setRoundTopLeft(80);
        panelBlancoCurva.setRoundTopRight(80);
        panelBlancoCurva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nombre_usuario.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jl_nombre_usuario.setForeground(new java.awt.Color(41, 61, 109));
        jl_nombre_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nombre_usuario.setText("Nombre_De_Usuario");
        jl_nombre_usuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl_nombre_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jl_nombre_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBlancoCurva.add(jl_nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 29, 392, -1));
        jl_nombre_usuario.getAccessibleContext().setAccessibleParent(UltimaCapa);

        jl_codigo_alumno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jl_codigo_alumno.setForeground(new java.awt.Color(41, 61, 109));
        jl_codigo_alumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_codigo_alumno.setText("Codigo_Alumno");
        jl_codigo_alumno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelBlancoCurva.add(jl_codigo_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 65, 128, -1));

        jl_fecha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jl_fecha.setForeground(new java.awt.Color(41, 61, 109));
        jl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_fecha.setText("DD/MM/AAAA");
        jl_fecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl_fecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBlancoCurva.add(jl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 405, 128, -1));

        jl_hora.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jl_hora.setForeground(new java.awt.Color(41, 61, 109));
        jl_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_hora.setText("HH:MM:SS");
        jl_hora.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jl_hora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBlancoCurva.add(jl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 427, 128, -1));

        jl_logo_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_logo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoPersona95x95.png"))); // NOI18N
        jl_logo_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jl_logo_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBlancoCurva.add(jl_logo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 93, 128, 103));

        jl_qr_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_qr_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CodigoQRFotocheck.png"))); // NOI18N
        jl_qr_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelBlancoCurva.add(jl_qr_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 214, 176, -1));

        UltimaCapa.add(panelBlancoCurva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 490));

        fondoCurveadoDegradado1.setRoundTopLeft(50);
        fondoCurveadoDegradado1.setRoundTopRight(50);

        javax.swing.GroupLayout fondoCurveadoDegradado1Layout = new javax.swing.GroupLayout(fondoCurveadoDegradado1);
        fondoCurveadoDegradado1.setLayout(fondoCurveadoDegradado1Layout);
        fondoCurveadoDegradado1Layout.setHorizontalGroup(
            fondoCurveadoDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        fondoCurveadoDegradado1Layout.setVerticalGroup(
            fondoCurveadoDegradado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        UltimaCapa.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UltimaCapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UltimaCapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        // Crea una nueva instancia de Inicio con los datos originales
        ventanaInicio.setEstudiante(estudiante);
        ventanaInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UltimaCapa;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_codigo_alumno;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_fotocheck;
    private javax.swing.JLabel jl_hora;
    private javax.swing.JLabel jl_logo_usuario;
    private javax.swing.JLabel jl_nombre_usuario;
    private javax.swing.JLabel jl_qr_usuario;
    private MyContainers.PanelRound panelBlancoCurva;
    // End of variables declaration//GEN-END:variables
}
