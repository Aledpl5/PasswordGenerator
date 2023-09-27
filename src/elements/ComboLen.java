package elements;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

public class ComboLen extends JComboBox<String>{

    private Color borderColor = Color.BLUE;
    private String len[] = {"16", "32", "64"};
    
    public ComboLen(){
        add();
        this.setSelectedIndex(0);
        setStyle();
    }

    private void add(){
        this.addItem("-- Seleziona --");
        for(int i = 0; i < len.length; i++){
            this.addItem(len[i]);
        }
    }

    private void setStyle(){
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, this.borderColor));
    }

}
