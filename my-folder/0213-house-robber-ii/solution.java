class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int sumIncluding1stHouse=robRec(nums,0,nums.length-1);
        int sumIncludingLastHouse=robRec(nums,1,nums.length);
        int total=Math.max(sumIncluding1stHouse,sumIncludingLastHouse);
        return total;
        
        
    }
    
    public static int robRec(int[] cost,int start,int end) {
            int maxAllowedPrevSum=0,maxPreviousSum=0,total=0;
            for(int i=start;i<end;i++)
            {if(i==start)
            {
                maxAllowedPrevSum += cost[i];
                total=maxAllowedPrevSum;
            }
            else if(i==start+1){
                maxPreviousSum += cost[i];
                total=Math.max(maxAllowedPrevSum,maxPreviousSum);
            }
            else{
                total=Math.max(maxAllowedPrevSum+cost[i],maxPreviousSum);
                maxAllowedPrevSum=Math.max(maxAllowedPrevSum,maxPreviousSum);
                maxPreviousSum=total;
            }
            }
            return total;
        }
}
