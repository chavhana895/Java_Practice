package Ques;

public class Ques_04_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9,10};
				//2 4 6 8 10 3 7 1 9 5 
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				int temp=a[i];
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}
				a[a.length-1]=temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
