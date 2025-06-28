package Assesment;

public class StringCheck {
    public static void main(String[] args) {
        System.out.println("JAVA value: " + calculateValue("JAVA"));
        System.out.println("PYTHON value: " + calculateValue("PYTHON"));
        
        // Test with other strings
        System.out.println("RUBY value: " + calculateValue("RUBY"));
        System.out.println("CPLUSPLUS value: " + calculateValue("CPLUSPLUS"));
    }
    
    public static int calculateValue(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int value = 0;
        for (char c : str.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                throw new IllegalArgumentException("Input must be uppercase letters only");
            }
            value += (c - 'A' + 1) * 2;
        }
        
        return value;
    }
}
