package window;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame{

    private final int WIDTH = 500, HEIGHT = 350;
    JPanel pnl;

    public Window(){
        this.pnl = new JPanel(null);

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
