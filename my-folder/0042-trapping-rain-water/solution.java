class Solution {
    public int trap(int[] height) {
    int left=0;
    int right=height.length-1;
    int maxLeft=height[left];
    int maxRight=height[right];
    int water=0;    
    while(left<=right)
    {
        if(isMinLeft(maxLeft,maxRight)){
            if(height[left]>maxLeft)
                maxLeft=height[left];
            water=water+maxLeft-height[left];
            left++;
            
        }
        else{
             if(height[right]>maxRight)
                maxRight=height[right];
             water=water+maxRight-height[right];
            right--; 
            
        }
       
    }
         return water;
    }
        
    private static boolean isMinLeft(int maxLeft, int maxRight) {
        if(maxLeft<=maxRight)
            return true;
        return false;
    }
}
