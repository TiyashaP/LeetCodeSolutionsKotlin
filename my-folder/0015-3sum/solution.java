class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrIntList=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
                if (i == 0 || (i != 0 && nums[i] != nums[i - 1])) {
                    {

                        int left=i+1;
                        int right=nums.length-1;
                        int target=0-nums[i];
                        while (left < right) {
                            if (nums[left] + nums[right]> target)
                                right--;
                            else if (nums[left] + nums[right]<target)
                                left++;
                            else if (nums[left] + nums[right] + nums[i] == 0) {
                                List<Integer> res = new ArrayList<Integer>();
                                res.add(nums[i]);
                                res.add(nums[left]);
                                res.add(nums[right]);
                                arrIntList.add(res);
                                while(left<right && nums[left]==nums[left+1])
                                    left++;
                                while(left<right && nums[right]==nums[right-1])
                                    right--;
                                left++;
                                right--;    
                            }
                        }
                    }

                }

            }
        return arrIntList;
    }
}
