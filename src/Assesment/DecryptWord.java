package Assesment;

public class DecryptWord {
    public static String decrypt(String encryptedWord) {
        StringBuilder decryptedWord = new StringBuilder();
        
        for (char c : encryptedWord.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) ('A' + (25 - (c - 'A')));
                decryptedWord.append(decryptedChar);
            } else {
                decryptedWord.append(c);
            }
        }
        
        return decryptedWord.toString();
    }

    public static void main(String[] args) {
        String encryptedWord = "XCSXP";
        String decryptedWord = decrypt(encryptedWord);
        System.out.println("Encrypted word: " + encryptedWord);
        System.out.println("Decrypted word: " + decryptedWord);
    }
}