package Assesment;

import java.util.HashMap;
import java.util.Map;

public class FindTwoChar {
    public static void findRepeatedCharacters(String input) {
        input = input.toLowerCase();
        
        Map<Character, Integer> charCount = new HashMap<>();
                for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
                boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 2) {
                System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No character is repeated more than twice.");
        }
    }

    public static void main(String[] args) {
        String input = "It is raining today in Bangalore";
        findRepeatedCharacters(input);
    }
}
