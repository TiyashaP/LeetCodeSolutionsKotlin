class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount=0;
        int windowStart=0;
        int maxvowelCount=0;
        for(int i=0;i<s.length();i++)
        {
              if(isVowel(s.charAt(i)))
                   vowelCount++;
            if(i-windowStart+1==k)
            {
                if(maxvowelCount<vowelCount)
                {maxvowelCount=vowelCount;
                 
                }
                if(isVowel(s.charAt(windowStart)))
                   vowelCount=vowelCount-1;
                 windowStart++;
            }
        }
        return maxvowelCount;
    }
    
    public boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
}
