package Ques;

public class Basic_Harshad_05 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			
			int num = i;
			int temp = num;
			int sum = 0;
			while (num > 0) {
				sum = sum + num % 10;
				num = num / 10;
			}

			if (temp % sum == 0) {
				System.out.println("Harshad num: "+ i);
			} 
		}
	}
}
