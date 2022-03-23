package Array_4_OctPractice;

public class HW_16 {

	public static void main(String[] args) {
		int []a= {56,1,2,3,4,5,6,7,8,9};
		
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
