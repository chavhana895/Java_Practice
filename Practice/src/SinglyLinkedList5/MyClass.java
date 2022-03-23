package SinglyLinkedList5;

public class MyClass {

	public static void main(String[] args)
	{
	  MySinglyLinkedList<Integer> list= new MySinglyLinkedList<>();
	  
	  list.add(4);
	  list.add(9);
	  list.add(2);
	  list.add(3);
	  list.add(8);
	  list.add(11);
	  
	  list.print();
	  System.out.println("----toString----");
	  System.out.println(list.toString());
	  
	  System.out.println("----toArray----");
	  Object []arr=list.toArray();
	  
	  for (int i = 0; i < arr.length; i++)
	  {
		System.out.println(arr[i]);
	  }
	}

}
