class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueIntegers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxCount=0;
        for (Integer element: uniqueIntegers) {
            int count=0;
            if(!uniqueIntegers.contains(element-1))
            {
                count++;
                int startElem=element+1;
                while(uniqueIntegers.contains(startElem))
                {
                  count++;
                  startElem++;
                }
                if(count>maxCount)
                    maxCount=count;
            }

        }

        return maxCount;
        
    }
}
