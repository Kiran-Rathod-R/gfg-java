class Solution {
	public int minJumps(int[] arr) {
		// code here
		int n = arr.length;
		
		if (n <= 1) {
			return 0;
		}
		
		if (arr[0] == 0) {
			return - 1;
		}
		
		int jump = 1;
		int max_reach = arr[0];
		int step = arr[0];
		
		for (int i = 1; i<arr.length; i++) {
			
			if (i == n - 1) {
				return jump;
			}
			
			max_reach = Math.max(max_reach, i + arr[i]);
			step--;
			if (step == 0) {
				jump++;
				if (i >= max_reach) {
					return - 1;
				}
				step = max_reach - i;
			}
		}
		
		return - 1;
		
	}
}
