class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArr=new int[nums.length];
        int productLeft=1;
        for(int i=0;i<nums.length;i++)
        {
            productArr[i]=productLeft;
            productLeft=productLeft*nums[i];
        }
        
        int productRight=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            productArr[i]*=productRight;
            productRight=productRight*nums[i];
        }
    
        
    
        return productArr;
        
    }
    
 
}
