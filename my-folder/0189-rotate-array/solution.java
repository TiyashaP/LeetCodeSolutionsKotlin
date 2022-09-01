class Solution {
    public void rotate(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        k=k%nums.length;
        if(start<end)
        {
            reverse(nums,start,end-k);
            reverse(nums,end-k+1,end);
            reverse(nums,start,end);
        }
        
    }
    
     public void reverse(int[] nums, int start,int end) {
        while(start<end)
        {
           int temp=nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++;
           end--;
        }
        
    }
}
