package window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

// import elements.Button;
// import elements.Label;
// import elements.TextArea;
// import elements.TextField;
// import elements.ComboLen;

import java.awt.event.ActionListener;


public class Window extends JFrame{

    JPanel p;
    private final int WIDTH = 850, HEIGHT = 500;
    JLabel lbl;
    JComboBox cb;
    JButton btn;

    public Window(){
        this.p = new JPanel(null);
        
        setJLabel();
        setComboBox();
        setButton();

        addElement();
        setPos();

        setFrame();
    }

    private void setButton() {
        btn= new JButton("Genera");
    }

    private void setComboBox() { cb = new JComboBox(); }

    private void addElement() {
        this.p.add(lbl);
        this.p.add(cb);
        this.p.add(btn);
    }

    private void setPos() {
        lbl.setBounds(5,20, 5, 20);
        cb.setBounds(10,20, 20, 5);
        btn.setBounds(30,20, 5, 5);
    }

    private void setJLabel() {
        lbl = new JLabel("Seleziona la grandezza della password: ");
    }

    /**
     * Function that allows to give the basic attributes to the frame
     * @return nothing
     */
    private void setFrame(){
        this.setResizable(false);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GENERATORE PASSWORD");
        //this.setLocation(800, 400);
    }
}
