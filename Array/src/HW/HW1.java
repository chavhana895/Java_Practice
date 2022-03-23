package HW;

public class HW1 {

	public static void main(String[] args) 
	{
		int [] a = {4,2,7,9,23,56,85};
		int num=9;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
				System.out.println("Index is: "+i);
		}
	}

}
