package Method;

public class Myclass {

	public static void main(String[] args) {
		
		MyLinkedList list=new MyLinkedList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println("List Element");
		
		list.print();
		System.out.println("------------------------");
		
		System.out.println("toString Method");
		System.out.println(list.toString());
		
		System.out.println("--------------------");
		list.clear();
		System.out.println("After Clear");
		list.print();
	}

}
