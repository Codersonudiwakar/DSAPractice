package Searching;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {5,2,8,3,32,4,2};
		int target=8;
		System.out.println(linearSearch(arr, target));
		
	}

}
