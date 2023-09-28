package elements;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import java.awt.Color;

public class TextArea extends JTextArea {

    private final Color defaultBorderColor = Color.BLUE;

    /**
     * It creates the TextArea with the default border color (bottom)
     * @param x position in x
     * @param y position in y
     * @param width width of the TextArea
     * @param height height of the TextArea
     */
    public TextArea(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, this.defaultBorderColor));
    }

    /**
     * It creates the TextArea with a custom color of the border (bottom)
     * @param x position in x
     * @param y position in y
     * @param width width of the TextArea
     * @param height height of the TextArea
     * @param border custom color of the border
     */
    public TextArea(int x, int y, int width, int height, Color border) {
        this.setBounds(x, y, width, height);
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, border));
    }

    /**
     * It clears the TextArea from the text inside
     */
    public void clear(){
        this.setText("");
    }

}
