package Singly;

public class MySLL {

	public static void main(String[] args) 
	{
		SLL <Integer> s=new SLL<>();
		s.add(23);
		s.add(2);
		s.add(5);
		s.add(7);
		s.add(4);
		
		s.print();
		System.out.println(s.toString());
	}
}