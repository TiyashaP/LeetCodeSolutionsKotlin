class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left=0;
        val frequencyArr=IntArray(26)
        var maxFrequency=0
        var maxWindowLength=0
        for(right in s.indices)
        {
            frequencyArr[s[right]-'A']++
            maxFrequency=maxOf(frequencyArr[s[right]-'A'],maxFrequency)
            while((right-left+1)-maxFrequency>k)
            {
                frequencyArr[s[left]-'A']--
                left++
            }
            maxWindowLength=maxOf(right-left+1,maxWindowLength)
        }
        return maxWindowLength;
    }
}
