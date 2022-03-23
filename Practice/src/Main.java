
		import java.util.*;
		import java.io.*;
import java.lang.reflect.Array;

		public class Main 
		{
	       public static void main (String[] args) 
		    {
		        ArrayList<Integer> arrayList = new ArrayList<Integer>();
		        arrayList.add(92);
		        arrayList.add(14);
		        arrayList.add(80);
		        arrayList.add(72);
		        arrayList.add(-1);
		        for (int i = 0; i < arrayList.size(); i++) 
		        {
					if(arrayList.get(i)<57 && arrayList.get(i)%10==9)
						arrayList.set(i, -5);
					else if(arrayList.get(i)<57)
						arrayList.set(i, -2);
					else if(arrayList.get(i)%10==9)
						arrayList.set(i, -9);
				}
		        System.out.println(arrayList);
		        
		    }
}
