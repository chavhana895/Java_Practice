package Q2;

public class Myclass {

	public static void main(String[] args)
	{
		MyTreeMap<Integer, String> map= new MyTreeMap<>();
		
		  map.add(1, "one");
	     map.add(6, "Six");
		  map.add(3, "Three");
		  map.add(8, "Eight");
		  map.add(7, "Seven");
		  
		  System.out.println(map.toString());
		  
		 
	}

}
