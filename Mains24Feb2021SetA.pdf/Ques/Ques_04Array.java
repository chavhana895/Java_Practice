package Ques;

public class Ques_04Array {

	public static void main(String[] args) {
//		4. Write a program to find all the unique triplets such that
//		sum of all the three elements is equal to num1 and triplet 
//		does not include num2; Take num1 and num2 from user
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		int num1=8;
		int num2=2;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					int[] b=new int[3];
					b[0]=a[i];
					b[1]=a[j];
					b[2]=a[k];
					int count=0;
					int sum=0;
					for (int l = 0; l < b.length; l++) {
						if(b[l]==num2) {
							count++;
						}else {
							sum+=b[l];
						}
					}
					if(count==0) {
						if(sum==num1) {
							for (int l = 0; l < b.length; l++) {
								System.out.print(b[l]+" ");
							}
							System.out.println();
						}
					}
				}
			}
		}

	}

}
