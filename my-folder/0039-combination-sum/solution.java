class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allCombination=new ArrayList<>();
        List<Integer> currentCombination=new ArrayList<Integer>();
        combinationSumRec(candidates,target,allCombination,currentCombination,0);
        return allCombination;
        
    }
    
    public void combinationSumRec(int[] candidates, int target,List<List<Integer>> allCombination,List<Integer> currentCombination,int index) {
        if(index>=candidates.length)
            return;
        if(target==0)
        {
            List<Integer> combinationToAdd=new ArrayList<>(currentCombination);
            allCombination.add(combinationToAdd);
            return;
        }
        
        if(candidates[index]<=target)
        {
            currentCombination.add(candidates[index]);
            combinationSumRec(candidates,target-candidates[index],allCombination,currentCombination,index);
            currentCombination.remove(currentCombination.size()-1);
        }
         combinationSumRec(candidates,target,allCombination,currentCombination,index+1);
        
        
    }
}
