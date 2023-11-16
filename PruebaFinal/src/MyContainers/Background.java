package MyContainers;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Background extends JPanel {
    
    public Background(){
        setOpaque(false);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Color color1 = new Color(0x233e71);
        Color color2 = new Color(0x6d7fa9);

        Graphics2D G2D = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);

        G2D.setPaint(gp);
        G2D.fillRect(0, 0, w, h);
    }
}
