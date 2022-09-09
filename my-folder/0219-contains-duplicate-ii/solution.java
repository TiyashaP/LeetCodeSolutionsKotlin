class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> integerMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(integerMap.containsKey(nums[i]))
            {
                int value=integerMap.get(nums[i]);
                if(Math.abs(value-i)<=k)
                    return true;
                else
                    integerMap.put(nums[i],i);
                
            }
            else 
               integerMap.put(nums[i],i); 
        }
        return false;
    }
}
