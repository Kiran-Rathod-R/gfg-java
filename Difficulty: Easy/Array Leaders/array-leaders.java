class Solution {
	static ArrayList<Integer> leaders(int arr[]) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[arr.length - 1]);
		int maxright=arr[arr.length - 1];
		
		for (int i = arr.length - 2; i >= 0; i--) {
			
			if (arr[i] >= maxright) {
				maxright = arr[i];
				list.add(arr[i]);
			}
			
		}
		
		Collections.reverse(list);
		
		return list;
	}
}
