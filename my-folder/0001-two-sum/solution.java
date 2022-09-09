class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> numberCountHashMap=new HashMap<Integer,Integer>();
        int[] indices=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int resTarget=target-nums[i];
            if(numberCountHashMap.containsKey(resTarget))
            {
              
                indices[0]=numberCountHashMap.get(resTarget);
                indices[1]=i;  
                break;
            }
            else
            {
            
               numberCountHashMap.put(nums[i],i); 
            }
        }
        return indices;
    }
}
