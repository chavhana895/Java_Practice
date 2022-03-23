/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

public class b {
    public static int processArray(ArrayList<Integer> array) {
    	for (int i = 0; i < array.size(); i++) 
        {
			if(array.get(i)<57 && array.get(i)%10==9)
				array.set(i, -5);
			else if(array.get(i)<57)
				array.set(i, -2);
			else if(array.get(i)%10==9)
				array.set(i, -9);
		}
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
