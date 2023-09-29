package store;

import log.Log;
import log.consts.LogEnum;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StorePassword extends Thread{

    private final String path = System.getProperty("user.home") + "\\Desktop\\";
    private String name = "", password = "";
    private File file;

    /**
     * It creates the object. This class is used to create a new file if not exists with the password generated.
     * If the file already exists, the writing process works in append mode.
     * @param fileName string for the chosen file's name
     * @param password string for the password to store in the new file
     */
    public StorePassword(String fileName, String password){
        this.name = fileName + ".txt";
        this.password = password;
    }

    @Override
    public void run(){
        this.file = new File(this.path + this.name);
        if(!this.file.exists()){
            try {
                if(this.file.createNewFile())
                    System.out.println("File created");
                if(writeInFile()){
                    new Log(LogEnum.PSW_CRTD, "Password created successfully.");
                }else{
                    new Log(LogEnum.ERR, "Password not created");
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }

    /**
     * It writes directly into the file.
     * @return true if the process went good, false otherwise
     */
    private synchronized boolean writeInFile(){
        try {
            Files.write(Paths.get(this.path + this.name), ("Password appena creata:\n" + this.password).getBytes(), StandardOpenOption.APPEND);
            return true;
        }catch(IOException e){
            return false;
        }
    }
}
