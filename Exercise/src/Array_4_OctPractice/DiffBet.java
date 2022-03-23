package Array_4_OctPractice;

public class DiffBet {

	public static void main(String[] args) {
int []a= {34,7,8,33,23,7,8,66};
		
		int large=0;

		int small=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>large)
				large=a[i];
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("Largest No: "+large);
		System.out.println("Smallest No: "+small);
		System.out.println("Differance Between Large and Small");
		System.out.println(large-small);


	}

}
