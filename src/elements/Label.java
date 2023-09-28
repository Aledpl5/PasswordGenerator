package elements;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Label extends JLabel {

    /**
     * 
     * @param text text of the Label
     * @param x position in x
     * @param y position in y
     * @param width Label's width
     * @param height Label's height
     * @param isBold boolean value used to create an bold Label
     */
    public Label(String text, int x, int y, int width, int height, boolean isBold) {
        this.setText(text);
        this.setBounds(x, y, width, height);
        if (isBold) {
            this.setFont(new Font("Verdana", Font.BOLD, 15));
        }
    }

    /**
     * 
     * @param text text of the Label
     * @param x position in x
     * @param y position in y
     * @param width Label's width
     * @param height Label's height
     * @param isBold boolean value used to create an bold Label
     * @param color Label's custom color
     */
    public Label(String text, int x, int y, int width, int height, boolean isBold, Color color) {
        this.setText(text);
        this.setBounds(x, y, width, height);
        this.setForeground(color);
        if (isBold) {
            this.setFont(new Font("Verdana", Font.BOLD, 15));
        }
    }

}
