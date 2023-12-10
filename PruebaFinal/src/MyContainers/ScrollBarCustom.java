package MyContainers;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {
    
    public ScrollBarCustom(){
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8,8));
        setForeground(new Color(0x6d7fa9));
        setBackground(new Color(232,235,241));
    }
}