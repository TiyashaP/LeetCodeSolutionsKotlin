class Solution {
    public int maxCoins(int[] piles) {
	       // int maxSum=0;
	         Integer[] pileArr=Arrays.stream(piles).boxed().toArray(Integer[]::new);
	         Integer sum=Arrays.stream(piles).reduce(0,Integer::sum);
	        if(piles.length<3 && piles.length>100000 && piles.length%3==0)
	            return 0;
	       
	        else
	        {
	            Arrays.sort(pileArr,Collections.reverseOrder());
	            for(int i=0;i<(pileArr.length/3)*2;i=i+2)
	            {
	                sum-=pileArr[i];
	            }
	            Arrays.sort(pileArr);
	            for(int i=0;i<(pileArr.length/3);i=i+1)
	            {
	                sum-=pileArr[i];
	            }
	        }
	        return sum;
	    }
}
