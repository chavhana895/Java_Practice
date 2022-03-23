package Ques;

public class Ques_03 {

	public static void main(String[] args) {
		
//		60 128 528 
//		132 417 366 
//		204 428 1752 
		
		int temp=36;
		int result1=0;
		int result2=0;
		int result3=0;
		// Even num
		if(temp%2==0) {
			result1=temp/2;
		}
		boolean isPrime=true;
		for (int k = 2; k < temp; k++) {
			if(temp%k==0) {
				isPrime=false;
			}
		}
		// prime num
		if(isPrime) {
			result2=temp*3;
		}else {
			result3=temp*2;
		}
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
