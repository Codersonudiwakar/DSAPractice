package Assesment;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Integer[] numbers = {15, 5, 78, 3, 100, 2, 4};
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(numbers));
        
        for (int num : numberSet) {
            List<Integer> factors = findFactorsInSet(num, numberSet);
            if (!factors.isEmpty()) {
                System.out.print(num + ": ");
                System.out.println(factors);
            }
        }
    }
    
    private static List<Integer> findFactorsInSet(int num, Set<Integer> set) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (set.contains(i) && i != num) {
                    factors.add(i);
                }
                if (set.contains(num / i) && num / i != num) {
                    factors.add(num / i);
                }
            }
        }
        return factors;
    }
}