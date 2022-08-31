class Solution {
    public boolean isPalindrome(String s) {
         int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            while(!(Character.isAlphabetic(s.charAt(start)) || Character.isDigit(s.charAt(start))) && start<end)
                start++;
            while(!(Character.isAlphabetic(s.charAt(end)) || Character.isDigit(s.charAt(end))) && start<end)
                end--;
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
            { return false;

            }
            start++;
            end--;
        }
        return true;
        
    }
}
