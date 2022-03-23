package LinkedHashMap;

public class Myclass {

	public static void main(String[] args) {
		MyLinkedHashMap map=new MyLinkedHashMap();
		
		map.add(18, "18");
		map.add(21, "21");
		map.add(17, "17");
		map.add(12, "12");
		map.add(10, "10");
		map.add(22, "22");
		
		System.out.println(map.get(10));

	}

}
