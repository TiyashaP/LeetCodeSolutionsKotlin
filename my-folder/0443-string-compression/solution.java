class Solution {
    public int compress(char[] chars) {
        int startIndex=0;
        int arrIndex=0;
        while(startIndex<chars.length)
        {
            int nextCharIndex=startIndex+1;
            while(nextCharIndex<chars.length && chars[startIndex]==chars[nextCharIndex])
            {
              nextCharIndex++;
            }
            chars[arrIndex++]=chars[startIndex];
            int length=nextCharIndex-startIndex;
                if(length>1)
                {
                      String sLength=String.valueOf(length);
                      for(int i=0;i<sLength.length();i++)
                      {
                          chars[arrIndex++]=sLength.charAt(i);
                      }
                    
                }
             startIndex=nextCharIndex;
            }
        return arrIndex-0;
        
    }
}
