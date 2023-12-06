/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamiento;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class Chatbot extends JFrame implements ActionListener {
    JScrollPane sp;
    static JTextArea area = new JTextArea();
    JTextField field = new JTextField();
    JButton send;
    private BotLogic botLogic;

    private int nivel = 0; // Etapa del diálogo: 0 - Seleccionar opción, 1 - Respuesta a la opción seleccionada, 2 - Mensaje final
    private int opcionSeleccionada = 0; // Almacena la opción seleccionada por el usuario
    private final int oportunidades = 3; // Número máximo de intentos permitidos


    public Chatbot(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(232, 235, 241));

        ImageIcon ImagenBoton= new ImageIcon("C:\\Users\\ALFONSO BARRENECHEA\\Desktop\\PROGRAMACIÓN ORIENTADA A OBJETOS - I\\2.0\\Chat-bot\\src\\ChatBot\\ImagenEnviar.png");

        field = new JTextField("Escribe tu respuesta");
        send = new JButton(" > ");
        send.setFont(new Font("Serif", 2, 20));
        send.setBackground(Color.white);
        send.setBounds(390, 511, 30, 40);
        //send.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 10));
        add(send);

        area = new JTextArea();
        JScrollPane sp = new JScrollPane(area);
        sp.setBounds(18, 127, 405, 365);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(sp);

        String saludo = " \n  ¡HOLA!\n  Soy Usilito 🦁, el asistente virtual de USIL, y me gustaría poder ayudarte.\n";
        String listaOpciones = "-   Para comenzar, ingresa una de las siguientes opciones: \n" +
                                        "\n      > Becas Y ayuda Academica 🥇\n" +
                                        "      > Actividades extracurriculares y Clubes Estudiantiles ⛹️🏀\n" +
                                        "      > Orientación para Practicas 👷‍️\n" +
                                        "      > Atención Presencial 🙋\n" +
                                        "      > Opciones de estudios en el extranjero 🛩️\n" +
                                        "      > Trámites Estudiantiles 📋\n" +
                                        "      > Pagos estudiantiles 💰\n"; 
					// "      > Quiero hacer otra pregunta 🔍\n";
			area.setText(saludo + listaOpciones);
			area.setEditable(false);
			area.setBackground(new Color(232, 235, 241));
			area.setLineWrap(true);
			area.setWrapStyleWord(true);

			field.setSize(360, 40);
			field.setLocation(18, 511);
			field.setBackground(new Color(204, 204, 204));
			field.setForeground(new Color(41, 61, 109));
			field.setFont(new Font("Segoe UI", 2, 14));
			add(field);

			send.addActionListener(this);
			getRootPane().setDefaultButton(send);

			botLogic = new BotLogic();
			
		}

		public void actionPerformed(ActionEvent e) {
			String usuarioRespuesta = field.getText().trim().toLowerCase();
			String listaOpciones = "      Re - ingresa una de las siguientes opciones: \n" +
                                        "\n      > Becas Y ayuda Academica 🥇\n" +
                                        "      > Actividades extracurriculares y Clubes Estudiantiles ⛹️🏀\n" +
                                        "      > Orientación para Practicas 👷‍♂️\n" +
					"      > Atención Presencial 🙋\n" +
					"      > Opciones de estudios en el extranjero 🛩️\n" +
					"      > Trámites Estudiantiles 📋\n" +
					"      > Pagos estudiantiles 💰\n"; 
					// "      > Quiero hacer otra pregunta 🔍\n";
		
			if (nivel == 0) { // Etapa 0: Seleccionar opción
                            //PRIMERA VUELTA EN LA QUE LAS OPCIONES SERAN DE 1 - 8 
				if (!isValidInput(usuarioRespuesta, 1, 7)) {
					area.append("\n  You: " + usuarioRespuesta + "\n");
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
                area.append("\n  Usilito 🦁: ¿Desea hacer otra pregunta? (Sí/No)\n");
                nivel = 3; // Cambiar a la etapa de preguntar por otra consulta
                break; // Salir del bucle una vez que se haya mostrado la pregunta
				}
                    if (nivel != 3) {
					area.append("\n  Usilito 🦁: ¡Gracias por usar el servicio! Esperamos haberte ayudado.\n");
                    field.setEditable(false); // Deshabilitar la escritura en el campo de texto
				}
        	} else if (nivel == 3) { // Etapa 3: Preguntar por otra consulta
            if (usuarioRespuesta.equalsIgnoreCase("si")) {
                area.append("\n  You: " + usuarioRespuesta + "\n");
                area.append("\n  Usilito 🦁: Ingresa una de las siguientes opciones:\n");
                area.append(listaOpciones);
                nivel = 0; // Volver a la etapa de selección de opción
            } else if (usuarioRespuesta.equalsIgnoreCase("no")) {
                area.append("\n  You: " + usuarioRespuesta + "\n");
                area.append("\n  Usilito 🦁: ¡Gracias por usar el servicio! Esperamos haberte ayudado.\n");
                field.setEditable(false); // Deshabilitar la escritura en el campo de texto
            } else {
                area.append("\n  You: " + usuarioRespuesta + "\n");
                area.append("\n  Usilito 🦁: Por favor, responde 'Sí' o 'No'.\n");
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