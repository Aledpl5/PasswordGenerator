package elements;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Button extends JButton {

    /**
     * Creates the button with the text given
     * @param txt text inside the button
     */
    public Button(String txt) {
        super(txt);
        setStyle();
    }

    /**
     * Creates the button with the text, width and height given
     * @param txt text inside the button
     * @param width button's width
     * @param height button's height
     */
    public Button(String txt, int width, int height) {
        super(txt);
        this.setSize(width, height);
        setStyle();
    }

    private void setStyle() {
        // sets the button's background
        this.setBackground(new Color(97, 255, 51));

        // sets the button's font
        this.setFont(new Font("Serif", Font.PLAIN, 15));

        // sets the button's foreground
        this.setForeground(Color.BLACK);

        roundButton();
    }

    private void roundButton() {
        this.setOpaque(false);
        this.setFocusPainted(false);
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
    }

}
