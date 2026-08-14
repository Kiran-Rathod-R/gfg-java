class Solution {
    public int maxProfit(int[] prices) {
        // code here
        
        
        int n =prices.length;
        
        int profit=0;
        int buy=prices[0];
        
        for(int i=0;i<n-1;i++){
            
        int sell=prices[i];
        
        if(buy>prices[i]){
            buy=prices[i];
            
        }
        
        if(sell>buy && sell>prices[i+1]){
            profit+=prices[i]-buy;
            buy=prices[i];
        }
        
        if(i==n-2 && prices[n-1]>buy){
            profit+=prices[n-1]-buy;
        }
            
        }
        
        return profit;

    }
}