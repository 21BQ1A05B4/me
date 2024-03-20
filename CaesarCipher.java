import java.util.Scanner;

public class CaesarCipher {

    static final String alphabets = "abcdefghijklmnopqrstuvwxyz";

    static String encryptData(String data, int shiftKey) {
        data = data.toLowerCase();
        StringBuilder encryptString = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            int pos = alphabets.indexOf(data.charAt(i));
            int encryptPos = (shiftKey + pos) % 26;
            char encryptChar = alphabets.charAt(encryptPos);
            encryptString.append(encryptChar);
        }
        return encryptString.toString();
    }

    static String decryptData(String data, int shiftKey) {
        data = data.toLowerCase();
        StringBuilder decryptString = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            int pos = alphabets.indexOf(data.charAt(i));
            int decryptPos = (pos - shiftKey) % 26;
            if (decryptPos < 0) {
                decryptPos = (decryptPos + 26) % 26;
            }
            char decryptChar = alphabets.charAt(decryptPos);
            decryptString.append(decryptChar);
        }
        return decryptString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data to encrypt/decrypt: ");
        String data = sc.nextLine();
        System.out.print("Enter the shift key: ");
        int shiftKey = sc.nextInt();
        sc.nextLine(); // Consume newline character
        String encryptedData = encryptData(data, shiftKey);
        String decryptedData = decryptData(encryptedData, shiftKey);
        System.out.println("Encrypted Data: " + encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
    }
}
