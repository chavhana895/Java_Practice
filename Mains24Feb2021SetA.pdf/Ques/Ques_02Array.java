package Ques;

public class Ques_02Array {

	public static void main(String[] args) {
//		2. Write a program calculate the average of the inner
//		elements of an array
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		
		System.out.println(sum/a.length);
	}

}
