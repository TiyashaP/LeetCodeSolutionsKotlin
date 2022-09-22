class Solution {
    public void sortColors(int[] nums) {
        int zeropos=-1;
        int twoPos=nums.length;
        if(nums.length==1)
            return;
        int i=0;
        while(i<twoPos)
        {
            if(nums[i]==0)
            {
                zeropos=zeropos+1;
                swap(nums,zeropos,i);
            }
             else if(nums[i]==2)
            {
                twoPos=twoPos-1;
                swap(nums,twoPos,i); 
                 i--;
                 
             }
            i++;
            
        }
        
    }
    
    
    public static void swap(int[] nums,int position1,int position2)
    {
        int temp=nums[position1];
        nums[position1]=nums[position2];
        nums[position2]=temp;
        
    }
}
