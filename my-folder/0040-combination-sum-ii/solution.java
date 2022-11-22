class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ds=new ArrayList<>();
        Set<List<Integer>> ans=new HashSet<>();
        combinationSum2Rec(0,candidates,target,ans,ds);
        
        List<List<Integer>> arr = new ArrayList<>();
        arr.addAll(ans);
        return arr;
        
    }
    
     public void combinationSum2Rec(int index,int[] candidates, int target,Set<List<Integer>> ans,List<Integer> ds) {
       if(target==0)
       {
           ans.add(new ArrayList<>(ds));
           return;
       }
       for(int i=index;i<candidates.length;i++)
       {
           if(i>index && candidates[i]==candidates[i-1])continue;
           if(candidates[i]>target)
               break;
           ds.add(candidates[i]);
           combinationSum2Rec(i+1,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size()-1);
       }
        
        
    }
}
