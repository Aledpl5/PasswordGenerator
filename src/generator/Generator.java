package generator;

import java.security.SecureRandom;

public class Generator {
    
    private final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String lower = "abcdefghijklmnopqrstuvwxyz";
    private final String numbers = "1234567890";
    private final String symbols = "()[]{}?'^,;.:-_#+-*/";
    private String tot = upper + lower + numbers + symbols;
    private int length = 16;

    /**
     * In this case, the lenght of the password will be 16 as default value
     */
    public Generator(){}

    /**
     * In this case, the lenght is passed to the function, in order to create a password with a custom lenght.
     * @param len lenght of the password
     */
    public Generator(int len){
        this.length = len;
    }

    /**
     * It returns the generated password
     * @return generated password 
     */
    public String getPassword(){
        return generatePassword();
    }

    
    private String generatePassword(){

        SecureRandom r = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < this.length; i++){
            int index = r.nextInt(tot.length() - 1);
            sb.append(tot.charAt(index));
        }

        return sb.toString();
    }

}
