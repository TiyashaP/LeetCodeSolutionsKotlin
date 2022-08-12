class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
       if(n==1)
            return arr[n-1];
        Arrays.sort(arr);
     int majority=arr[n/2];
        int start=0;
        for(int i=(n/2)+1;i<n;i++)
        {
            if(arr[i]==majority)
            {
                start++;
            }
            else 
                break;
        }
        for(int i=(n/2)-1;i>=0;i--)
        {
            if(arr[i]==majority)
            {
                start++;
            }
            else
                break;
        }
        if(start+1>n/2)
            return arr[n/2];
        else return -1;
    }
        
    
}
