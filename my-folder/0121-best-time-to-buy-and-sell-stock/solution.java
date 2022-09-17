class Solution {
    public int maxProfit(int[] prices) {
        int arrLength=prices.length;
        int maxPrice=prices[arrLength-1];
        int maxProfit=0;
        for(int i=arrLength-1;i>=0;i--)
        {
             if(prices[i]<maxPrice)
             {
                 prices[i]=maxPrice-prices[i];
                 if(prices[i]>maxProfit)
                     maxProfit=prices[i];
             }
            else
            {maxPrice=prices[i];
             prices[i]=-1;
            }
        }
        
        return maxProfit;
        
    }
}
