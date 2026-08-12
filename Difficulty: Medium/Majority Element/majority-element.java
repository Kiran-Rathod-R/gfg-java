class Solution {
	int majorityElement(int arr[]) {
		// code here
		int n = arr.length;
		Arrays.sort(arr);
		int maxcount = 1;
		int count=1;
		int ans=arr[0];
		
		
		for(int i=1;i<n;i++){
		    
		    if(arr[i]==arr[i-1]){
		        count++;
		        
		    }
		    else{
		        count=1;
		    }
		    
		    
		    if(count>maxcount){
		        maxcount=count;
		        ans=arr[i];
		    }
		}
		
		if(maxcount>n/2){
		    return ans;
		}
		
		return -1;
		
	}
	
}
