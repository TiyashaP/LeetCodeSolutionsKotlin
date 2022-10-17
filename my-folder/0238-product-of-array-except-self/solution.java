class Solution {
    public int[] productExceptSelf(int[] nums) {
       int lengthNewArr=nums.length;
       int[] numArr=new int[nums.length];
      int product=1;
       for(int i=0;i<nums.length;i++)
       {
           numArr[i]=product;
           product=product*nums[i];
         
       }
        
       product=1;
       for(int i=lengthNewArr-1;i>=0;i--)
       {
           numArr[i]=numArr[i]*product;
           product=product*nums[i];
       }
        
        return numArr;
    }
    
 
}
