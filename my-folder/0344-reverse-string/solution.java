class Solution {
    public void reverseString(char[] s) {
        if(s.length>=1)
        {
            int start=0;
            int end=s.length-1;
            while(start<end)
            {
                char temp=s[start];
                s[start]=s[end];
                s[end]=temp;
                start++;
                end--;
            }
        }
        
    }
    
    public static int pow(int number,int power)
    {
        int i=0;
        int ans=1;
        while(i<power)
        {
            ans=ans*number;
        }
        return ans;
    }
}
