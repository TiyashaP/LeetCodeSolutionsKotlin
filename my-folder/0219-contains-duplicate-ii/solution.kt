class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numSet=mutableSetOf<Int>()
        for(i in nums.indices)
        {
            if(i>k)
              numSet.remove(nums[i-k-1])
            if(!numSet.add(nums[i])) return true
        }
        return false
    }
}
