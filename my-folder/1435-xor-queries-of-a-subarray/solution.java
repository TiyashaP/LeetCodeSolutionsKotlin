class Solution {
     public static int[] xorQueries(int[] arr, int[][] queries) {
    	 int[] prefix=new int[arr.length];
    	 prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {  prefix[i]=prefix[i-1]^arr[i];
        }
        int[] output=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
        	if(queries[i][0]==0)
        		output[i]=prefix[queries[i][1]];
        		
        	if(queries[i][0]>0)
        		output[i]=prefix[queries[i][0]-1]^prefix[queries[i][1]];	
        	
        }
        return output;
    }
}
