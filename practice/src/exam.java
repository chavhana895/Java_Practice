import java.util.HashSet;

public class exam {

	public static void main(String[] args) 
	{
		HashSet<Integer> set1=new HashSet<>();
		
		
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		
		HashSet<Integer> set2=new HashSet<>(set1);
		set2.add(9);
		set2.add(3);
		set2.add(7);
		
	    System.out.println(set2);
	
	  
	}

}
