class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice=Int.MAX_VALUE
        var bestProfit=0
        for(i in prices.indices)
        {
             minPrice=minOf(prices[i],minPrice)
             bestProfit=maxOf(prices[i]-minPrice,bestProfit)
        }
        return bestProfit
        
    }
}
