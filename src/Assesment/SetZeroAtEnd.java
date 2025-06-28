package Assesment;

public class SetZeroAtEnd {

	public static void main(String[] args) {
		int arr[]= {3,5,0,3,0,2,0,1,0};
		int count=0;
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
			else {
				count++;
			}
		}
		while (j<arr.length) {
			arr[j++]=0;
		}
		
		for(int i:arr) {
			System.out.print(i+"'");
		}
	}
}
