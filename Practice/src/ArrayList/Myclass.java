package ArrayList;

public class Myclass {

	public static void main(String[] args) 
	{
	  MyLinkedList<Integer> list = new MyLinkedList<>();
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  
	  list.print();
	  
	  list.remove(3);
	  list.print();
	}

}
