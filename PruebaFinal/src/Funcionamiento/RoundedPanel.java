package Funcionamiento;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedPanel extends JPanel {
    private int radius;

    public RoundedPanel(int radius) {
        super();
        this.radius = radius;
        setOpaque(false); // Hacer el JPanel transparente
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape roundedRect = new RoundRectangle2D.Double(0, 0, width - 1, height - 1, radius, radius);
        graphics.setColor(getBackground());
        graphics.fill(roundedRect);
        graphics.setColor(getForeground());
        graphics.draw(roundedRect);
        graphics.dispose();
    }
}
