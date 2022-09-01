class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        for(int j=start;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {    swap(nums,j,start);
                 start++;
            }
            
        }
        
    }
    
    public void swap(int[] arr,int j,int start)
    {
        int temp=arr[j];
        arr[j]=arr[start];
        arr[start]=temp;
    }
    
    
}
