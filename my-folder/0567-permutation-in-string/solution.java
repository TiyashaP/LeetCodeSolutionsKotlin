class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count=new int[26];
        int[] s2count=new int[26];
        
        if(s1.length()>s2.length())
            return false;
        for(int i=0;i<s1.length();i++)
        {
            s1Count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;
        }
        
        int windowStart=0;
        int windowEnd=s1.length();
        while(windowEnd<s2.length())
        {
            if(matches(s1Count,s2count))
                return true;
            
            s2count[s2.charAt(windowStart)-'a']--;
            s2count[s2.charAt(windowEnd)-'a']++;
            
            windowStart++;
            windowEnd++;
        }
        
        if(matches(s1Count,s2count))
                return true;
        else
            return false;
    }
    
    public boolean matches(int[] s1count,int[] s2count)
    {
        for(int i=0;i<26;i++)
        {
            if(s1count[i]!=s2count[i])
                return false;
        }
        return true;
    }
}
