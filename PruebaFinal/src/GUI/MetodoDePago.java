package GUI;

import Funcionamiento.ListaTarjetas;
import Funcionamiento.Tarjeta;
import Funcionamiento.Estudiante;
import java.awt.Color;
import javax.swing.JFrame;
import MyContainers.TextPrompt;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Desktop;
import java.net.URI;

public class MetodoDePago extends JFrame {

    private Tarjeta tarjeta;
    private Estudiante estudiante;
    private SaldosYPagos ventanaSaldosYPagos;
    private ListaTarjetas listaTarjetas;
    private SaldosYPagos saldosYPagos;
    List<String> listaDeCorreos = new ArrayList<>();
 
    public MetodoDePago() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        this.listaTarjetas = new ListaTarjetas();
        jl_logo_dinnerClub.setVisible(false);
        jl_logo_american.setVisible(false);
        jl_logo_visa.setVisible(false);
        jl_logo_mastercard.setVisible(false);
        disableCopyPaste(tx_numero_tarjeta);
        disableCopyPaste(tx_cvv_tarjeta);
        disableCopyPaste(tx_nombre_tarjeta);
        disableCopyPaste(tx_correo);
        
        TextPrompt txtNumeroTarjeta = new TextPrompt("Numero en la Tarjeta", tx_numero_tarjeta);
        TextPrompt txtCVVTarjeta = new TextPrompt("CVV", tx_cvv_tarjeta);
        TextPrompt txtNombreTarjeta = new TextPrompt("Nombre en la Tarjeta", tx_nombre_tarjeta);
        TextPrompt txtCorreoElectronico = new TextPrompt("Correo electrónico", tx_correo);
        
        txtNumeroTarjeta.setForeground(new Color(0,0,102));
        txtCVVTarjeta.setForeground(new Color(0,0,102));
        txtNombreTarjeta.setForeground(new Color(0,0,102));
        txtCorreoElectronico.setForeground(new Color(0,0,102));
        
        listaDeCorreos.add("fabian.maquen@usil.pe");
        listaDeCorreos.add("gianny.alfaro@usil.pe");
        listaDeCorreos.add("alondra.gonzales@usil.pe");
        listaDeCorreos.add("omar.morales@usil.pe");
        listaDeCorreos.add("franco.almerco@usil.pe");
        listaDeCorreos.add("nefi.valderrama@usil.pe");
        listaDeCorreos.add("romina.bautista@usil.pe");
        listaDeCorreos.add("renato.riva@usil.pe");
    }

    public MetodoDePago(Tarjeta tar, SaldosYPagos saldosYPagos, Estudiante es) {
        initComponents();
        this.estudiante = es;
        this.tarjeta = tar;
        this.ventanaSaldosYPagos = saldosYPagos;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        this.listaTarjetas = new ListaTarjetas();
        jl_logo_dinnerClub.setVisible(false);
        jl_logo_american.setVisible(false);
        jl_logo_visa.setVisible(false);
        jl_logo_mastercard.setVisible(false);
        disableCopyPaste(tx_numero_tarjeta);
        disableCopyPaste(tx_cvv_tarjeta);
        disableCopyPaste(tx_nombre_tarjeta);
        disableCopyPaste(tx_correo);
        
        TextPrompt txtNumeroTarjeta = new TextPrompt("Numero en la Tarjeta", tx_numero_tarjeta);
        TextPrompt txtCVVTarjeta = new TextPrompt("CVV", tx_cvv_tarjeta);
        TextPrompt txtNombreTarjeta = new TextPrompt("Nombre en la Tarjeta", tx_nombre_tarjeta);
        TextPrompt txtCorreoElectronico = new TextPrompt("Correo electrónico", tx_correo);
        
        txtNumeroTarjeta.setForeground(new Color(0,0,102));
        txtCVVTarjeta.setForeground(new Color(0,0,102));
        txtNombreTarjeta.setForeground(new Color(0,0,102));
        txtCorreoElectronico.setForeground(new Color(0,0,102));  
        
        listaDeCorreos.add("fabian.maquen@usil.pe");
        listaDeCorreos.add("gianny.alfaro@usil.pe");
        listaDeCorreos.add("alondra.gonzales@usil.pe");
        listaDeCorreos.add("omar.morales@usil.pe");
        listaDeCorreos.add("franco.almerco@usil.pe");
        listaDeCorreos.add("nefi.valderrama@usil.pe");
        listaDeCorreos.add("romina.bautista@usil.pe");
        listaDeCorreos.add("renato.riva@usil.pe");
        
        tx_numero_tarjeta.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarNumeroTarjeta();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarNumeroTarjeta();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarNumeroTarjeta();
            }
        });
        
        tx_nombre_tarjeta.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarNombreTitular();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarNombreTitular();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarNombreTitular();
            }
        });
        
        cb_mes.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    actualizarFechaMes();
                }
            }
        });

        // Configurar el listener para cb_año
        cb_año.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    actualizarFechaAño();
                }
            }
        });
    }

    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    private void disableCopy(JComponent component){
        component.getInputMap().put(KeyStroke.getKeyStroke("control C"), "none");
    }
    
    private void disablePaste(JComponent component){
        component.getInputMap().put(KeyStroke.getKeyStroke("control V"), "none");
    }
    
     private void disableCopyPaste(JComponent component){
         disableCopy(component);
         disablePaste(component);
    }
    
    private void actualizarNumeroTarjeta() {
        String numeroTarjetaOriginal = tx_numero_tarjeta.getText();

        if (numeroTarjetaOriginal.isEmpty()) {
            jl_numero_tarjeta.setText("****       ****        ****        ****");
        } else {
            String numeroTarjetaSinEspacios = numeroTarjetaOriginal.replaceAll("\\s", ""); // Elimina espacios existentes

            StringBuilder tarjetaFormateada = new StringBuilder();

            for (int i = 0; i < numeroTarjetaSinEspacios.length(); i++) {
                tarjetaFormateada.append(numeroTarjetaSinEspacios.charAt(i));

                // Agrega 4 espacios después de cada grupo de cuatro números
                if ((i + 1) % 4 == 0 && i + 1 != numeroTarjetaSinEspacios.length()) {
                    tarjetaFormateada.append("      ");
                }
            }

            jl_numero_tarjeta.setText(tarjetaFormateada.toString());
        }
    }
    
    private void actualizarNumeroTarjeta15() {
        String numeroTarjetaOriginal = tx_numero_tarjeta.getText();

        String numeroTarjetaSinEspacios = numeroTarjetaOriginal.replaceAll("\\s", ""); // Elimina espacios existentes

        StringBuilder tarjetaFormateada = new StringBuilder();

        int group1 = Math.min(4, numeroTarjetaSinEspacios.length());
        int group2 = Math.min(6, numeroTarjetaSinEspacios.length() - group1);
        int group3 = numeroTarjetaSinEspacios.length() - group1 - group2;

        if (group1 > 0) {
            tarjetaFormateada.append(numeroTarjetaSinEspacios.substring(0, group1));
            if (group1 == 4) {
                tarjetaFormateada.append("         ");
            }
        }

        if (group2 > 0) {
            tarjetaFormateada.append(numeroTarjetaSinEspacios.substring(group1, group1 + group2));
            if (group2 == 6) {
                tarjetaFormateada.append("         ");
            }
        }

        if (group3 > 0) {
            tarjetaFormateada.append(numeroTarjetaSinEspacios.substring(group1 + group2));
        }

        jl_numero_tarjeta.setText(tarjetaFormateada.toString());
    
    }
    
    private void actualizarNombreTitular() {
        String textoNombre = tx_nombre_tarjeta.getText();
        jl_nombre_titular.setText(textoNombre.isEmpty() ? "Nombre Titular" : textoNombre);
    }
    
    private void actualizarFechaMes() {
        String mesSeleccionado = cb_mes.getSelectedItem().toString();
        jl_fecha_mes.setText(mesSeleccionado);
    }

    private void actualizarFechaAño() {
        String añoSeleccionado = cb_año.getSelectedItem().toString();
        jl_fecha_año.setText(añoSeleccionado);
    }
    
    private void formatTextField(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Consumir el evento, ignorar la tecla no numérica
                }

                String text = textField.getText().replaceAll("[^\\d]", "");
                StringBuilder formattedValue = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    if (i > 0 && i % 4 == 0) {
                        formattedValue.append("    ");
                    }
                    formattedValue.append(text.charAt(i));
                }

                textField.setText(formattedValue.toString());
            }
        });
    }
    
    private void formatTextField15(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Consumir el evento, ignorar la tecla no numérica
                }

                String text = textField.getText().replaceAll("[^\\d]", "");
                StringBuilder formattedValue = new StringBuilder();

                int group1 = Math.min(4, text.length());
                int group2 = Math.min(6, text.length() - group1);
                int group3 = text.length() - group1 - group2;

                if (group1 > 0) {
                    formattedValue.append(text.substring(0, group1));
                    if (group1 == 4) {
                        formattedValue.append("    ");
                    }
                }

                if (group2 > 0) {
                    formattedValue.append(text.substring(group1, group1 + group2));
                    if (group2 == 6) {
                        formattedValue.append("    ");
                    }
                }

                if (group3 > 0) {
                    formattedValue.append(text.substring(group1 + group2));
                }

                textField.setText(formattedValue.toString());
            }
        });
        
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    // Manejar la tecla Retroceso para permitir eliminar espacios
                    String text = textField.getText();
                    if (!text.isEmpty() && text.charAt(text.length() - 1) == ' ') {
                        // Eliminar un espacio si el último carácter es un espacio
                        textField.setText(text.substring(0, text.length() - 1));
                    }
                }
            }
        });
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_utlima_capa = new javax.swing.JPanel();
        jl_icono_chip = new javax.swing.JLabel();
        jl_logo_dinnerClub = new javax.swing.JLabel();
        jl_logo_american = new javax.swing.JLabel();
        jl_logo_visa = new javax.swing.JLabel();
        jl_logo_mastercard = new javax.swing.JLabel();
        jl_numero_tarjeta = new javax.swing.JLabel();
        jl_nombre_titular = new javax.swing.JLabel();
        jl_slash = new javax.swing.JLabel();
        jl_fecha_año = new javax.swing.JLabel();
        jl_fecha_mes = new javax.swing.JLabel();
        jl_cursos_titulo = new javax.swing.JLabel();
        fondoTarjeta1 = new MyContainers.FondoTarjeta();
        jb_retroceder = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jb_confirmar = new MyContainers.BotonCustomLogin();
        jp_panel_blanco = new MyContainers.PanelRound();
        tx_numero_tarjeta = new javax.swing.JTextField();
        tx_cvv_tarjeta = new javax.swing.JTextField();
        tx_nombre_tarjeta = new javax.swing.JTextField();
        tx_correo = new javax.swing.JTextField();
        jcb_aceptar_tyc = new MyContainers.JCheckBoxCustom();
        jl_tyc_t2 = new javax.swing.JLabel();
        jl_tyc_t1 = new javax.swing.JLabel();
        jb_ver_tyc = new javax.swing.JButton();
        jp_caja_numeroT = new MyContainers.PanelRound();
        jl_icono_numTarjeta = new javax.swing.JLabel();
        jp_caja_fechaT = new MyContainers.PanelRound();
        jl_icono_fechaTarjeta = new javax.swing.JLabel();
        cb_mes = new MyContainers.ComboBoxSuggestion();
        cb_año = new MyContainers.ComboBoxSuggestion();
        jLabel1 = new javax.swing.JLabel();
        jp_caja_CVVT = new MyContainers.PanelRound();
        jl_icono_CVVTarjeta = new javax.swing.JLabel();
        jp_caja_nombreT = new MyContainers.PanelRound();
        jl_icono_nomTarjeta = new javax.swing.JLabel();
        jp_caja_correoT = new MyContainers.PanelRound();
        jl_icono_correoTarjeta = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp_utlima_capa.setOpaque(false);
        jp_utlima_capa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_icono_chip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoChipTarj30x25.png"))); // NOI18N
        jp_utlima_capa.add(jl_icono_chip, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 113, -1, -1));

        jl_logo_dinnerClub.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_logo_dinnerClub.setForeground(new java.awt.Color(255, 255, 255));
        jl_logo_dinnerClub.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_logo_dinnerClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoDinnerClub35x30.png"))); // NOI18N
        jp_utlima_capa.add(jl_logo_dinnerClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jl_logo_american.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_logo_american.setForeground(new java.awt.Color(255, 255, 255));
        jl_logo_american.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_logo_american.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoAmerican50x26.png"))); // NOI18N
        jp_utlima_capa.add(jl_logo_american, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 90, 50, -1));

        jl_logo_visa.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_logo_visa.setForeground(new java.awt.Color(255, 255, 255));
        jl_logo_visa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_logo_visa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoVisa50x16.png"))); // NOI18N
        jp_utlima_capa.add(jl_logo_visa, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 95, 50, -1));

        jl_logo_mastercard.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_logo_mastercard.setForeground(new java.awt.Color(255, 255, 255));
        jl_logo_mastercard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_logo_mastercard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMastercard50x28.png"))); // NOI18N
        jp_utlima_capa.add(jl_logo_mastercard, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 90, 50, -1));

        jl_numero_tarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jl_numero_tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        jl_numero_tarjeta.setText("****       ****        ****        ****");
        jp_utlima_capa.add(jl_numero_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 145, 220, -1));

        jl_nombre_titular.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_nombre_titular.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre_titular.setText("Nombre Titular");
        jp_utlima_capa.add(jl_nombre_titular, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 190, 150, -1));

        jl_slash.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jl_slash.setForeground(new java.awt.Color(255, 255, 255));
        jl_slash.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_slash.setText("/");
        jp_utlima_capa.add(jl_slash, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 189, 5, -1));

        jl_fecha_año.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_fecha_año.setForeground(new java.awt.Color(255, 255, 255));
        jl_fecha_año.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jl_fecha_año.setText("AA");
        jp_utlima_capa.add(jl_fecha_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 190, 20, -1));

        jl_fecha_mes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_fecha_mes.setForeground(new java.awt.Color(255, 255, 255));
        jl_fecha_mes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_fecha_mes.setText("MM");
        jp_utlima_capa.add(jl_fecha_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 20, -1));

        jl_cursos_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_cursos_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_cursos_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cursos_titulo.setText("Método de Pago");
        jp_utlima_capa.add(jl_cursos_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 330, -1));

        fondoTarjeta1.setRoundBottomLeft(50);
        fondoTarjeta1.setRoundBottomRight(50);
        fondoTarjeta1.setRoundTopLeft(50);
        fondoTarjeta1.setRoundTopRight(50);
        fondoTarjeta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp_utlima_capa.add(fondoTarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 280, 160));

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
        jp_utlima_capa.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

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
        jp_utlima_capa.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 20, 30, -1));

        jb_confirmar.setText("Confirmar");
        jb_confirmar.setBorderPainted(false);
        jb_confirmar.setEnabled(false);
        jb_confirmar.setFocusPainted(false);
        jb_confirmar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jb_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_confirmarActionPerformed(evt);
            }
        });
        jp_utlima_capa.add(jb_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 515, 360, -1));

        jp_panel_blanco.setBackground(new java.awt.Color(232, 235, 241));
        jp_panel_blanco.setRoundBottomLeft(50);
        jp_panel_blanco.setRoundBottomRight(50);
        jp_panel_blanco.setRoundTopLeft(80);
        jp_panel_blanco.setRoundTopRight(80);
        jp_panel_blanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tx_numero_tarjeta.setBackground(new java.awt.Color(102, 102, 102));
        tx_numero_tarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        tx_numero_tarjeta.setForeground(new java.awt.Color(0, 0, 102));
        tx_numero_tarjeta.setToolTipText("");
        tx_numero_tarjeta.setBorder(null);
        tx_numero_tarjeta.setCaretColor(new java.awt.Color(0, 0, 102));
        tx_numero_tarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tx_numero_tarjeta.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        tx_numero_tarjeta.setOpaque(false);
        tx_numero_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_numero_tarjetaActionPerformed(evt);
            }
        });
        tx_numero_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_numero_tarjetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_numero_tarjetaKeyTyped(evt);
            }
        });
        jp_panel_blanco.add(tx_numero_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 60, 265, 40));

        tx_cvv_tarjeta.setBackground(new java.awt.Color(102, 102, 102));
        tx_cvv_tarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        tx_cvv_tarjeta.setForeground(new java.awt.Color(0, 0, 102));
        tx_cvv_tarjeta.setToolTipText("");
        tx_cvv_tarjeta.setBorder(null);
        tx_cvv_tarjeta.setCaretColor(new java.awt.Color(0, 0, 102));
        tx_cvv_tarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tx_cvv_tarjeta.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        tx_cvv_tarjeta.setOpaque(false);
        tx_cvv_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_cvv_tarjetaActionPerformed(evt);
            }
        });
        tx_cvv_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_cvv_tarjetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_cvv_tarjetaKeyTyped(evt);
            }
        });
        jp_panel_blanco.add(tx_cvv_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 115, 45, 40));

        tx_nombre_tarjeta.setBackground(new java.awt.Color(102, 102, 102));
        tx_nombre_tarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        tx_nombre_tarjeta.setForeground(new java.awt.Color(0, 0, 102));
        tx_nombre_tarjeta.setToolTipText("");
        tx_nombre_tarjeta.setBorder(null);
        tx_nombre_tarjeta.setCaretColor(new java.awt.Color(0, 0, 102));
        tx_nombre_tarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tx_nombre_tarjeta.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        tx_nombre_tarjeta.setOpaque(false);
        tx_nombre_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nombre_tarjetaActionPerformed(evt);
            }
        });
        tx_nombre_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_nombre_tarjetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_nombre_tarjetaKeyTyped(evt);
            }
        });
        jp_panel_blanco.add(tx_nombre_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 170, 265, 40));

        tx_correo.setBackground(new java.awt.Color(102, 102, 102));
        tx_correo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        tx_correo.setForeground(new java.awt.Color(0, 0, 102));
        tx_correo.setToolTipText("");
        tx_correo.setBorder(null);
        tx_correo.setCaretColor(new java.awt.Color(0, 0, 102));
        tx_correo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tx_correo.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        tx_correo.setOpaque(false);
        tx_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_correoActionPerformed(evt);
            }
        });
        tx_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tx_correoKeyReleased(evt);
            }
        });
        jp_panel_blanco.add(tx_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 225, 265, 40));

        jcb_aceptar_tyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_aceptar_tycActionPerformed(evt);
            }
        });
        jcb_aceptar_tyc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcb_aceptar_tycKeyReleased(evt);
            }
        });
        jp_panel_blanco.add(jcb_aceptar_tyc, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 290, -1, -1));

        jl_tyc_t2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_tyc_t2.setForeground(new java.awt.Color(41, 61, 109));
        jl_tyc_t2.setText("USIL y deseo proceder con el pago");
        jp_panel_blanco.add(jl_tyc_t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 293, 170, -1));

        jl_tyc_t1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        jl_tyc_t1.setForeground(new java.awt.Color(41, 61, 109));
        jl_tyc_t1.setText("Acepto los ");
        jp_panel_blanco.add(jl_tyc_t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 293, 60, -1));

        jb_ver_tyc.setBackground(new java.awt.Color(63, 108, 165));
        jb_ver_tyc.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        jb_ver_tyc.setForeground(new java.awt.Color(41, 61, 109));
        jb_ver_tyc.setText("Términos y Condiciones");
        jb_ver_tyc.setBorder(null);
        jb_ver_tyc.setBorderPainted(false);
        jb_ver_tyc.setContentAreaFilled(false);
        jb_ver_tyc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_ver_tyc.setFocusPainted(false);
        jb_ver_tyc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jb_ver_tyc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jb_ver_tyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ver_tycActionPerformed(evt);
            }
        });
        jp_panel_blanco.add(jb_ver_tyc, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 293, 130, -1));

        jp_caja_numeroT.setBackground(new java.awt.Color(196, 205, 219));
        jp_caja_numeroT.setRoundBottomLeft(20);
        jp_caja_numeroT.setRoundBottomRight(20);
        jp_caja_numeroT.setRoundTopLeft(20);
        jp_caja_numeroT.setRoundTopRight(20);
        jp_caja_numeroT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_icono_numTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoNumTar28x20.png"))); // NOI18N
        jp_caja_numeroT.add(jl_icono_numTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, -1, -1));

        jp_panel_blanco.add(jp_caja_numeroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 360, 40));

        jp_caja_fechaT.setBackground(new java.awt.Color(196, 205, 219));
        jp_caja_fechaT.setRoundBottomLeft(20);
        jp_caja_fechaT.setRoundBottomRight(20);
        jp_caja_fechaT.setRoundTopLeft(20);
        jp_caja_fechaT.setRoundTopRight(20);
        jp_caja_fechaT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_icono_fechaTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoFechaTarj22x23.png"))); // NOI18N
        jp_caja_fechaT.add(jl_icono_fechaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 8, -1, -1));

        cb_mes.setBorder(null);
        cb_mes.setForeground(new java.awt.Color(41, 61, 109));
        cb_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cb_mes.setFocusable(false);
        cb_mes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        cb_mes.setOpaque(false);
        cb_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mesActionPerformed(evt);
            }
        });
        cb_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb_mesKeyReleased(evt);
            }
        });
        jp_caja_fechaT.add(cb_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 10, 51, 20));

        cb_año.setBorder(null);
        cb_año.setForeground(new java.awt.Color(41, 61, 109));
        cb_año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AA", "24", "25", "26", "27", "28", "29", "30" }));
        cb_año.setFocusable(false);
        cb_año.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        cb_año.setOpaque(false);
        cb_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_añoActionPerformed(evt);
            }
        });
        cb_año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb_añoKeyReleased(evt);
            }
        });
        jp_caja_fechaT.add(cb_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 10, 50, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 61, 109));
        jLabel1.setText("/");
        jp_caja_fechaT.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 10, 10, 20));

        jp_panel_blanco.add(jp_caja_fechaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 115, 210, 40));

        jp_caja_CVVT.setBackground(new java.awt.Color(196, 205, 219));
        jp_caja_CVVT.setRoundBottomLeft(20);
        jp_caja_CVVT.setRoundBottomRight(20);
        jp_caja_CVVT.setRoundTopLeft(20);
        jp_caja_CVVT.setRoundTopRight(20);
        jp_caja_CVVT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_icono_CVVTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoCVVTarj29x20.png"))); // NOI18N
        jp_caja_CVVT.add(jl_icono_CVVTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, -1, -1));

        jp_panel_blanco.add(jp_caja_CVVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 115, 140, 40));

        jp_caja_nombreT.setBackground(new java.awt.Color(196, 205, 219));
        jp_caja_nombreT.setRoundBottomLeft(20);
        jp_caja_nombreT.setRoundBottomRight(20);
        jp_caja_nombreT.setRoundTopLeft(20);
        jp_caja_nombreT.setRoundTopRight(20);
        jp_caja_nombreT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_icono_nomTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoPersonaTarj17x21.png"))); // NOI18N
        jp_caja_nombreT.add(jl_icono_nomTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        jp_panel_blanco.add(jp_caja_nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 360, 40));

        jp_caja_correoT.setBackground(new java.awt.Color(196, 205, 219));
        jp_caja_correoT.setRoundBottomLeft(20);
        jp_caja_correoT.setRoundBottomRight(20);
        jp_caja_correoT.setRoundTopLeft(20);
        jp_caja_correoT.setRoundTopRight(20);
        jp_caja_correoT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_icono_correoTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoCorreo25x17.png"))); // NOI18N
        jp_caja_correoT.add(jl_icono_correoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, -1, -1));

        jp_panel_blanco.add(jp_caja_correoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 225, 360, 40));

        jp_utlima_capa.add(jp_panel_blanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 440, 390));

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
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jp_utlima_capa.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_utlima_capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_utlima_capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void habilitarConfirmarPago(){  
        if(!tx_numero_tarjeta.getText().isEmpty() && cb_mes.getSelectedIndex() != 0 && cb_año.getSelectedIndex() != 0 && !tx_cvv_tarjeta.getText().isEmpty() && !tx_nombre_tarjeta.getText().isEmpty() && !tx_correo.getText().isEmpty() && jcb_aceptar_tyc.isSelected()){
            jb_confirmar.setEnabled(true);
        } else{
            jb_confirmar.setEnabled(false);
        }
    }
    
    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        // Crea una nueva instancia de Inicio con los datos originales
        ventanaSaldosYPagos.setEstudiante(estudiante);
        ventanaSaldosYPagos.setVisible(true);
        ventanaSaldosYPagos.restaurarEstadoBotonPagar();
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_confirmarActionPerformed
        String nombre = tx_nombre_tarjeta.getText();
        String nroCuenta = tx_numero_tarjeta.getText();
        String CVV = tx_cvv_tarjeta.getText();
        String correo = tx_correo.getText();
        
        nroCuenta = nroCuenta.replaceAll("\\s", "");
        
        Object mesSelec = cb_mes.getSelectedItem();
        Object anhoSelec = cb_año.getSelectedItem();
        String mes = mesSelec.toString();
        String anho = anhoSelec.toString();

        // Crear una tarjeta con la información ingresada
        Tarjeta tarjetaIngresada = new Tarjeta(nombre, nroCuenta, mes, anho, CVV);

        // Verificar si la tarjeta está en la lista
        if (this.listaTarjetas.getTarjeta().contains(tarjetaIngresada) && this.listaDeCorreos.contains(correo)) {
                PagoAviso ventanaPagoAviso = new PagoAviso(this.estudiante, this.ventanaSaldosYPagos);
                ventanaPagoAviso.setVisible(true);
                this.setVisible(false); 
        } else {
            PagoAviso ventanaTransaccionFallida = new PagoAviso(estudiante, this);
            ventanaTransaccionFallida.setVisible(true);
            this.setVisible(false);
        }     
    }//GEN-LAST:event_jb_confirmarActionPerformed

    private void tx_nombre_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nombre_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nombre_tarjetaActionPerformed

    private void tx_nombre_tarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_nombre_tarjetaKeyReleased
        habilitarConfirmarPago();
    }//GEN-LAST:event_tx_nombre_tarjetaKeyReleased

    private void tx_numero_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_numero_tarjetaActionPerformed

    }//GEN-LAST:event_tx_numero_tarjetaActionPerformed
    
    private void borrarlogos(){
        jl_logo_american.setVisible(false);
        jl_logo_mastercard.setVisible(false);
        jl_logo_visa.setVisible(false);
        jl_logo_dinnerClub.setVisible(false);
    }
    
    private void tx_numero_tarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_numero_tarjetaKeyReleased
        habilitarConfirmarPago();
        
        boolean textoVacio = tx_numero_tarjeta.getText().isEmpty();

        if (!textoVacio) {
            String numeroTarjeta = tx_numero_tarjeta.getText();
            String primerDigito = numeroTarjeta.length() >= 1 ? numeroTarjeta.substring(0, 1) : "";
            String primerosDosDigitos = numeroTarjeta.length() >= 2 ? numeroTarjeta.substring(0, 2) : "";
            String primerosCuatroDigitos = numeroTarjeta.length() >= 4 ? numeroTarjeta.substring(0, 4) : "";

            int primerosDosDigitosNum = primerosDosDigitos.isEmpty() ? 0 : Integer.parseInt(primerosDosDigitos);
            int primerosCuatroDigitosNum = primerosCuatroDigitos.isEmpty() ? 0 : Integer.parseInt(primerosCuatroDigitos);

            // DINNER CLUB
            if (primerDigito.equalsIgnoreCase("6") || primerosDosDigitosNum == 36 || (primerosCuatroDigitos.equals("2014") || primerosCuatroDigitos.equals("2149"))) {
                jl_logo_dinnerClub.setVisible(true);
                formatTextField(tx_numero_tarjeta);
            } 
            else if (primerosCuatroDigitos.equals("2014") || primerosCuatroDigitos.equals("2149")){
                jl_logo_dinnerClub.setVisible(true);
                formatTextField(tx_numero_tarjeta);
            }
            // AMERICAN EXPRESS
            else if (primerosDosDigitosNum == 34 || primerosDosDigitosNum == 37) {
                jl_logo_american.setVisible(true);
                formatTextField15(tx_numero_tarjeta);
                actualizarNumeroTarjeta15();
            }
            // VISA
            else if (primerDigito.equalsIgnoreCase("4")) {
                jl_logo_visa.setVisible(true);
                formatTextField(tx_numero_tarjeta);
            }
            // MASTERCARD
            else if ((primerosDosDigitosNum >= 51 && primerosDosDigitosNum <= 55) || (primerosCuatroDigitosNum >= 2221 && primerosCuatroDigitosNum <= 2720)) {
                jl_logo_mastercard.setVisible(true);
                formatTextField(tx_numero_tarjeta);
            } 
            // SINO
            else {
                borrarlogos();
                formatTextField(tx_numero_tarjeta);
            }
        }
        
        if(textoVacio){
            borrarlogos(); 
        }
    }//GEN-LAST:event_tx_numero_tarjetaKeyReleased

    private void tx_cvv_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_cvv_tarjetaActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_tx_cvv_tarjetaActionPerformed

    private void tx_cvv_tarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_cvv_tarjetaKeyReleased
        habilitarConfirmarPago();
    }//GEN-LAST:event_tx_cvv_tarjetaKeyReleased

    private void tx_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_correoActionPerformed

    private void tx_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_correoKeyReleased
        habilitarConfirmarPago();
    }//GEN-LAST:event_tx_correoKeyReleased

    private void jcb_aceptar_tycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_aceptar_tycActionPerformed
        if (jcb_aceptar_tyc.isSelected()) {
            habilitarConfirmarPago();
        } else {
            habilitarConfirmarPago();
        }
    }//GEN-LAST:event_jcb_aceptar_tycActionPerformed

    private void jcb_aceptar_tycKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcb_aceptar_tycKeyReleased
        habilitarConfirmarPago();
    }//GEN-LAST:event_jcb_aceptar_tycKeyReleased

    private void jb_ver_tycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ver_tycActionPerformed
        String url_TyC = "https://usilonlife.com/terminos-y-condiciones/"; // link de Terminos y Condiciones para pagar en USIL
        
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                try {
                    URI uri = new URI(url_TyC);
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {}
            }
        }
    }//GEN-LAST:event_jb_ver_tycActionPerformed

    private void tx_cvv_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_cvv_tarjetaKeyTyped
        int key = evt.getKeyChar(); // obtiene el primer caracter que se escriba en teclado
        
        boolean num = key >= 48 && key <= 57; // Alt + 48 = 0 / Alt + 57 = 9
        
        if(!num){
            evt.consume();
        }
        if(jl_logo_american.isVisible()){
            if(tx_cvv_tarjeta.getText().length() >= 4){
               evt.consume(); 
            }
        }
        else if(tx_cvv_tarjeta.getText().length() >= 3){
            evt.consume();
        }
    }//GEN-LAST:event_tx_cvv_tarjetaKeyTyped

    private void tx_nombre_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_nombre_tarjetaKeyTyped
        if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)){
            evt.consume();
        }
        
        if(tx_nombre_tarjeta.getText().length() >= 25){
            evt.consume();
        }
    }//GEN-LAST:event_tx_nombre_tarjetaKeyTyped

    private void cb_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_mesActionPerformed

    private void cb_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_añoActionPerformed

    private void cb_mesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_mesKeyReleased
        habilitarConfirmarPago();
    }//GEN-LAST:event_cb_mesKeyReleased

    private void cb_añoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_añoKeyReleased
        habilitarConfirmarPago();
    }//GEN-LAST:event_cb_añoKeyReleased

    private void tx_numero_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_numero_tarjetaKeyTyped
        int key = evt.getKeyChar(); // obtiene el primer caracter que se escriba en teclado
        
        boolean num = key >= 48 && key <= 57; // Alt + 48 = 0 / Alt + 57 = 9
        
        if(!num || (evt.getKeyCode() == KeyEvent.VK_CONTROL)){
            evt.consume();
        }
        
        if(jl_logo_american.isVisible()){
            if(tx_numero_tarjeta.getText().length() >= 23){
               evt.consume(); 
            }
        } 
        else if(tx_numero_tarjeta.getText().length() >= 28){
            evt.consume();
        }
    }//GEN-LAST:event_tx_numero_tarjetaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MyContainers.ComboBoxSuggestion cb_año;
    private MyContainers.ComboBoxSuggestion cb_mes;
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private MyContainers.FondoTarjeta fondoTarjeta1;
    private javax.swing.JLabel jLabel1;
    private MyContainers.BotonCustomLogin jb_confirmar;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_ver_tyc;
    private MyContainers.JCheckBoxCustom jcb_aceptar_tyc;
    private javax.swing.JLabel jl_cursos_titulo;
    private javax.swing.JLabel jl_fecha_año;
    private javax.swing.JLabel jl_fecha_mes;
    private javax.swing.JLabel jl_icono_CVVTarjeta;
    private javax.swing.JLabel jl_icono_chip;
    private javax.swing.JLabel jl_icono_correoTarjeta;
    private javax.swing.JLabel jl_icono_fechaTarjeta;
    private javax.swing.JLabel jl_icono_nomTarjeta;
    private javax.swing.JLabel jl_icono_numTarjeta;
    private javax.swing.JLabel jl_logo_american;
    private javax.swing.JLabel jl_logo_dinnerClub;
    private javax.swing.JLabel jl_logo_mastercard;
    private javax.swing.JLabel jl_logo_visa;
    private javax.swing.JLabel jl_nombre_titular;
    private javax.swing.JLabel jl_numero_tarjeta;
    private javax.swing.JLabel jl_slash;
    private javax.swing.JLabel jl_tyc_t1;
    private javax.swing.JLabel jl_tyc_t2;
    private MyContainers.PanelRound jp_caja_CVVT;
    private MyContainers.PanelRound jp_caja_correoT;
    private MyContainers.PanelRound jp_caja_fechaT;
    private MyContainers.PanelRound jp_caja_nombreT;
    private MyContainers.PanelRound jp_caja_numeroT;
    private MyContainers.PanelRound jp_panel_blanco;
    private javax.swing.JPanel jp_utlima_capa;
    private javax.swing.JTextField tx_correo;
    private javax.swing.JTextField tx_cvv_tarjeta;
    private javax.swing.JTextField tx_nombre_tarjeta;
    private javax.swing.JTextField tx_numero_tarjeta;
    // End of variables declaration//GEN-END:variables
}
