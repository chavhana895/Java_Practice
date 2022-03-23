package Q1;

public class Myclass {

	public static void main(String[] args) 
	{
	   MyLinkedList list = new MyLinkedList();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.add(50);
	   
	   list.print();
	   System.out.println(list.toString());
       list.remove(3);
       list.print();
	}

}
