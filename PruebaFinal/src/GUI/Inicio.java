package GUI;

import Funcionamiento.Curso;
import Funcionamiento.Estudiante;
import Funcionamiento.ListaCursos;
import Funcionamiento.ListaEstudiantes;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Funcionamiento.*;
import MyContainers.ScrollBarCustom;

public class Inicio extends JFrame {
    private Estudiante estudiante;
    private boolean estadoPago = true;
    
    public Inicio(){
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        jl_nombre_usuario.setText("Visitante");
        jb_saldos_pagos.setVisible(false);
        jb_cursos.setVisible(false);
        jsp_boticias.setVerticalScrollBar(new ScrollBarCustom());
    }

    public Inicio(Estudiante estudiante) {
        initComponents();
        this.estudiante = estudiante;    
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        setUpEstudiante();
        jsp_boticias.setVerticalScrollBar(new ScrollBarCustom());
    }
    
    public Inicio(Estudiante estudiante, boolean estadoPago) {
        initComponents();
        this.estudiante = estudiante;  
        this.estadoPago = estadoPago;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        setUpEstudiante();
        jsp_boticias.setVerticalScrollBar(new ScrollBarCustom());
    }
    
    private void setUpEstudiante(){
        //Bienvenida Nombre_Completo
        jl_nombre_usuario.setText(estudiante.getNombreCompleto());
        
        //Logo del boton
        ImageIcon nuevaImagen;
        jb_fotocheck.setIcon(nuevaImagen = new ImageIcon(getClass().getResource(estudiante.getFotocheckPequeño())));
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public void confirmarPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
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
        jb_retroceder = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jl_nombre_usuario = new javax.swing.JLabel();
        jl_titulo_bienvenido = new javax.swing.JLabel();
        jp_panelBlancoCurva = new MyContainers.PanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jb_fotocheck = new javax.swing.JButton();
        jb_saldos_pagos = new javax.swing.JButton();
        jb_contacto = new javax.swing.JButton();
        jb_cursos = new javax.swing.JButton();
        jb_chatbot = new javax.swing.JButton();
        jl_titulo_uchill = new javax.swing.JLabel();
        jsp_boticias = new javax.swing.JScrollPane();
        jp_noticias = new javax.swing.JPanel();
        jl_foto_noticia1 = new javax.swing.JLabel();
        jl_text1_noticia1 = new javax.swing.JLabel();
        jl_text2_noticia1 = new javax.swing.JLabel();
        jl_text3_noticia1 = new javax.swing.JLabel();
        jl_text4_noticia1 = new javax.swing.JLabel();
        jl_foto_noticia2 = new javax.swing.JLabel();
        jl_text1_noticia2 = new javax.swing.JLabel();
        jl_text2_noticia2 = new javax.swing.JLabel();
        jl_text3_noticia2 = new javax.swing.JLabel();
        jl_text4_noticia2 = new javax.swing.JLabel();
        jl_foto_noticia3 = new javax.swing.JLabel();
        jl_text1_noticia3 = new javax.swing.JLabel();
        jl_text2_noticia3 = new javax.swing.JLabel();
        jl_text3_noticia3 = new javax.swing.JLabel();
        jl_text4_noticia3 = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        UltimaCapa.setOpaque(false);
        UltimaCapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_retroceder.setBackground(new java.awt.Color(38, 65, 115));
        jb_retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoApagado.png"))); // NOI18N
        jb_retroceder.setBorder(null);
        jb_retroceder.setContentAreaFilled(false);
        jb_retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_retrocederActionPerformed(evt);
            }
        });
        UltimaCapa.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

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

        jl_nombre_usuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jl_nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nombre_usuario.setText("Nombre_Usuario");
        jl_nombre_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UltimaCapa.add(jl_nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 280, -1));

        jl_titulo_bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jl_titulo_bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jl_titulo_bienvenido.setText("¡BIENVENIDO!");
        UltimaCapa.add(jl_titulo_bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 20, -1, -1));

        jp_panelBlancoCurva.setBackground(new java.awt.Color(232, 235, 241));
        jp_panelBlancoCurva.setRoundBottomLeft(50);
        jp_panelBlancoCurva.setRoundBottomRight(50);
        jp_panelBlancoCurva.setRoundTopLeft(80);
        jp_panelBlancoCurva.setRoundTopRight(80);
        jp_panelBlancoCurva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(41, 61, 109));
        jp_panelBlancoCurva.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 340, 10));

        jb_fotocheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotocheck60x60.png"))); // NOI18N
        jb_fotocheck.setBorder(null);
        jb_fotocheck.setBorderPainted(false);
        jb_fotocheck.setContentAreaFilled(false);
        jb_fotocheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_fotocheck.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_fotocheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fotocheckActionPerformed(evt);
            }
        });
        jp_panelBlancoCurva.add(jb_fotocheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        jb_saldos_pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoPagos35x35.png"))); // NOI18N
        jb_saldos_pagos.setBorder(null);
        jb_saldos_pagos.setBorderPainted(false);
        jb_saldos_pagos.setContentAreaFilled(false);
        jb_saldos_pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_saldos_pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saldos_pagosActionPerformed(evt);
            }
        });
        jp_panelBlancoCurva.add(jb_saldos_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 424, -1, -1));

        jb_contacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoContacto30x33.png"))); // NOI18N
        jb_contacto.setBorder(null);
        jb_contacto.setBorderPainted(false);
        jb_contacto.setContentAreaFilled(false);
        jb_contacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_contactoActionPerformed(evt);
            }
        });
        jp_panelBlancoCurva.add(jb_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 427, -1, -1));

        jb_cursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoCursos50x50.png"))); // NOI18N
        jb_cursos.setBorder(null);
        jb_cursos.setBorderPainted(false);
        jb_cursos.setContentAreaFilled(false);
        jb_cursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cursosActionPerformed(evt);
            }
        });
        jp_panelBlancoCurva.add(jb_cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 417, -1, -1));

        jb_chatbot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoChatbot70x75.png"))); // NOI18N
        jb_chatbot.setBorder(null);
        jb_chatbot.setBorderPainted(false);
        jb_chatbot.setContentAreaFilled(false);
        jb_chatbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_chatbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_chatbotActionPerformed(evt);
            }
        });
        jp_panelBlancoCurva.add(jb_chatbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 416, 50, 60));

        jl_titulo_uchill.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jl_titulo_uchill.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_uchill.setText("Las últimas en Uchill");
        jp_panelBlancoCurva.add(jl_titulo_uchill, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jsp_boticias.setBorder(null);
        jsp_boticias.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_boticias.setPreferredSize(new java.awt.Dimension(380, 300));

        jp_noticias.setBackground(new java.awt.Color(232, 235, 241));
        jp_noticias.setMinimumSize(new java.awt.Dimension(380, 320));
        jp_noticias.setPreferredSize(new java.awt.Dimension(380, 300));
        jp_noticias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_foto_noticia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotonoticia1_150x89.png"))); // NOI18N
        jl_foto_noticia1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jp_noticias.add(jl_foto_noticia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        jl_text1_noticia1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jl_text1_noticia1.setForeground(new java.awt.Color(41, 61, 109));
        jl_text1_noticia1.setText("USIL   gana   sede   del  CONEIA  2024   tras");
        jl_text1_noticia1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jp_noticias.add(jl_text1_noticia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, -1));

        jl_text2_noticia1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jl_text2_noticia1.setForeground(new java.awt.Color(41, 61, 109));
        jl_text2_noticia1.setText("destacada actuación en Cusco");
        jp_noticias.add(jl_text2_noticia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 170, -1));

        jl_text3_noticia1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 10)); // NOI18N
        jl_text3_noticia1.setForeground(new java.awt.Color(41, 61, 109));
        jl_text3_noticia1.setText("Estudiantes de Ingeniería Agroindustrial obtuvieron");
        jp_noticias.add(jl_text3_noticia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 240, -1));

        jl_text4_noticia1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 10)); // NOI18N
        jl_text4_noticia1.setForeground(new java.awt.Color(41, 61, 109));
        jl_text4_noticia1.setText("premios en dos categorías.");
        jp_noticias.add(jl_text4_noticia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 210, -1));

        jl_foto_noticia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotonoticia2_150x89.png"))); // NOI18N
        jl_foto_noticia2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jp_noticias.add(jl_foto_noticia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 150, -1));

        jl_text1_noticia2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jl_text1_noticia2.setForeground(new java.awt.Color(41, 61, 109));
        jl_text1_noticia2.setText("USIL   organizan   la   Semana   Mundial  del");
        jl_text1_noticia2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jp_noticias.add(jl_text1_noticia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 105, 260, -1));

        jl_text2_noticia2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jl_text2_noticia2.setForeground(new java.awt.Color(41, 61, 109));
        jl_text2_noticia2.setText("Emprendimiento ");
        jl_text2_noticia2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jp_noticias.add(jl_text2_noticia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 260, -1));

        jl_text3_noticia2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 10)); // NOI18N
        jl_text3_noticia2.setForeground(new java.awt.Color(41, 61, 109));
        jl_text3_noticia2.setText("Decimocuarto  año  consecutivo  que  se reliza este");
        jp_noticias.add(jl_text3_noticia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 145, 240, -1));

        jl_text4_noticia2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 10)); // NOI18N
        jl_text4_noticia2.setForeground(new java.awt.Color(41, 61, 109));
        jl_text4_noticia2.setText("importante evento en Perú.");
        jp_noticias.add(jl_text4_noticia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, -1));

        jl_foto_noticia3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotonoticia3_150x89.png"))); // NOI18N
        jl_foto_noticia3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jp_noticias.add(jl_foto_noticia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, -1));

        jl_text1_noticia3.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jl_text1_noticia3.setForeground(new java.awt.Color(41, 61, 109));
        jl_text1_noticia3.setText("USIL   organiza   Primer   Torneo   de   Judo");
        jl_text1_noticia3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jp_noticias.add(jl_text1_noticia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 260, -1));

        jl_text2_noticia3.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jl_text2_noticia3.setForeground(new java.awt.Color(41, 61, 109));
        jl_text2_noticia3.setText("Universitario");
        jl_text2_noticia3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jp_noticias.add(jl_text2_noticia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 225, 260, -1));

        jl_text3_noticia3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 10)); // NOI18N
        jl_text3_noticia3.setForeground(new java.awt.Color(41, 61, 109));
        jl_text3_noticia3.setText("Más  de  cien  atletas  competirán  este  sábado 11");
        jp_noticias.add(jl_text3_noticia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 240, -1));

        jl_text4_noticia3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 10)); // NOI18N
        jl_text4_noticia3.setForeground(new java.awt.Color(41, 61, 109));
        jl_text4_noticia3.setText("de noviembre en el coliseo de la USIL.");
        jp_noticias.add(jl_text4_noticia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 265, 240, -1));

        jsp_boticias.setViewportView(jp_noticias);

        jp_panelBlancoCurva.add(jsp_boticias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 310));

        UltimaCapa.add(jp_panelBlancoCurva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 490));

        fondoCurveadoDegradado1.setRoundBottomLeft(50);
        fondoCurveadoDegradado1.setRoundBottomRight(50);
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
            .addComponent(UltimaCapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UltimaCapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        // TODO add your handling code here:
        Login ventanaLogin = new Login(estadoPago);
        ventanaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_chatbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_chatbotActionPerformed
        ChatBot cb = new ChatBot(""); // Crea una instancia de la clase ChatBot
        cb.setSize(460, 620);
        cb.setLocationRelativeTo(null);
        cb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_chatbotActionPerformed

    private void jb_contactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_contactoActionPerformed
        // Pasa la instancia actual de Inicio a la clase Contactos
        Contactos ventanaContactos = new Contactos(estudiante, this);
        ventanaContactos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_contactoActionPerformed

    private void jb_saldos_pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saldos_pagosActionPerformed
        // TODO add your handling code here:
        SaldosYPagos ventanaSaldosYPagos = new SaldosYPagos(estudiante,this,estadoPago);
        ventanaSaldosYPagos.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jb_saldos_pagosActionPerformed

    private void jb_cursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cursosActionPerformed
        // Crear una instancia de ListaCursos
        ListaCursos listaCursos = new ListaCursos();
        ListaEstudiantes l_us = new ListaEstudiantes();

        // Obtener la lista de cursos
        List<Curso> cursos = listaCursos.getCursos();

        // Crear una instancia de la ventana Cursos y pasar la lista de cursos
        Cursos ventanaCursos = new Cursos(estudiante, this, cursos);

        // Hacer visible la ventana Cursos y ocultar la ventana actual
        ventanaCursos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_cursosActionPerformed

    private void jb_fotocheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_fotocheckActionPerformed
        Fotocheck ventanaFotocheck = new Fotocheck(estudiante,  this);
        ventanaFotocheck.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_fotocheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UltimaCapa;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_chatbot;
    private javax.swing.JButton jb_contacto;
    private javax.swing.JButton jb_cursos;
    private javax.swing.JButton jb_fotocheck;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JButton jb_saldos_pagos;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_foto_noticia1;
    private javax.swing.JLabel jl_foto_noticia2;
    private javax.swing.JLabel jl_foto_noticia3;
    private javax.swing.JLabel jl_nombre_usuario;
    private javax.swing.JLabel jl_text1_noticia1;
    private javax.swing.JLabel jl_text1_noticia2;
    private javax.swing.JLabel jl_text1_noticia3;
    private javax.swing.JLabel jl_text2_noticia1;
    private javax.swing.JLabel jl_text2_noticia2;
    private javax.swing.JLabel jl_text2_noticia3;
    private javax.swing.JLabel jl_text3_noticia1;
    private javax.swing.JLabel jl_text3_noticia2;
    private javax.swing.JLabel jl_text3_noticia3;
    private javax.swing.JLabel jl_text4_noticia1;
    private javax.swing.JLabel jl_text4_noticia2;
    private javax.swing.JLabel jl_text4_noticia3;
    private javax.swing.JLabel jl_titulo_bienvenido;
    private javax.swing.JLabel jl_titulo_uchill;
    private javax.swing.JPanel jp_noticias;
    private MyContainers.PanelRound jp_panelBlancoCurva;
    private javax.swing.JScrollPane jsp_boticias;
    // End of variables declaration//GEN-END:variables
}
