package TreeMap_4Nov;

public class Myclass {

	public static void main(String[] args) {
		
		MyTreeMap map= new MyTreeMap();
		map.add(1, "one");
		map.add(8, "eight");
		map.add(3, "three");
		map.add(5, "Five");
		map.add(7, "seven");
		map.add(2, "two");
		
		map.print();
		System.out.println(map.get(8));

	}

}
