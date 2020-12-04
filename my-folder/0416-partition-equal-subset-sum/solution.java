class Solution {
   public static boolean canPartition(int[] nums) {
    	int sum=0;
		if(nums.length>200 && nums.length<1)
			return false;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>100 || nums[i]<1)
				return false;
			else
			{
				sum+=nums[i];
			}
		}
		if(sum%2!=0)
			return false;
		else return subsetSum(sum/2,nums);
        
    }

	private static boolean subsetSum(int sum, int[] nums) {
		boolean[][] t=new boolean[nums.length+1][sum+1];
	
		for(int i=0;i<=nums.length;i++)
			for(int j=0;j<=sum;j++)
			{
				if(i==0)
					t[i][j]=false;
				
				if(j==0)
					t[i][j]=true;
				/*
				 * if(i>=1 && nums[i-1]>100) return false;
				 */
				if(i>=1 && j>=1 && nums[i-1]<=j)
						t[i][j]=t[i-1][j]||t[i-1][j-nums[i-1]];
				
			}
		
			return t[nums.length][sum];
	}
}
