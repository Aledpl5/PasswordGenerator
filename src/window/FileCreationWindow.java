package window;

import javax.swing.*;

import elements.Label;
import elements.Button;
import elements.TextField;
import events.CreateFile;

public class FileCreationWindow extends JFrame{

    private Button create;
    private Label label;
    private TextField fileNameTextField;

    private String psw;

    public FileCreationWindow(String psw){
        JPanel pn = new JPanel(null);
        setLabel();
        setTextField();
        setButton();
        pn.add(this.label);
        pn.add(this.create);
        pn.add(this.fileNameTextField);
        this.add(pn);
        setFrame();
    }

    private void setFrame(){
        this.setResizable(false);
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * It creates the label object.
     */
    private void setLabel() {
        this.label = new Label("Inserisci il nome del file che vuoi creare con la password al suo interno:", 1, 1, 80, 25, true );
    }

    private void setTextField(){
        this.fileNameTextField = new TextField(25, 25, 60, 30);
    }

    private void setButton(){
        this.create = new Button("Create file", 350, 45, 100, 50);
        this.create.addActionListener(new CreateFile(this.fileNameTextField.getText(), this.psw));
    }

}
