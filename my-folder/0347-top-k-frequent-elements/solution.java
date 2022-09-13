class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        
        HashMap<Integer,Integer> elemCount=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           elemCount.put(nums[i],elemCount.getOrDefault(nums[i],0)+1);
        }
        
        List<List<Integer>> elements=new ArrayList<>(nums.length+1);
        for (int i = 0; i <= nums.length; i++) {
  elements.add(new ArrayList<Integer>());
}

        for(Map.Entry<Integer,Integer> it:elemCount.entrySet())
        {
            List<Integer> elem=elements.get(it.getValue());
            elem.add(it.getKey());
            elements.set(it.getValue(),elem);
            
        }
        int s=0;
        for(int i=nums.length;i>=0;i--)
        {
          List<Integer> elem=elements.get(i);
            
            if(elem!=null && elem.size()>0)
            {
               for(int j=0;j<elem.size();j++)
        {
            if(s==k)
               break;
           arr[s]=elem.get(j);
           s++;
           
        }
         
            }
        }
        return arr;
    }
}
