class Solution {
    public static int largest(int[] arr) {
        // code here
        
        int lar=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]){
                lar=arr[i];
            }
        }
        
        return lar;
    }
}
