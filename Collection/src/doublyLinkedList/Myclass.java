package doublyLinkedList;

public class Myclass {

	public static void main(String[] args) 
	{
	   MyLinkedList<Integer> list = new MyLinkedList<Integer>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(20);
	   list.add(50);
	   
	   System.out.println("-------FrwPrint Method------");
	   list.frwPrint();
	   System.out.println("-------revPrint Method------");
	   list.revPrint();
	   System.out.println("-------addWithIndex Method------");
	   list.add(3,25);
	   list.frwPrint();
	   System.out.println("-------set Method------");
	   list.set(2, 23);
	   list.frwPrint();
	   System.out.println("-------get Method------");
	   System.out.println(list.get(3));
	   System.out.println("-------indexOf Method------");
	   System.out.println(list.indexOf(20));
	   System.out.println("-------lastIndexOf Method------");
	   System.out.println(list.lastIndexOf(20));
	  
	}

}
