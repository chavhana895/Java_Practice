package ArrayList;

public class Myclass {

	public static void main(String[] args) 
	{
	   MyLinkedList<Integer> list = new MyLinkedList<>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.add(10);
	   list.add(50);
	  
	   System.out.println(list.toString());
	   System.out.println("*******get method******");
	   System.out.println(list.get(3));
	   System.out.println("*******contains method******");
	   System.out.println(list.contains(30));
	   System.out.println("*******size method******");
	   System.out.println(list.size());
	   System.out.println("*******toArray method******");
	 
	   Object[] arr=list.toArray();
	   for (int i = 0; i < arr.length; i++) 
	   {
		  System.out.print(arr[i]+" ");
  	   }
	   System.out.println();
	   //prob
	   System.out.println("*******indexOf method******");
	   System.out.println(list.indexOf(30));
	   System.out.println("*******lastIndexOf method******");
	   System.out.println(list.lastIndexOf(10));
	   System.out.println("*******remove method******");
	   list.remove(3);
	   list.print();
	   System.out.println("*******get method******");
	   System.out.println(list.get(3));
	   System.out.println("***********Print*******");
	   list.print();
	 }
}
