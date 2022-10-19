class Solution {
    public int maxProfit(int[] prices) {
        
        int[] maxPrice=new int[prices.length];
        int maxPricel=0;
        for(int i=prices.length-1;i>=0;i--)
        {
            int price=prices[i];
            maxPrice[i]=maxPricel;
            if(price>maxPricel)
                maxPricel=price;
            
        }
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            int profit=maxPrice[i]-prices[i];
            if(profit>maxProfit)
                maxProfit=profit;
            
        }
        
        return maxProfit;
        
    }
}
