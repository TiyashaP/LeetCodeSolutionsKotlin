class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet=nums.toHashSet()
        var lcs=0
        for(num in numSet)
        {
            if(!numSet.contains(num-1))
            {
                var cs=1;
                var next=num+1
                while(next in numSet)
                {
                  cs++
                  next++
                }
                if (lcs<cs) lcs=cs
            }
        }
        return lcs

    }
}
