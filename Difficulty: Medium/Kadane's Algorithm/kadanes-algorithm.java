class Solution {
	int maxSubarraySum(int[] arr) {
		// Code here
		int max_sum = Integer.MIN_VALUE;
		
		int current_sum = 0;
		
		for (int i = 0; i<arr.length; i++) {
			current_sum += arr[i];
			
			max_sum = Math.max(current_sum, max_sum);
			if (current_sum<0) {
				current_sum = 0;
			}
			
		}
		
		return max_sum;
	}
	
}
