package log;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import log.consts.LogEnum;

public class Log extends Thread {

    private String path = System.getProperty("user.home") + "\\AppData\\Local\\pswgenerator\\";
    private String fileName = "log.txt", logMessage;
    private File file;
    private LogEnum flag;

    public Log(LogEnum flag, String logMessage) {
        this.file = new File(this.path + this.fileName);
        if (!this.file.exists()) {
            try {
                new File(this.path).mkdirs();
                this.file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.flag = flag;
        this.logMessage = logMessage;
    }

    @Override
    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu --- HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String s = now.format(dtf) + "\n";
        switch (this.flag) {
            case PSW_CRTD:
                s += "LOG: PASSWORD CREATED SUCCESSFULLY\nMessage: ";
                break;
            case INFO:
                s += "LOG: GENERIC INFO\nMessage: ";
                break;
            case ERR:
                s += "LOG: GENERIC ERROR\nMessage: ";
                break;
            case START:
                s += "LOG: PROGRAM STARTED\nMessage: ";
                break;
            case PSW_FILE:
                s += "LOG: PASSWORD EXPORTED IN FILE\nMessage: ";
                break;
        }
        s += this.logMessage + "\n\n";
        writeInFile(s);
        this.interrupt();
    }

    private synchronized boolean writeInFile(String str) {
        try {
            Files.write(Paths.get(this.path + this.fileName), str.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
