class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        Arrays.sort(arr);
        
        
        
        
        
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                list.add(arr[i]);
                arr[i]=0;
            }
            
            
            
            
        }
        int sum=0;
        
        int total=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            total+=i+1;
            
        }
        
        
        int mis=total-sum;
        
        list.add(mis);
        
        
        
        return list;
    }
}
