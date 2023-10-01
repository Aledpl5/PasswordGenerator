package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import store.StorePassword;

public class CreateFile implements ActionListener {

    private String fileName, psw;

    public CreateFile(String fileName, String psw){
        this.fileName = fileName;
        this.psw = psw;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new StorePassword(fileName, psw).start();

    }
}
