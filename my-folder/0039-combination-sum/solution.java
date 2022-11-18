class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> all=new ArrayList<>();
        combinationSumRec(0,candidates,target,new ArrayList<>(),all);
        return all;
    }
    
     public List<List<Integer>> combinationSumRec(int index,int[] candidates, int target,List<Integer> ds,List<List<Integer>> all) {
         if(index==candidates.length)
         {
             if(target==0)
             {
                 all.add(new ArrayList(ds));
             }
             return all;
                 
         }
         if(target>=candidates[index])
         {
             ds.add(candidates[index]);
             combinationSumRec(index,candidates,target-candidates[index],ds,all);
             ds.remove(ds.size()-1);
         }
         
         return combinationSumRec(index+1,candidates,target,ds,all);
         
    }
}
