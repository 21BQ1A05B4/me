import java.util.Scanner;

public class OneTimePad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String key = sc.nextLine();
        if(data.length() != key.length()) {
            return;
        }
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = (char)(data.charAt(i) ^ key.charAt(i));
            cipherText.append(c);
        }
        for (int i = 0; i < cipherText.length(); i++) {
            System.out.println(Integer.toString((int)cipherText.charAt(i)) + " ");
        }

        StringBuilder decryptText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char d = (char)(cipherText.charAt(i) ^ key.charAt(i));
            decryptText.append(d);
        }
        for (int i = 0; i < decryptText.length(); i++) {
            System.out.println(decryptText.toString());
        }
    }
}
