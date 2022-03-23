package Q1;

public class DoublyLinkedLis {

	public static void main(String[] args)
	{
		MyDL <Integer> dl= new MyDL<>();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(80);
		
		System.out.println(dl.toString());
	}

}
