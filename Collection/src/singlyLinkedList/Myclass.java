package singlyLinkedList;

public class Myclass {

	public static void main(String[] args) 
	{
	  MyLinkedList<Integer> list = new MyLinkedList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(10);
      list.add(50);
      
      System.out.println("-----Print Method-----");
      list.print();
      System.out.println("-----contains Method-----");
      System.out.println(list.contains(60));
      System.out.println("-----toString Method-----");
      System.out.println(list.toString());
      System.out.println("-----indexOf Method-----");
      System.out.println(list.indexOf(40));
      System.out.println("-----lastIndexOf Method-----");
      System.out.println(list.lastIndexOf(10));
      System.out.println("-----toString Method-----");
      System.out.println(list.toString());
      System.out.println("-----size Method-----");
      System.out.println(list.size());
      System.out.println("-----get Method-----");
      System.out.println(list.get(3));
      System.out.println("-----set Method-----");
      list.set(2, 25);
      list.print();
      System.out.println("-----toArray Method-----");
      Object[] arr=list.toArray();
	   for (int i = 0; i < arr.length; i++) 
	   {
		  System.out.print(arr[i]+" ");
 	   }
	   System.out.println();
	}
}