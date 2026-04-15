class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var mi= m-1;
        var ni=n-1;
        var ri=m+n-1
        while(mi>=0 && ni>=0)
        {
            if(nums1[mi]>=nums2[ni])
             {
                nums1[ri]=nums1[mi];
                mi--;
             }
             else
             {
                nums1[ri]=nums2[ni];
                ni--;
             }  
             ri--;
        }

        while(ni>=0)
        {
              nums1[ri]=nums2[ni];
                ni--;
                ri--;

        }

        
    }
}
