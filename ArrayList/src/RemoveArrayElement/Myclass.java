package RemoveArrayElement;

public class Myclass {

	public static void main(String[] args) {
    
		MyAbcd myabcd=new MyAbcd();
		myabcd.add(10);
		myabcd.add(20);
		myabcd.add(30);
		myabcd.add(40);
		myabcd.add(50);
		myabcd.print();
		
		System.out.println("After Remove element");
		myabcd.remove(3);
		myabcd.print();
	}

}
