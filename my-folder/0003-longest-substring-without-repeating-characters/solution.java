class Solution {
    public int lengthOfLongestSubstring(String s) {
       Queue<Character> characterQueue=new ArrayDeque<>();
        int count=0;
        int maxCount=0;
        for (Character c:
             s.toCharArray()) {
            if(characterQueue.contains(c))
            {
                count=characterQueue.size();
                if(count>maxCount)
                    maxCount=count;
                Character remove = characterQueue.remove();
                while(remove!=c) {
                    remove=characterQueue.remove();
                }
            }
            characterQueue.add(c);
        }
        if(maxCount>characterQueue.size())
           return maxCount;
        return characterQueue.size();
        
    }
}
