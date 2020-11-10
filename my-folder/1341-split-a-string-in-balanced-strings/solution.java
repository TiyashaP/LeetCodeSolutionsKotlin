import java.util.Stack;

class Solution {
    public int balancedStringSplit(String s) {
    	Stack<Character> stringStack=new Stack<>();
    	char[] charArray=s.toCharArray();
    	int count=0;
    	for(int i=0;i<s.length();i++)
    	{
  
    			if(!stringStack.isEmpty() && !stringStack.peek().equals(Character.valueOf(charArray[i])))
    				{ stringStack.pop();
    				if(stringStack.isEmpty())
        				count++;
    				}
    			else
    				stringStack.push(Character.valueOf(charArray[i]));
    			
    		}
    	
		return count;
        
    }
}
