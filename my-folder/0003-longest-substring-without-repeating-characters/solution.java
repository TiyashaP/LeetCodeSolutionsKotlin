class Solution {
    public static int lengthOfLongestSubstring(String s) {
	int start=0;
	int[] charArrNo=new int[256];
	int maxLength=0;
	int i=0;
	if(null==s)
		return 0;
	else if(s.length()==1)
		return 1;
	else{
	while(i<s.length())
	{
		charArrNo[s.charAt(i)]++;
		
		if(charArrNo[s.charAt(i)]>1)
		{
			int lengthOfString=i-start;
			if(lengthOfString>maxLength)
				maxLength=lengthOfString;
			start=resetcount(charArrNo,start,i,s);
			
		}
		i++;
	}
	if(i-start>maxLength)
		maxLength=i-start;
	}
        
      return  maxLength;
    }

private static int resetcount(int[] charArrNo,int start, int i,String s) {
		while(charArrNo[s.charAt(i)]>1)
			{
			charArrNo[s.charAt(start)]--;
			start++;
			}
	return start;
	
}


}
