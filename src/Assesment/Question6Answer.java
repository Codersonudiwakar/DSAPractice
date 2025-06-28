package Assesment;

public class Question6Answer {
    public static int findEquilibriumPosition(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {15, 5, 3, 43, 16, 10, 20, 8, 12};
        int[] arr2 = {23, 5, 8, 32, 55, 87};

        System.out.println("Equilibrium position for arr1: " + findEquilibriumPosition(arr1));
        System.out.println("Equilibrium position for arr2: " + findEquilibriumPosition(arr2));
    }
}
