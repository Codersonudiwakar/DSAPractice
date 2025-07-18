package Searching;

public class BinarySearch {
	public static int binarySearch(int arr[],int target) {
		int left=0,right=arr.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			if (arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {2, 3, 4, 5, 8, 32};
		int target=8;
		System.out.println(binarySearch(arr, target));
	}

}
