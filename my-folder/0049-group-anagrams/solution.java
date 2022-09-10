class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> anagramList=new ArrayList<>();
       HashMap<String,List<String>> anagramMap=new HashMap<>();
        for(String str:strs)
        {
            char[] strsArr = str.toCharArray();
            Arrays.sort(strsArr);
            String strNew=new String(strsArr);
            if(anagramMap.containsKey(strNew))
            {
                List<String> strings = anagramMap.get(strNew);
                strings.add(str);
                anagramMap.put(strNew,strings);
            }
            else{
                ArrayList<String> stringArrayList = new ArrayList<>();
                stringArrayList.add(str);
                anagramMap.put(strNew, stringArrayList);
            }
        }
         anagramMap.values().stream().forEach(value->anagramList.add(value));
        return anagramList;
        
    }
}
