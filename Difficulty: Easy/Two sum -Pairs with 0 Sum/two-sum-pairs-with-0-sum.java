class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        
        
       
        
        
        ArrayList<ArrayList<Integer>> outerList=new ArrayList<>();
        
        Arrays.sort(arr);
        
        int str=0;
        int rear=arr.length-1;
        
        while(str<rear){
            int sum=arr[str]+arr[rear];
            if(sum==0){
                 ArrayList<Integer> list=new ArrayList<>();
                list.add(arr[str]);
                list.add(arr[rear]);
                
                
                 outerList.add(list);
                  while (str < rear && arr[str] == arr[str + 1]) {
                    str++;
                }

                // Skip duplicate right values
                while (str < rear && arr[rear] == arr[rear - 1]) {
                    rear--;
                }
                
                str++;
                rear--;
               
            }
            else if(sum>0){
                rear--;
                
            }else{
                str++;
            }
        }
        
        
        return outerList;
        
        
        
    }
}
