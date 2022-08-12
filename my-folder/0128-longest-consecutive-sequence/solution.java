import java.util.* ;
import java.io.*; 
import java.util.stream.*;


class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
            return 0;
       Arrays.sort(arr);
        int maxLcs=1;
        int lcs=1;
        for (int i=1;i<arr.length;i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == arr[i - 1] + 1) {
                    lcs++;
                } else {
                    maxLcs = Math.max(lcs, maxLcs);
                    lcs = 1;
                }

            }
        }
        return Math.max(lcs,maxLcs);

        
    }
}
