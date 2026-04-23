class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        for(i in nums.indices)
        {
            while(nums[i] in 1..nums.size && nums[nums[i]-1]!=nums[i]){
                val correctIndex=nums[i]-1
                val temp=nums[correctIndex]
                nums[correctIndex]=nums[i]
                nums[i]=temp
            }   
        }
         for(i in nums.indices)
         {
            if(nums[i]!=i+1)
               return i+1
         }
         return nums.size+1

    }
}
