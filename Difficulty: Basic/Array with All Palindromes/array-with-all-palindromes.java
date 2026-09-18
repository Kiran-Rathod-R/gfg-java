class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            
            
            int temp=arr[i];
            
            int rev=0;
            
            while(temp>0){
                rev=rev*10+temp%10;
                temp=temp/10;
            }
            
            if(arr[i]!=rev){
                flag=false;
                
            }
            
            
        }
        
        
        return flag;
    }
}