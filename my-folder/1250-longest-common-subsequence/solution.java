class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int text1Len=text1.length();
        int text2Len=text2.length();
        int[][] dp=new int[text1Len+1][text2Len+1];
        for(int i=0;i<=text1Len;i++)
        {
            dp[i][0]=0;
        }
        
         for(int j=0;j<=text2Len;j++)
        {
            dp[0][j]=0;
        }
        
         for(int i=1;i<=text1Len;i++)
             for(int j=1;j<=text2Len;j++)
        {
           if(text1.charAt(i-1)==text2.charAt(j-1))
               dp[i][j]=1+dp[i-1][j-1];
           else{
               dp[i][j]=max(dp[i][j-1],dp[i-1][j]);
           }      
        }
        
        return dp[text1Len][text2Len];
    }
    public static int max(int length1,int length2){
        if(length1>length2)
            return length1;
        else 
            return length2;
        
    }
}
