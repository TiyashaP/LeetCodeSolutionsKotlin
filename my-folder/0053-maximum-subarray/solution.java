class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0];
        int maxTillHere=nums[0];
        int startindexOfMaxSoFar=0;
        for(int i=1;i<nums.length;i++)
        {
            int sumArr=maxTillHere+nums[i];
            maxTillHere=sumArr>nums[i]?sumArr:nums[i];
            startindexOfMaxSoFar=maxTillHere!=nums[i]?startindexOfMaxSoFar:i;
            if(maxSoFar<maxTillHere)
            {
                maxSoFar=maxTillHere;

            }


        }

       return maxSoFar;

        
    }
}
