package ArrayList5;

public class Myclass
{
public static void main(String[] args) {
	
	MyArrayList <Integer> list= new MyArrayList<>();
	
	list.add(5);
	list.add(2);
	list.add(9);
	list.add(56);
	
	list.print();
	
	System.out.println("----indexOf----");
	System.out.println(list.indexOf(98));
	System.out.println("-----remove-----");
	list.remove(8);
	list.print();
	
	System.out.println(list.toString());
}
}
