class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ans = new ArrayList();
    if (rounds[rounds.length - 1] < rounds[0]) {
        for (int i = 1; i <= rounds[rounds.length - 1]; i++)
            ans.add(i);
        for (int i = rounds[0]; i <= n; i++)
            ans.add(i);
    } else
        for (int i = rounds[0]; i <= rounds[rounds.length - 1]; i++)
            ans.add(i);
    
    return ans;
        
    }
}
