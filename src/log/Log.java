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

    private final String path = System.getProperty("user.home") + "\\AppData\\Local\\pswgenerator\\";
    private final String  fileName = "log.txt";
    private final String logMessage;
    private final File file;
    private final LogEnum flag;

    /**
     * It creates the Log object.
     * @param flag enum for the log
     * @param logMessage message to be written in the log file
     */
    public Log(LogEnum flag, String logMessage) {
        this.file = new File(this.path + this.fileName);
        if (!this.file.exists()) {
            try {
                if(new File(this.path).mkdirs())
                    System.out.println("Created dirs");
                if(this.file.createNewFile())
                        System.out.println("File created");
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
        if(writeInFile(s)){
            System.out.println("Log successfully written");
        }else{
            System.out.println("Error log");
        }
        this.interrupt();
    }

    /**
     * It writes in the file the composed string for log file
     * @param str log string
     * @return true if the process went good, false otherwise
     */
    private synchronized boolean writeInFile(String str) {
        try {
            Files.write(Paths.get(this.path + this.fileName), str.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
