
public class MLLClass {

	public static void main(String[] args) 
	{
	  MyLinkedListt <Integer> list = new MyLinkedListt<>();
	  list.add(23);
	  list.add(15);
	  list.add(26);
	  list.add(22);
	  list.add(20);
	  
	  list.print();
	  System.out.println("------get Method----");
	  System.out.println(list.get(2));
	  System.out.println("----remove Method-----");
	  list.remove(2);
	  list.print();
	}

}
