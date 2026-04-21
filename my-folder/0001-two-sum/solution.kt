class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var indexMap=mutableMapOf<Int,Int>()
        nums.forEachIndexed{ i,v ->
        val remainder=target-v
        if(remainder in indexMap)
         return intArrayOf(i,indexMap[remainder]!!)
        else
          indexMap[v]=i
        }
        return intArrayOf()
    }
}
