/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        if(n==1)
            return 1;
        int minMid=Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(isBadVersion(mid))
            { minMid=minI(minMid,mid);
             System.out.print(minMid);
             end=mid-1;
            }
            else
            {
                start=mid+1;
            }
                
        }
        return minMid;
        
    }
    public static int minI(int minMid,int mid){
        if(minMid<mid)
            return minMid;
        else return mid;
        
    }
}
