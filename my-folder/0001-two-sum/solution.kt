class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexMap=mutableMapOf<Int, Int>()
        nums.forEachIndexed{i,num->
         indexMap[target-num]?.let{
            return intArrayOf(it,i)
         }
            indexMap[num]=i
         }
    throw IllegalArgumentException("No two sum solution")
        
    }
}
