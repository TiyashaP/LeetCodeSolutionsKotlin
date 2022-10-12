class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sumRes=0;
        for(int i=0;i<rolls.length;i++)
        {sumRes=sumRes+rolls[i];
        }
        int sumOfMissing=(mean*(rolls.length+n))-sumRes;
        int[] missingArr=new int[n];
        if(sumOfMissing>n*6 || sumOfMissing<n*1)
            return new int[0];
        int rem=n;
        for(int i=0;i<n;i++)
        {
            
            missingArr[i]=Math.min((sumOfMissing-rem+1),6);
            rem--;
            sumOfMissing=sumOfMissing-missingArr[i];
        
        }
        return missingArr;
        
    }
}
