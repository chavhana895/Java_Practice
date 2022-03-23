package Task1;

import java.util.HashMap;

public class Task2 {

	public static void main(String[] args)
	{
      HashMap<String, Double> map= new HashMap<>();
      
      map.put("S", 124.23);
      map.put("M", 212.2);
      map.put("L", 350.3 );
      map.put("xL", 400.0);
      map.put("XXL", 423.45);
      
      System.out.println(map.get("XXL"));
      System.out.println(map.toString());
	}
}