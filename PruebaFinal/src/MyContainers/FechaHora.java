/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyContainers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FechaHora extends JPanel {
    private JLabel labelHora;
    private JLabel labelFecha;
    public FechaHora() {
        initComponents();
        iniciarReloj();
    }

    private void initComponents() {
        // Configuración de tu interfaz gráfica
        labelHora = new JLabel("Hora: ");
        labelFecha = new JLabel("Fecha: ");

        add(labelHora);
        add(labelFecha);

        // Resto de la inicialización de componentes y diseño de la interfaz
    }

    private void iniciarReloj() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarHoraYFecha();
            }
        });
        timer.start();
    }

    private void mostrarHoraYFecha() {
        Date ahora = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:MM:SS");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("DD/MM/AAAA");

        String horaActual = formatoHora.format(ahora);
        String fechaActual = formatoFecha.format(ahora);

        labelHora.setText("Hora: " + horaActual);
        labelFecha.setText("Fecha: " + fechaActual);
    }
}