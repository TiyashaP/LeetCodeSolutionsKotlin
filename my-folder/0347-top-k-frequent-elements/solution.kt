class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap=mutableMapOf<Int,Int>()
        for(num in nums){
            frequencyMap[num]=frequencyMap.getOrDefault(num,0)+1
        }
        val frequencyArray=Array(nums.size+1){mutableListOf<Int>()}
        for((num,count) in frequencyMap)
            frequencyArray[count].add(num)
        var result=mutableListOf<Int>()    
        for(i in frequencyArray.indices.reversed())
            { for(num in frequencyArray[i])
            {
                result.add(num)
                if(result.size==k)
                     return result.toIntArray()
            }
            }
         return result.toIntArray()   
        
    }
}
