class Solution {
    public List<Integer> lexicalOrder(int n) {
        
        List<String> strList=new ArrayList<String>();
        List<Integer> itrList=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
            strList.add(String.valueOf(i));
        Collections.sort(strList);
        for(String s:strList)
            itrList.add(Integer.valueOf(s));
        return itrList;
        
        
        
        
    }
}
