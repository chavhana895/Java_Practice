package Ques;

public class Ques_06String {

	public static void main(String[] args) {
//		6 Print addition of squares of digits in the string
//		input:”abc12pqr” output:5 input”1abc23” output: 14
		
		String s="1abc23";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int num=s.charAt(i)-'0';
				sum+=num*num;
			}
		}
		System.out.println(sum);
	}

}
