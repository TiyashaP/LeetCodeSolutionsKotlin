class Solution {
    public int search(int[] nums, int target) {
        int numLen=nums.length;
        if(numLen==0 || target<nums[0] || target>nums[numLen-1])
            return -1;
        
        int start=0;
        int end=numLen-1;
        return binsearch(nums,start,end,target);
        
        
    }
    
    public static int binsearch(int[] nums,int start,int end,int target)
    {
        int mid=start+((end-start)/2);
        if(start>end)
            return -1;
        if(target==nums[mid])
            return mid;
        else if(target>nums[mid])
        {
           return binsearch(nums,mid+1,end,target);
        }
        else{
             return binsearch(nums,start,mid-1,target);
        }
    }
}
