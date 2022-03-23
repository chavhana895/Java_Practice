package linkedHashMap;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linkedHashMap<Integer, String> map = new linkedHashMap<Integer, String>();

		map.add(1, "One");
		map.add(8, "Eight");
		map.add(5, "Five");
		map.add(6, "Six");
		map.add(2, "Two");
		map.add(3, "Three");
		map.add(7, "Sevan");
		map.add(9, "Nine");
		map.add(10, "Ten");
		map.add(4, "Four");
		
		map.print();
		System.out.println(map.get(1));
		System.out.println(map.contiansValue("Four"));
		System.out.println(map);
		
	}

}
