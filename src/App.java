import window.Window;
import window.FileCreationWindow;
public class App {
    public static void main(String[] args){
        new FileCreationWindow("password").setVisible(true);
        //new Window().setVisible(true);
    }
}
