class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n!=0)
        {
            int emptyIndexInNum1=m;
            int startNum1=0;
            int startNum2=0;
            for(int i=startNum2;i<n;i++){
            while(nums1[startNum1]<=nums2[i] && startNum1<emptyIndexInNum1)
               startNum1++;
            for(int k=emptyIndexInNum1;k>startNum1;k--)
            {
                nums1[k]=nums1[k-1];
            }
                emptyIndexInNum1++;
            nums1[startNum1]=nums2[i];
            }
        
        }
        
    }
}
