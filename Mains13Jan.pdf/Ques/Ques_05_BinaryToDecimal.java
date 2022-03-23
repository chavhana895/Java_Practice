package Ques;

public class Ques_05_BinaryToDecimal {

	public static void main(String[] args) {
//		5 Convert binary to decimal. Input: 1010 ouput: 10, 
//		Input:10101 output:21 input11111 output: 31
		
		int binary=11111;
		int decimal=0;
		int n=0;
		while(binary>0) {
			int temp=binary%10;
			decimal+=temp*Math.pow(2, n);
			binary=binary/10;
			n++;
		}
		System.out.println(decimal);
	}
}
