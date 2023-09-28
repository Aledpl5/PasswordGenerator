package log;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Log extends Thread {

    private String path = System.getProperty("user.home") + "\\AppData\\Local\\pswgenerator\\";
    private String fileName = "log.txt";
    private File file;

    public Log() {
        this.file = new File(this.path + this.fileName);
        if(!this.file.exists()){
            try {
                new File(this.path).mkdirs();
                this.file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        writeInFile("Test\n\n");
        this.interrupt();
    }

    private synchronized boolean writeInFile(String str){
        try {
            Files.write(Paths.get(this.path + this.fileName), str.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
