class Solution {
    void segregate0and1(int[] arr) {
        // code here
        
        int zero=0;
        int one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else{
                one++;
            }
            
        }
        
        
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        
        for(int i=zero;i<arr.length;i++){
            arr[i]=1;
        }
        
        
        
        
    }
}
