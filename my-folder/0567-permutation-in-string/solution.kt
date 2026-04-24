class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length>s2.length) return false
        val need=IntArray(26)
        for(ch in s1)
         need[ch-'a']++
        val occurances=IntArray(26)
        val k=s1.length
        for(i in s2.indices)
        {
              occurances[s2[i]-'a']++
            if(i>=k)
             occurances[s2[i-k]-'a']--
            if(need.contentEquals(occurances))  
              return true
            
        }
        return false
    }
}
