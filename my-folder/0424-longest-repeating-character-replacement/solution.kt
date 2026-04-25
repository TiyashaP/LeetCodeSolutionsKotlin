class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left=0;
        val frequencyArr=IntArray(26)
        var maxFrequency=0
        var maxWindowLength=0
        var windowLength=0;
        for(i in s.indices)
        {
            windowLength++
            frequencyArr[s[i]-'A']++
            maxFrequency=maxOf(frequencyArr[s[i]-'A'],maxFrequency)
            if(windowLength-maxFrequency<=k)
            {
                maxWindowLength=maxOf(windowLength,maxWindowLength)
            }
            else{
                frequencyArr[s[left]-'A']--
                left++
                windowLength--
            }
        }
        return maxWindowLength;
    }
}
