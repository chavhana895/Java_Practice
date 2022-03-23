package Ques;

public class Ques_03_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,7,90,20,5,50,40};
		int k=3;
		int i=0;
		int j=i;
		double min=Integer.MAX_VALUE;
		int sum=0;
		double avg=0;
		int index=0;
		while(i<a.length-(k-1)) {
			
			if(j<i+k) {
				sum+=a[j];
				j++;
			}else {
				avg=sum/k;
				if(avg<min) {
					min=avg;
					index=i;
				}
				i++;
				j=i;
				sum=0;
			}
		}
		System.out.println(min);
		System.out.println(index);
	}

}
