class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numSet=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxCount=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            if(!numSet.contains(nums[i]-1))
            { count++;
             int startNumber=nums[i]+1;
             while(numSet.contains(startNumber))
             {
                 startNumber++;
                 count++;
             }
             if(count>maxCount)
                 maxCount=count;
            }
            
        }
        return maxCount;
        
    }
}
