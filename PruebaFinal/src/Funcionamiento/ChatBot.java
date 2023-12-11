package Funcionamiento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MyContainers.TextPrompt;
import GUI.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import MyContainers.FondoCurveadoDegradado;
import MyContainers.ScrollBarCustom;
public class ChatBot extends JFrame implements ActionListener {
    // CREANCIÓN DE OBJETOS DE LAS ROPIEDADES DE INTERFACES
    JScrollPane sp;
    static JTextArea area = new JTextArea();
    JTextField field = new JTextField();
    JButton send, back, apagar;
    private Estudiante estudiante;
    private Inicio ventanaInicio;
    private BotLogic botLogic;
    private JPanel bottomPanel;
    private int nivel = 0; // Etapa del diálogo: 0 - Seleccionar opción, 1 - Respuesta a la opción seleccionada, 2 - Mensaje final
    private int opcionSeleccionada = 0; // Almacena la opción seleccionada por el usuario
    private final int oportunidades = 3; // Número máximo de intentos permitidos
    public ChatBot(String title) {
        
        
        //------------------*VENTANA GENERAL 
        
        super(title);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(232, 235, 241));  
        setBackground(new Color(0, 0, 0, 0)); 
        
        
        
        RoundedPanel roundedPanel = new RoundedPanel(70); // Modifica el radio según tus preferencias
        roundedPanel.setLayout(null);
        roundedPanel.setBorder(null);
        roundedPanel.setBounds(0, 0, 460, 620); // Ajusta la posición y el tamaño según sea necesario
        roundedPanel.setBackground(new Color(232, 235, 241)); // Establecer el color de fondo del panel
        add(roundedPanel);
        
        
        //----------------- SALUDO 
        
        
        String saludo = " \n  ¡Hola!\n  Soy Usilito 🦁, el asistente virtual de USIL, y me gustaría poder ayudarte.\n";
        String listaOpciones = "-   Para comenzar, ingresa una de las siguientes opciones: \n" +
                                        "\n      1 Becas Y ayuda Academica 🥇\n" +
                                        "      2 Actividades extracurriculares y Clubes Estudiantiles ⛹️🏀\n" +
                                        "      3 Orientación para Practicas 👷‍️\n" +
                                        "      4 Atención Presencial 🙋\n" +
                                        "      5 Opciones de estudios en el extranjero 🛩️\n" +
                                        "      6 Trámites Estudiantiles 📋\n" +
                                        "      7 Pagos estudiantiles 💰\n"; 
					// "      > Quiero hacer otra pregunta 🔍\n";
        
        
                                        
        //---------------- CABECERA DEL CHATBOT 
        
        //FONDO DEGRADADO
        FondoCurveadoDegradado panelDegradado = new FondoCurveadoDegradado();
        panelDegradado.setBounds(1, 0, 458, 123); // Establecer el tamaño y la posición según sea necesario
        
        // BOTON RETROCEDER
        
        back = new JButton("<");
        back.setBounds(30, 30, 35, 35); // Establece la posición y el tamaño del botón "back"
        //back.setIcon(new ImageIcon("C:\\Users\\ALFONSO BARRENECHEA\\Desktop\\PruebaFinal\\src\\images\\BackIcon.png"));
        back.setBorder(null);
        //back.setOpaque(true);
        back.setFont(new Font("Arial", 1, 24));
        back.setVerticalAlignment(SwingConstants.CENTER);
        back.setContentAreaFilled(false);
        //back.setBackground(new Color(38,65,115));
        back.setForeground(Color.WHITE);
        roundedPanel.add(back);
        
        // IMAGEN USILITO 
        
        JLabel imgUsilito = new JLabel();
        imgUsilito.setIcon(new ImageIcon("C:\\Users\\ALFONSO BARRENECHEA\\Desktop\\PruebaFinal\\src\\images\\usilitoBlanco 100x104.png"));
        imgUsilito.setBounds(180, 0, 100, 80);
        roundedPanel.add(imgUsilito);
        
        // TITULO USILITO
        
        JLabel tituloUsilito = new JLabel("Usilito");
        tituloUsilito.setBounds(180, 60, 100, 30);
        tituloUsilito.setHorizontalAlignment(SwingConstants.CENTER);
        tituloUsilito.setFont(new Font("Segoe UI", 1, 14));
        tituloUsilito.setForeground(Color.WHITE);
        roundedPanel.add(tituloUsilito);
        
        
        //BOTON APAGAR TODO 
        apagar = new JButton("x");
        apagar.setBounds(400, 30, 35, 35);
        apagar.setVerticalAlignment(SwingConstants.CENTER);
        apagar.setBorder(null);
        //apagar.setIcon(new ImageIcon("C:\\Users\\ALFONSO BARRENECHEA\\Desktop\\PruebaFinal\\src\\images\\iconoSalir35x35.png"));
        apagar.setFont(new Font("Segoe UI", 0, 35));
        apagar.setContentAreaFilled(false);
        apagar.setForeground(Color.WHITE);
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana al hacer clic en el botón "apagar"
                dispose();
            }
        });
        roundedPanel.add(apagar);
        
        //CURVA SUPERIOR 
        
        JLabel curvaSuperior = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int radio = 90; // Radio para redondear las esquinas
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Shape roundRect = new RoundRectangle2D.Double(1, 0, (getWidth()-3), getHeight(), radio, radio);
                g2d.setColor(new Color(232, 235, 241)); // Color de las esquinas redondeadas
                g2d.fill(roundRect);
                g2d.dispose();
            }
        };
        curvaSuperior.setBounds(0, 92, 460, 60); // Ajustar la posición para ubicarlo en la parte inferior
        curvaSuperior.setOpaque(false); // Hacer el JLabel transparente para que se vean las esquinas redondeadas
        roundedPanel.add(curvaSuperior); // Añadir curvaSuperior al panelDegradado
        
        roundedPanel.add(panelDegradado);
        
        //------------------ AREA DE CHATBOT Y SCOLLBAR 
        
        //AREA DE TEXTO 
        
        JLabel imgUchil= new JLabel();
        area = new JTextArea();
        area.setText(saludo + listaOpciones);
	area.setEditable(false);
	area.setBackground(new Color(232, 235, 241));
	area.setLineWrap(true);
        area.setBorder(null);
	area.setWrapStyleWord(true);
        //area.setFont(new Font("Segoe UI Light", 1, 14));
        area.setForeground(new Color(41, 61, 109));
        
        
        //SCROLL BAR 
        
        
        
        JScrollPane sp = new JScrollPane(area);
        sp.setBounds(20, 137, 420, 375);
        //sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        sp.getVerticalScrollBar().setBackground( new Color(41, 61, 109));
        //sp.getVerticalScrollBar().setForeground(new Color(0,0,0) );
        //sp.getVerticalScrollBar().setPreferredSize(new Dimension(10, 40));
        //sp.getVerticalScrollBar().setBorder(null);
        sp.setBorder(null);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        roundedPanel.add(sp);

        
	//-------------------- ZONA INFERIOR DE ENVIO DE RESPUESTA JFIELD, NEWPANEL , JBUTTON, IMAGENBOTON
        
        // FIELD PARA ESCRIBIR MENSAJES 
        field = new JTextField();
        field.setSize(340, 40);
	field.setLocation(38, 546);
	field.setBackground(new Color(196,205,219));
	field.setForeground(new Color(41, 61, 109));
	field.setFont(new Font("Segoe UI", 0, 14));
        field.setBorder(null);
	roundedPanel.add(field);
        
        //PROPIEDAD PARA DESACTIVAR EL MOUSE MIENTRAS NO SE ESCRIBA NADA 
        
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                toggleButtonState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                toggleButtonState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                toggleButtonState();
            }
        });
        
        // BOTON ENVIAR RESPUESTA

        //ImageIcon ImagenBoton= new ImageIcon("C:\\Users\\ALFONSO BARRENECHEA\\Desktop\\PROGRAMACIÓN ORIENTADA A OBJETOS - I\\2.0\\Chat-bot\\src\\ChatBot\\ImagenEnviar.png");
        send = new JButton();
        //send.setFont(new Font("Serif", 2, 20));
        send.setBackground(new Color (196,205,219));
        send.setBounds(390, 550, 30, 30);
        send.setIcon(new ImageIcon("C:\\Users\\ALFONSO BARRENECHEA\\Desktop\\PROYECTO-USILITO\\POOI-FC-PREISF02B01TH-GRUPO-1\\PruebaFinal\\src\\images\\logoEnviarMCF30x30_1.png"));
        send.setBorder(null);
        send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //send.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 10));
        roundedPanel.add(send);
        
        
       
        //PANEL INFERIOR
	
        bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(196,205,219)); // Color #CCCCCC
        bottomPanel.setBounds(20, 546, 420, 40); // Posición y tamaño adecuado
        bottomPanel.setLayout(null); // Usar layout absoluto para posicionar los componentes
        roundedPanel.add(bottomPanel);
        
        //CREA EL PROMPT PARA PREESCRIBR ALGO EN EL PLACEHOLDER Y PROPIEDADES DEL MISMO 
        TextPrompt tp = new TextPrompt("Type Message", field);
        tp.setBackground(new Color(204, 204, 204));
        tp.setFont(new Font("Segoe UI", 0, 14));
        tp.setForeground(new Color(41, 61, 109));
	send.addActionListener(this);
	getRootPane().setDefaultButton(send);
        
        
        botLogic = new BotLogic();
			
	}
    public void actionPerformed(ActionEvent e) {
			String usuarioRespuesta = field.getText().trim().toLowerCase();
			String listaOpciones = "      Re - ingresa una de las siguientes opciones: \n" +
                                        "\n      1 Becas Y ayuda Academica 🥇\n" +
                                        "      2 Actividades extracurriculares y Clubes Estudiantiles ⛹️🏀\n" +
                                        "      3 Orientación para Practicas 👷‍♂️\n" +
					"      4 Atención Presencial 🙋\n" +
					"      5 Opciones de estudios en el extranjero 🛩️\n" +
					"      6 Trámites Estudiantiles 📋\n" +
					"      7 Pagos estudiantiles 💰\n"; 
					// "      > Quiero hacer otra pregunta 🔍\n";
		
			if (nivel == 0) { // Etapa 0: Seleccionar opción
                            //PRIMERA VUELTA EN LA QUE LAS OPCIONES SERAN DE 1 - 8 
				if (!isValidInput(usuarioRespuesta, 1, 7)) {
					area.append("\n   " + usuarioRespuesta + ": You\n");
					area.append("\n  Usilito 🦁: Por favor ingrese una clave valida ☺  (1-7).\n");
				} else {
					opcionSeleccionada = Integer.parseInt(usuarioRespuesta) - 1;
					TreeNode nodoElegido = botLogic.getRoot().getOpcion(opcionSeleccionada);
		
					if (nodoElegido != null) {
						area.append("\n  You: " + (opcionSeleccionada + 1) + "\n");
						area.append("\n  Usilito 🦁: " + nodoElegido.getMensaje() + "\n");
						nivel = 1; // Cambiar a la etapa de respuesta a la opción seleccionada
					} else {
						area.append("\n  You: " + (opcionSeleccionada + 1) + "\n");
						area.append("\n  Usilito 🦁: Opción no disponible.\n");
					}
				}
			} else if (nivel == 1) { // Etapa 1: Respuesta a la opción seleccionada
				if (!isValidInput(usuarioRespuesta, 1, 2)) {
					area.append("\n  You: " + usuarioRespuesta + "\n");
					area.append("\n  Usilito 🦁: Por favor ingrese una clave valida ☺  (1-2).\n");
				} else {
					int subOpcion = Integer.parseInt(usuarioRespuesta) - 1;
					TreeNode nodoActual = botLogic.getRoot().getOpcion(opcionSeleccionada);
		
					if (nodoActual != null && nodoActual.getOpcion(subOpcion) != null) {
						TreeNode nodoElegido = nodoActual.getOpcion(subOpcion);
						area.append("\n  You: " + (subOpcion + 1) + "\n");
						area.append("\n  Usilito 🦁: " + nodoElegido.getMensaje() + "\n");
						nivel = 2; // Cambiar a la etapa del mensaje final
					} else {
						area.append("\n  You: " + (subOpcion + 1) + "\n");
						area.append("  Usilito 🦁: Opción no disponible.\n");
					}
				}
			} else if (nivel == 2) { // Etapa 2: Mensaje final
            	for (int i = 0; i < oportunidades; i++) {
                area.append("\n  Usilito 🦁: ¿Desea hacer otra pregunta?  ( si / no )\n");
                nivel = 3; // Cambiar a la etapa de preguntar por otra consulta
                break; // Salir del bucle una vez que se haya mostrado la pregunta
				}
                    if (nivel != 3) {
		    area.append("\n  Usilito 🦁: ¡Gracias por usar el servicio! Esperamos haberte \n                ayudado.\n");
                    field.setEditable(false); // Deshabilitar la escritura en el campo de texto
				}
        	} else if (nivel == 3) { // Etapa 3: Preguntar por otra consulta
            if (usuarioRespuesta.equalsIgnoreCase("si")||usuarioRespuesta.toLowerCase().equalsIgnoreCase("sí")||usuarioRespuesta.toLowerCase().equalsIgnoreCase("chi")){
                area.append("\n  You: " + usuarioRespuesta + "\n");
                area.append("\n  Usilito 🦁: Ingresa una de las siguientes opciones:\n");
                area.append(listaOpciones);
                nivel = 0; // Volver a la etapa de selección de opción
            } else if (usuarioRespuesta.toLowerCase().equalsIgnoreCase("no")) {
                area.append("\n  You: " + usuarioRespuesta + "\n");
                area.append("\n  Usilito 🦁: ¡Gracias por usar el servicio! Esperamos haberte\n                ayudado.\n");
                field.setEditable(false); // Deshabilitar la escritura en el campo de texto
            } else {
                area.append("\n  You: " + usuarioRespuesta + "\n");
                area.append("\n  Usilito 🦁: Por favor, responde 'Si' o 'No'.\n");
            }
        }

        field.setText(""); // Limpiar el campo de texto después de cada interacción
    }
    private boolean isValidInput(String input, int min, int max) {
        try {
            int option = Integer.parseInt(input);
            return (option >= min && option <= max);
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    private void toggleButtonState() {
         if (field.getText().trim().isEmpty()) {
            send.setEnabled(false);
            send.setBackground(new Color(196, 205, 219)); // Cambia el color de fondo cuando está deshabilitado
        } else {
            send.setEnabled(true);
            send.setBackground(new Color(196, 205, 219)); // Mantiene el color de fondo cuando está habilitado
        }
    }
    public static void bot(String message) {
        area.append("  Usilito 🦁: " + message + "\n");
    }
    //public static void main(String[] args) {
      //  ChatBot cb = new ChatBot("");
        //cb.setSize(460, 620);
        //cb.setLocationRelativeTo(null);
        //cb.setVisible(true);
      
   //}
}