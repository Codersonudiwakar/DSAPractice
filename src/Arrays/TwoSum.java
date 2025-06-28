package Arrays;

import java.util.HashMap;

public class TwoSum {
	public static int []twoSum(int []nums,int target){

	      HashMap<Integer, Integer> map = new HashMap<>();
	        int[] ans = new int[2];

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i]; 
	            if (map.containsKey(complement)) {
	                ans[0] = map.get(complement);
	                ans[1] = i;
	            }
	             map.put(nums[i], i);
	        }
	            return ans;
		
	}
	public static void main(String[] args) {
       int arr[]= {3,6,2,8,4,1,4,7};
       int target=9;
int res[]=twoSum(arr, target);     
for (int i = 0; i < res.length; i++) {
	System.out.print(i);

}
	}

}
