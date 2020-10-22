class Solution {
    public boolean isPowerOfTwo(int n) {
        double maxint=(Math.pow(2,31))-1;
        if(n>0 && n<=maxint)
           return (n & (n-1))==0?true:false;
       return false; 
    }
}
