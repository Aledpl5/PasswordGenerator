package elements;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class TextField extends JTextField{

    private final Color borderColorDefault = Color.BLUE;

    /**
     * Creates and set the text field's size and position int the window
     * @param width
     * @param height
     */
    public TextField(int x, int y, int width, int height){
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, this.borderColorDefault));
        this.setBounds(x, y, width, height);
    }

    /**
     * Creates and sets the text field's size, position in the window and the bottom border's color
     * @param borderColor
     * @param width
     * @param height
     */
    public TextField(Color borderColor, int x, int y, int width, int height){
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, borderColor));
        this.setBounds(x, y, width, height);
    }
    
}
