class Solution {
    public int convertFive(int n) {
        // code here
        
        
        String str=n+"";
        
       str=str.replace('0','5');
       
        
        return Integer.parseInt(str);
        
        
    }
}