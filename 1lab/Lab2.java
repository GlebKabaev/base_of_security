import java.util.Scanner;

public class Lab2 {

    // Метод для шифрования текста с использованием шифра Цезаря
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Метод для расшифровки текста, зашифрованного с использованием шифра Цезаря
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.println("Введите сдвиг: ");
        int shift = scanner.nextInt();

        String encryptedText = encrypt(text, shift);
        System.out.println("Зашифрованный текст: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }
}
