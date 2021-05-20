class Solution {
    public int searchInsert(int[] nums, int target) {
        int numsLength=nums.length;
        if(target>nums[numsLength-1])
            return numsLength;
        if(target<nums[0])
            return 0;
        int mid=numsLength/2;
        if(target==nums[mid])
            return mid;
        else if(target>nums[mid])
          return searchInsertRec(nums,target,mid+1,numsLength-1); 
        else
          return searchInsertRec(nums,target,0,mid-1);  
        
    }
    
    public int searchInsertRec(int[] nums, int target,int startIndex,int endIndex) {
        int mid=(endIndex+startIndex)/2;
        if(target>nums[mid] && target<nums[mid+1])
            return mid+1;
        else if(target>nums[mid])
            return searchInsertRec(nums,target,mid+1,endIndex); 
        else if(target<nums[mid] && target>nums[mid-1])
            return mid;
        else if(target<nums[mid])
            return searchInsertRec(nums,target,startIndex,mid-1); 

        else 
            return mid;
        
    }
}
