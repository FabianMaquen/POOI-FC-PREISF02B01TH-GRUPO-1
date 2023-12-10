package MyContainers;

import javax.swing.JComboBox;

public class ComboBoxSuggestion extends JComboBox {

    public ComboBoxSuggestion() {
        setUI(new ComboSuggestionUI());
    }
}