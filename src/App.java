import log.Log;
import log.consts.LogEnum;

public class App {
    public static void main(String[] args) throws Exception {
        Log c = new Log(LogEnum.PSW_CRTD, "Password created successfully");
        c.start();
    }
}
