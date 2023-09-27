package window;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import elements.Button;
import elements.TextField;

public class Window extends JFrame{

    private final int WIDTH = 500, HEIGHT = 350;
    JPanel pnl;
    private Button btn; 
    private TextField fld;

    public Window(){
        this.pnl = new JPanel(null);

        this.btn = new Button("TEst");
        this.btn.setBounds(20, 30, 90, 70);

        this.fld = new TextField(20, 120, 50, 25);
        this.fld.setBackground(Color.LIGHT_GRAY);
        this.pnl.add(this.fld);
        this.pnl.add(this.btn);
        this.add(this.pnl);
        setFrame();
    }

    /**
     * Function that allows to give the basic attributes to the frame
     * @return nothing
     */
    private void setFrame(){
        this.setResizable(false);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
