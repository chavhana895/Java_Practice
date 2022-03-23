package HashMap;

public class Myclass {

	public static void main(String[] args) 
	{
		Node node=new Node();
		System.out.println(node.hashCode());
		
		MyMap<String,Integer> map=new MyMap<String,Integer>(); 
        
		map.put("One", 1);
		map.put("two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("six", 6);
		
		
	}

}
