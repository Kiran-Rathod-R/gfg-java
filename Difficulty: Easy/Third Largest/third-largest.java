class Solution {
	public int thirdLargest(List<Integer> arr) {
		// code here
		
		Collections.sort(arr);
		
		if (arr.size()>2) {
			
			
			int a =arr.get(arr.size() - 3); 
		    return a;
		}
			else {return - 1; }
			
		}
	}
