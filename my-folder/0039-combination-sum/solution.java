class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(candidates);

        combinationSumRec(candidates,target,0,list,new ArrayList<Integer>());
        return list;
    }
    
    public void combinationSumRec(int[] candidates,int target,int index,List<List<Integer>> dsList,List<Integer> ds) {
        if(index==candidates.length){
        if(target==0)
            dsList.add(new ArrayList(ds));
            return;
        }
        
    
        if(candidates[index]<=target)
        {
            ds.add(candidates[index]);
            combinationSumRec(candidates,target-candidates[index],index,dsList,ds);
            ds.remove(ds.size()-1);
        }
         combinationSumRec(candidates,target,index+1,dsList,ds);
        
    }
}
