class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> art=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==i+1){
                art.add(arr[i]);
                
            }
        
            
        }
        
        
        
        return art;
    }
    
    
}
