package Set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Array_removeDuplicate {

	public static void main(String[] args) 
	{
	 int []a= {1,1,1,2,1,2,3,2,7,5,3,3,5,8,9};
	 
	 LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
	   for (int i = 0; i < a.length; i++) 
	   {
		set.add(a[i]);
	   }
	   Object []b=set.toArray();
	   
	   for (int i = 0; i < b.length; i++) 
	   {
		System.out.println(b[i]);
	 }

	}

}
