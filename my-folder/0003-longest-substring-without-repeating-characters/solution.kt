class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left=0
        val frequencyArr=IntArray(128)
        var maxLength=0
        for(right in s.indices)
        {
              frequencyArr[s[right].code]++ 

             while(frequencyArr[s[right].code]>1) 
             {
             frequencyArr[s[left].code]--
             left++
           }
           maxLength=maxOf(right-left+1,maxLength)
        }
        return maxLength
        
        
    }
}
