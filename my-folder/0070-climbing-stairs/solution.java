class Solution {
   public int climbStairs(int n) {
        Map<Integer,Integer> climbStairMap=new HashMap<>();
        climbStairMap.put(1,1);
        climbStairMap.put(0,0);
        climbStairMap.put(2,2);
        IntStream.iterate(3,i->i<=n,i->i+1)
                .forEach(elem->climbStairMap.computeIfAbsent(elem,ignore->climbStairMap.get(elem-1)+climbStairMap.get(elem-2)));
       return climbStairMap.get(n);
    }
}
