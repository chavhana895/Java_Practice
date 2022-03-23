package ArrayProb_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RightShift_LeftShift {

	public static void main(String[] args) 
	{
	   List<Integer> list=new ArrayList<Integer>();

	   list.add(1);
	   list.add(2);
	   list.add(3);
	   list.add(4);
	   list.add(5);
	   list.add(6);
	   list.add(7);
	   
	   System.out.println(list);
	   list.add(0, list.remove(list.size()-1));
	   System.out.println(list);
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("How Many No. Do you Want to rotate");
	   int a=sc.nextInt();
	   
	   for (int i = 0; i < a; i++) 
	   {
		list.add(0, list.remove(list.size()-1));
    	}
	   System.out.println(list);
	}

}
