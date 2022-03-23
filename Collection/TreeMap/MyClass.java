package TreeMap;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap map=new TreeMap();
		
		map.add(1, "One");
		map.add(10, "Ten");
		map.add(8, "Eight");
		map.add(5, "Five");
		map.add(2, "Two");
		map.add(3, "Three");
		
		System.out.println(map);
		System.out.println(map.containsValue("Five"));
		System.out.println(map.get(100));

	}

}
