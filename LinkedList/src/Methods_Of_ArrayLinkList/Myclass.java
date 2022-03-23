package Methods_Of_ArrayLinkList;

public class Myclass <E>{

	public static void main(String[] args) {
MyLinkedList<String> list=new MyLinkedList<String>();

list.add("Aj");
list.add("Avi");
list.add("saru");
list.add("Prathu");
list.add("saaru");
list.add("Aj");


list.print();

System.out.println();
System.out.println(list.contains("Avi"));

System.out.println();
System.out.println(list.indexOf("Aj"));

System.out.println();
System.out.println(list.lastindexOf("Aj"));

System.out.println();
System.out.println(list.size());

System.out.println();

list.set("Avii", 3);
System.out.println(list);

	}
}