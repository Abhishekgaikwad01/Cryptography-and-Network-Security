import java.util.Scanner;   
   
public class Ass1CaesarCipher{   
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";   
      
    public static String encryptData(String inputStr, int Key)   {     
        String encryptStr = "";   
        for (int i = 0; i < inputStr.length(); i++)   {   
            int pos = ALPHABET.indexOf(inputStr.charAt(i));   
            int encryptPos = (Key + pos) % 26;   
            char encryptChar = ALPHABET.charAt(encryptPos);   
            encryptStr += encryptChar;   
        }   
        return encryptStr;   
    }   
        
    public static void main(String[] args)   {   
        Scanner sc = new Scanner(System.in);   
            
        System.out.println("Enter a string for encryption using Caesar Cipher: ");   
        String inputStr = sc.nextLine();   
          
        System.out.println("Enter the value of Key :");   
        int Key = Integer.valueOf(sc.nextLine());   
          
        System.out.println("Encrypted Data :"+encryptData(inputStr, Key));   
        sc.close();   
    }   
}   