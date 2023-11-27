package Main;

import javax.swing.JPanel;
import GUI.Bienvenida;
import javax.swing.UIManager;

public class Principal extends JPanel {
    
    public static void main(String[] args) {  
        Bienvenida interfaz = new Bienvenida();
        interfaz.setVisible(true);
    }
}

