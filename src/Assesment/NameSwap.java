package Assesment;

public class NameSwap {
    public static void main(String[] args) {
        String name = "Aayush";
        String swappedName = swapName(name);
        System.out.println("Original name: " + name);
        System.out.println("Swapped name: " + swappedName);
    }

    public static String swapName(String name) {
        StringBuilder result = new StringBuilder();
        
        for (char c : name.toCharArray()) {
            if (Character.isLetter(c)) {
                char swappedChar = (char) ('a' + 'z' - Character.toLowerCase(c));
                if (Character.isUpperCase(c)) {
                    swappedChar = Character.toUpperCase(swappedChar);
                }
                result.append(swappedChar);
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
