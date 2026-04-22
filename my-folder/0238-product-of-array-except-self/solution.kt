class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var prefix=1
        val result=IntArray(nums.size)
        for(i in nums.indices)
        {
            result[i]=prefix
            prefix=prefix*nums[i]
        }
        var suffix=1
        for(i in nums.indices.reversed())
        {
            result[i]=result[i]*suffix
            suffix=suffix*nums[i]
        }
        return result
    }
}
