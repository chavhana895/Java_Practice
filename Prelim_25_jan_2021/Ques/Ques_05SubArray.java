package Ques;

public class Ques_05SubArray {

	public static void main(String[] args) {

		int[] a = { 3, 7, 90, 20, 5, 50, 40 };
		int k = 3;

		int sum=0;
		int i=0;
		int j=i;
		while(i<a.length-k+1) {
			
			if(j<i+k) {
				sum+=a[j];
				j++;
			}else {
				double avg=sum/k;
				if(avg<=25) {
					System.out.println(avg);
					System.out.println(i);
				}
				sum=0;
				i++;
				j=i;
			}
		
		}

//		for (int i = 0; i < a.length-k+1; i++) {
//			int sum=0;
//			for (int j = i; j < i+k; j++) {
//				sum+=a[j];
//			}
//			double avg=sum/k;
//			
//			if(avg<=25) {
//				System.out.println(avg);
//				System.out.println(i);
//			}
//			
//		}

	}

}
