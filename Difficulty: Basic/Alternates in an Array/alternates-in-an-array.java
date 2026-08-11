class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> art=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i=i+2){
            art.add(arr[i]);
        }
        
        return art;
    }
}