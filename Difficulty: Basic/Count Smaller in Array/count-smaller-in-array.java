
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.size();i++){
            
            if(x>=arr.get(i)){
                count++;
            }
        }
        
        return count;
    }
}