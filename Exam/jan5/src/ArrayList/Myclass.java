package ArrayList;

public class Myclass {

	public static void main(String[] args) 
	{
		MyArrayList <Integer> list=new MyArrayList<>();
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(7);
		list.add(3);
		
		list.print();
		
		System.out.println("------contains Method-----");
		System.out.println(list.contains(4));
	}

}
