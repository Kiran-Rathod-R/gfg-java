class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<a.length+b.length;i++){
            
            if(i<a.length){
            set.add(a[i]);
            }
            
            if(i>=a.length){
                set.add(b[i-a.length]);
            }
        }
        
        
        ArrayList<Integer> list=new ArrayList<>(set);
    Collections.sort(list);
    
    return list;
    }
}
