import java.util.Scanner;

class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading shift value
        System.out.print("Enter the shift value: ");
        int shift = sc.nextInt();

        // Consume newline
        sc.nextLine();

        // Reading text to encrypt
        System.out.print("Enter the text to encrypt: ");
        String text = sc.nextLine();

        // Encrypting the text
        String encryptedText = encrypt(text, shift);

        // Displaying the encrypted text
        System.out.println("The encrypted text is: " + encryptedText);
    }

    // Method to encrypt the text using Caesar Cipher
    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }

            encrypted.append(ch);
        }

        return encrypted.toString();
    }
}
