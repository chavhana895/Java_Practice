import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterater {

	public static void main(String[] args) 
	{
	  ArrayList<Integer>list=new ArrayList<Integer>();
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  list.add(60);
	  list.add(70);
	  Iterator<Integer> it=list.iterator();
	  
	  System.out.println(list.set(3, 70));
	  System.out.println(list);
	  
	  System.out.println();
	  
	  System.out.println(list.get(4));
	  
	  System.out.println(list.lastIndexOf(60));
	  
	  
	 /* while (it.hasNext()) 
	  {
		System.out.println(it.next());		
	 }
	  
	  System.out.println("By Using For Loop");
	  
	  for (int i = 0; i < list.size(); i++) 
	  {
		System.out.println(list.get(i));
	}
	  
	  System.out.println("Privious Element Of ArrayList");
	  
	  
	  ListIterator<Integer> it1=list.listIterator(list.size());
	  
	  while(it1.hasPrevious())
	  {
		  System.out.println(it1.hasPrevious());
		  
	  }*/
	}
}
