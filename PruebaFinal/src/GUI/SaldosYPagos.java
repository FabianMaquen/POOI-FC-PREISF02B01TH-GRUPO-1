package GUI;

import Funcionamiento.Estudiante;
import java.awt.Color;
import javax.swing.JFrame;
import Funcionamiento.Tarjeta;
import MyContainers.ScrollBarCustom;
import java.awt.Dimension;
import javax.swing.UIManager;

public final class SaldosYPagos extends JFrame {
    
    private Estudiante estudiante;
    private Inicio ventanaInicio;
    private Tarjeta tarjeta;
    private String valorOriginalMensualidad5;
    private MetodoDePago metodo;
    private boolean estadoPago;
  
    public SaldosYPagos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        jb_pagar.setVisible(false);
        jl_aviso_sincuotas.setVisible(false);
    }
    
    public SaldosYPagos(Estudiante es, Inicio inicio, boolean estPago) {
        initComponents();
        this.estudiante = es;
        this.ventanaInicio = inicio;
        this.estadoPago = estPago;
        estadoCuotaFaltante(estadoPago);
        jb_pagar.setEnabled(false);
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
        setUpEstudiante();
        
        jl_monto_pagar.setText(valorOriginalMensualidad5);
        jsp_historial_pagos.setVerticalScrollBar(new ScrollBarCustom());
        jsp_pagos_faltantes.setVerticalScrollBar(new ScrollBarCustom());
        UIManager.put("Button.disabledText", new Color(196,205,219)); // color de letra del boton deshabilitado
        
    }
        private void setUpEstudiante(){
        //cuota y codigoCuota
        jl_mensualidad_C4.setText(estudiante.getMensualidad());
        jl_mensualidad_C1.setText(estudiante.getMensualidad());
        jl_mensualidad_C2.setText(estudiante.getMensualidad());
        jl_mensualidad_C3.setText(estudiante.getMensualidad());
        jl_mensualidad_C5.setText(estudiante.getMensualidad());
        jl_mensualidad_faltante.setText(estudiante.getMensualidad());
        jl_codigoCuota.setText(estudiante.getCodigoCuota());
        valorOriginalMensualidad5 = jl_monto_pagar.getText();
        
    }
        
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public void estadoCuotaFaltante(boolean estPago) { // si es falso se elimina la cuota y sale el aviso
        this.estadoPago = estPago;
        jp_cuota_faltante.setVisible(estadoPago);
        jl_aviso_sincuotas.setVisible(!estadoPago);
        jp_cuota_5.setVisible(!estadoPago);
        jb_pagar.setEnabled(estadoPago);
        if(!estadoPago){
            jp_historial_completo.setPreferredSize(new Dimension(380, 360));
        }
    }
    
    public void restaurarEstadoBotonPagar() {
        jb_pagar.setEnabled(false);
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
        ultimoPanel = new javax.swing.JPanel();
        jb_salir = new javax.swing.JButton();
        jl_cursos_titulo = new javax.swing.JLabel();
        jb_retroceder = new javax.swing.JButton();
        jl_aviso_sincuotas = new javax.swing.JLabel();
        jp_panelBlancoCurva = new MyContainers.PanelRound();
        jl_titulo_pagos = new javax.swing.JLabel();
        jsp_pagos_faltantes = new javax.swing.JScrollPane();
        jp_pagos_faltantes = new javax.swing.JPanel();
        jp_cuota_faltante = new MyContainers.PanelRound();
        jcb_cuota_pagar = new MyContainers.JCheckBoxCustom();
        jl_cuota_faltante = new javax.swing.JLabel();
        jl_mensualidad_faltante = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jl_titulo_historial = new javax.swing.JLabel();
        jsp_historial_pagos = new javax.swing.JScrollPane();
        jp_historial_completo = new javax.swing.JPanel();
        jp_cuota_5 = new MyContainers.PanelRound();
        jl_titulo_C5 = new javax.swing.JLabel();
        jl_mensualidad_C5 = new javax.swing.JLabel();
        jp_cuota_1 = new MyContainers.PanelRound();
        jl_titulo_C1 = new javax.swing.JLabel();
        jl_mensualidad_C1 = new javax.swing.JLabel();
        jp_cuota_2 = new MyContainers.PanelRound();
        jl_titulo_C2 = new javax.swing.JLabel();
        jl_mensualidad_C2 = new javax.swing.JLabel();
        jp_cuota_3 = new MyContainers.PanelRound();
        jl_titulo_C3 = new javax.swing.JLabel();
        jl_mensualidad_C3 = new javax.swing.JLabel();
        jp_cuota_4 = new MyContainers.PanelRound();
        jl_titulo_C4 = new javax.swing.JLabel();
        jl_mensualidad_C4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jl_titulo_pago_realizar = new javax.swing.JLabel();
        jl_titulo_documento = new javax.swing.JLabel();
        jl_codigoCuota = new javax.swing.JLabel();
        jl_monto_pagar = new javax.swing.JLabel();
        jb_pagar = new MyContainers.BotonCustomLogin();
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

        ultimoPanel.setOpaque(false);
        ultimoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        ultimoPanel.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 20, 30, -1));

        jl_cursos_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_cursos_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_cursos_titulo.setText("SALDOS Y PAGOS");
        ultimoPanel.add(jl_cursos_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 30, -1, -1));

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
        ultimoPanel.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        jl_aviso_sincuotas.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jl_aviso_sincuotas.setForeground(new java.awt.Color(0, 0, 102));
        jl_aviso_sincuotas.setText("No cuenta con ningún pago en este momento.");
        ultimoPanel.add(jl_aviso_sincuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 178, -1, 25));

        jp_panelBlancoCurva.setBackground(new java.awt.Color(232, 235, 241));
        jp_panelBlancoCurva.setRoundBottomLeft(50);
        jp_panelBlancoCurva.setRoundBottomRight(50);
        jp_panelBlancoCurva.setRoundTopLeft(80);
        jp_panelBlancoCurva.setRoundTopRight(80);
        jp_panelBlancoCurva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_pagos.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jl_titulo_pagos.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_pagos.setText("PAGOS");
        jp_panelBlancoCurva.add(jl_titulo_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, 100, 20));

        jsp_pagos_faltantes.setBorder(null);
        jsp_pagos_faltantes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jp_pagos_faltantes.setBackground(new java.awt.Color(232, 235, 241));
        jp_pagos_faltantes.setMinimumSize(new java.awt.Dimension(380, 60));
        jp_pagos_faltantes.setPreferredSize(new java.awt.Dimension(380, 60));
        jp_pagos_faltantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_cuota_faltante.setBackground(new java.awt.Color(196, 205, 219));
        jp_cuota_faltante.setRoundBottomLeft(20);
        jp_cuota_faltante.setRoundBottomRight(20);
        jp_cuota_faltante.setRoundTopLeft(20);
        jp_cuota_faltante.setRoundTopRight(20);
        jp_cuota_faltante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcb_cuota_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_cuota_pagarActionPerformed(evt);
            }
        });
        jcb_cuota_pagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcb_cuota_pagarKeyReleased(evt);
            }
        });
        jp_cuota_faltante.add(jcb_cuota_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jl_cuota_faltante.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_cuota_faltante.setForeground(new java.awt.Color(0, 0, 102));
        jl_cuota_faltante.setText("CUOTA 5");
        jp_cuota_faltante.add(jl_cuota_faltante, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 110, -1));

        jl_mensualidad_faltante.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_mensualidad_faltante.setForeground(new java.awt.Color(0, 0, 102));
        jl_mensualidad_faltante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_mensualidad_faltante.setText("precio1");
        jp_cuota_faltante.add(jl_mensualidad_faltante, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 13, 90, 30));

        jp_pagos_faltantes.add(jp_cuota_faltante, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 360, 60));

        jsp_pagos_faltantes.setViewportView(jp_pagos_faltantes);

        jp_panelBlancoCurva.add(jsp_pagos_faltantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 60));

        jSeparator1.setForeground(new java.awt.Color(41, 61, 109));
        jp_panelBlancoCurva.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 360, 10));

        jl_titulo_historial.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jl_titulo_historial.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_historial.setText("HISTORIAL");
        jp_panelBlancoCurva.add(jl_titulo_historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 155, 100, 20));

        jsp_historial_pagos.setBorder(null);
        jsp_historial_pagos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jp_historial_completo.setBackground(new java.awt.Color(232, 235, 241));
        jp_historial_completo.setEnabled(false);
        jp_historial_completo.setMinimumSize(new java.awt.Dimension(380, 360));
        jp_historial_completo.setPreferredSize(new java.awt.Dimension(380, 285));
        jp_historial_completo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_cuota_5.setBackground(new java.awt.Color(196, 205, 219));
        jp_cuota_5.setRoundBottomLeft(20);
        jp_cuota_5.setRoundBottomRight(20);
        jp_cuota_5.setRoundTopLeft(20);
        jp_cuota_5.setRoundTopRight(20);
        jp_cuota_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_C5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_titulo_C5.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_C5.setText("CUOTA 5");
        jp_cuota_5.add(jl_titulo_C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 110, -1));

        jl_mensualidad_C5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_mensualidad_C5.setForeground(new java.awt.Color(0, 0, 102));
        jl_mensualidad_C5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_mensualidad_C5.setText("precio5");
        jp_cuota_5.add(jl_mensualidad_C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 12, 90, 30));

        jp_historial_completo.add(jp_cuota_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, 360, 60));

        jp_cuota_1.setBackground(new java.awt.Color(196, 205, 219));
        jp_cuota_1.setRoundBottomLeft(20);
        jp_cuota_1.setRoundBottomRight(20);
        jp_cuota_1.setRoundTopLeft(20);
        jp_cuota_1.setRoundTopRight(20);
        jp_cuota_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_C1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_titulo_C1.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_C1.setText("CUOTA 1");
        jp_cuota_1.add(jl_titulo_C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 110, -1));

        jl_mensualidad_C1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_mensualidad_C1.setForeground(new java.awt.Color(0, 0, 102));
        jl_mensualidad_C1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_mensualidad_C1.setText("precio1");
        jp_cuota_1.add(jl_mensualidad_C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 12, 90, 30));

        jp_historial_completo.add(jp_cuota_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 360, 60));

        jp_cuota_2.setBackground(new java.awt.Color(196, 205, 219));
        jp_cuota_2.setRoundBottomLeft(20);
        jp_cuota_2.setRoundBottomRight(20);
        jp_cuota_2.setRoundTopLeft(20);
        jp_cuota_2.setRoundTopRight(20);
        jp_cuota_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_C2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_titulo_C2.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_C2.setText("CUOTA 2");
        jp_cuota_2.add(jl_titulo_C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 110, -1));

        jl_mensualidad_C2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_mensualidad_C2.setForeground(new java.awt.Color(0, 0, 102));
        jl_mensualidad_C2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_mensualidad_C2.setText("precio2");
        jp_cuota_2.add(jl_mensualidad_C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 12, 90, 30));

        jp_historial_completo.add(jp_cuota_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 75, 360, 60));

        jp_cuota_3.setBackground(new java.awt.Color(196, 205, 219));
        jp_cuota_3.setRoundBottomLeft(20);
        jp_cuota_3.setRoundBottomRight(20);
        jp_cuota_3.setRoundTopLeft(20);
        jp_cuota_3.setRoundTopRight(20);
        jp_cuota_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_C3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_titulo_C3.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_C3.setText("CUOTA 3");
        jp_cuota_3.add(jl_titulo_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 110, -1));

        jl_mensualidad_C3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_mensualidad_C3.setForeground(new java.awt.Color(0, 0, 102));
        jl_mensualidad_C3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_mensualidad_C3.setText("precio3");
        jp_cuota_3.add(jl_mensualidad_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 12, 90, 30));

        jp_historial_completo.add(jp_cuota_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 360, 60));

        jp_cuota_4.setBackground(new java.awt.Color(196, 205, 219));
        jp_cuota_4.setRoundBottomLeft(20);
        jp_cuota_4.setRoundBottomRight(20);
        jp_cuota_4.setRoundTopLeft(20);
        jp_cuota_4.setRoundTopRight(20);
        jp_cuota_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_C4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_titulo_C4.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_C4.setText("CUOTA 4");
        jp_cuota_4.add(jl_titulo_C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 110, -1));

        jl_mensualidad_C4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jl_mensualidad_C4.setForeground(new java.awt.Color(0, 0, 102));
        jl_mensualidad_C4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_mensualidad_C4.setText("precio4");
        jp_cuota_4.add(jl_mensualidad_C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 12, 90, 30));

        jp_historial_completo.add(jp_cuota_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 225, 360, 60));

        jsp_historial_pagos.setViewportView(jp_historial_completo);

        jp_panelBlancoCurva.add(jsp_historial_pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 400, 140));

        jSeparator2.setForeground(new java.awt.Color(41, 61, 109));
        jp_panelBlancoCurva.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 360, 10));

        jl_titulo_pago_realizar.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jl_titulo_pago_realizar.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_pago_realizar.setText("PAGO POR REALIZAR");
        jp_panelBlancoCurva.add(jl_titulo_pago_realizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jl_titulo_documento.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jl_titulo_documento.setForeground(new java.awt.Color(0, 0, 102));
        jl_titulo_documento.setText("Documento:");
        jp_panelBlancoCurva.add(jl_titulo_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 385, 90, -1));

        jl_codigoCuota.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jl_codigoCuota.setForeground(new java.awt.Color(0, 0, 102));
        jl_codigoCuota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_codigoCuota.setText("CO 1234567");
        jp_panelBlancoCurva.add(jl_codigoCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 386, -1, -1));

        jl_monto_pagar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jl_monto_pagar.setForeground(new java.awt.Color(0, 0, 102));
        jl_monto_pagar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_monto_pagar.setText("S/ 0.00");
        jp_panelBlancoCurva.add(jl_monto_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 90, -1));

        jb_pagar.setText("Ir a Pagar");
        jb_pagar.setBorderPainted(false);
        jb_pagar.setEnabled(false);
        jb_pagar.setFocusPainted(false);
        jb_pagar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jb_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pagarActionPerformed(evt);
            }
        });
        jp_panelBlancoCurva.add(jb_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 425, 360, -1));

        ultimoPanel.add(jp_panelBlancoCurva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 490));

        fondoCurveadoDegradado1.setRoundTopLeft(50);
        fondoCurveadoDegradado1.setRoundTopRight(50);
        fondoCurveadoDegradado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ultimoPanel.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ultimoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ultimoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        Inicio inicio = new Inicio(estudiante, estadoPago);
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void jb_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pagarActionPerformed
        // TODO add your handling code here:
        if(jcb_cuota_pagar.isSelected() || jl_monto_pagar.getText().equals("S/ 0.00")) {    
            MetodoDePago ventanaMetodoDePago = new MetodoDePago(tarjeta, this, estudiante);
            jcb_cuota_pagar.setSelected(false);
            jl_monto_pagar.setText("S/ 0.00");

            ventanaMetodoDePago.setVisible(true);
            this.setVisible(false);
            jb_pagar.setEnabled(true);
        } else {
            jb_pagar.setEnabled(false);
        }
    }//GEN-LAST:event_jb_pagarActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jcb_cuota_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_cuota_pagarActionPerformed
        // TODO add your handling code here:
        if (jcb_cuota_pagar.isSelected()) {
            jl_monto_pagar.setText(jl_mensualidad_faltante.getText());
            jb_pagar.setEnabled(true);
        } else {
            jl_monto_pagar.setText(valorOriginalMensualidad5);
            jb_pagar.setEnabled(false);
        }
    }//GEN-LAST:event_jcb_cuota_pagarActionPerformed

    private void jcb_cuota_pagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcb_cuota_pagarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_cuota_pagarKeyReleased

    public void mostrarElementosRetroceso() {
        jl_cuota_faltante.setVisible(true);
        jl_mensualidad_faltante.setVisible(true);
        jcb_cuota_pagar.setVisible(true);
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel As7;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private MyContainers.BotonCustomLogin jb_pagar;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JButton jb_salir;
    private MyContainers.JCheckBoxCustom jcb_cuota_pagar;
    private javax.swing.JLabel jl_aviso_sincuotas;
    private javax.swing.JLabel jl_codigoCuota;
    private javax.swing.JLabel jl_cuota_faltante;
    private javax.swing.JLabel jl_cursos_titulo;
    private javax.swing.JLabel jl_mensualidad_C1;
    private javax.swing.JLabel jl_mensualidad_C2;
    private javax.swing.JLabel jl_mensualidad_C3;
    private javax.swing.JLabel jl_mensualidad_C4;
    private javax.swing.JLabel jl_mensualidad_C5;
    private javax.swing.JLabel jl_mensualidad_faltante;
    private javax.swing.JLabel jl_monto_pagar;
    private javax.swing.JLabel jl_titulo_C1;
    private javax.swing.JLabel jl_titulo_C2;
    private javax.swing.JLabel jl_titulo_C3;
    private javax.swing.JLabel jl_titulo_C4;
    private javax.swing.JLabel jl_titulo_C5;
    private javax.swing.JLabel jl_titulo_documento;
    private javax.swing.JLabel jl_titulo_historial;
    private javax.swing.JLabel jl_titulo_pago_realizar;
    private javax.swing.JLabel jl_titulo_pagos;
    private MyContainers.PanelRound jp_cuota_1;
    private MyContainers.PanelRound jp_cuota_2;
    private MyContainers.PanelRound jp_cuota_3;
    private MyContainers.PanelRound jp_cuota_4;
    private MyContainers.PanelRound jp_cuota_5;
    private MyContainers.PanelRound jp_cuota_faltante;
    private javax.swing.JPanel jp_historial_completo;
    private javax.swing.JPanel jp_pagos_faltantes;
    private MyContainers.PanelRound jp_panelBlancoCurva;
    private javax.swing.JScrollPane jsp_historial_pagos;
    private javax.swing.JScrollPane jsp_pagos_faltantes;
    private MyContainers.PanelRound panelRound7;
    private javax.swing.JPanel ultimoPanel;
    // End of variables declaration//GEN-END:variables
}
