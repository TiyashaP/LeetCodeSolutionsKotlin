import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {public List<String> commonChars(String[] A) {{
		  
	  Collection<Character> stringCountprev=new ArrayList<>();
	  List<String> stringList = new ArrayList<>();
	  if(A.length>0)
	  {
		  stringCountprev=A[0] 
			      .chars() 
			      .mapToObj(e -> (char)e) 
			      .collect(Collectors.toList());
		  for(int i=1;i<A.length;i++)
		  {
			  if(!stringCountprev.isEmpty())
			  { stringCountprev=intersect(stringCountprev,A[i] 
				      .chars() 
				      .mapToObj(e -> (char)e) 
				      .collect(Collectors.toList()));
				  
			  }
			  
		  }
		  for(Character c:stringCountprev)
		  {
			  stringList.add(String.valueOf(c));
		  }
		  return stringList;
		  }
	  
	 
	 return Collections.emptyList(); 
       
   }}

	 public static <T> Collection <T> intersect (Collection <? extends T> a, Collection <? extends T> b)
	 {
	     Collection <T> result = new ArrayList <T> ();

	     for (T t: a)
	     {
	         if (b.remove (t)) result.add (t);
	     }

	     return result;
	 }
}
