
	package doublylinkedlistgenerics;

	import java.util.Arrays;

	public class Myclass {

		public static void main(String[] args) {
			Mydoublylinkedlist<Integer>list=new Mydoublylinkedlist<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(3);
			list.add(4);
			
			
			
			
			list.forwardPrint();
			System.out.println();
			list.ReversePrint();
			System.out.println();
			
		//	list.set(3, 20);
			list.forwardPrint();
			
			System.out.println();
		//	System.out.println(list.contains(3));
			System.out.println();
			
			
		//	System.out.println(list.indexof(4));
			
			
			System.out.println(list.size());
			
		//	System.out.println(list.lastIndexof(3));
			
			list.remove(3);
			list.forwardPrint();
			
			System.out.println();
			
			Object[]arr=list.toArray();
			System.out.println(Arrays.toString(list.toArray()));

		}

	}


