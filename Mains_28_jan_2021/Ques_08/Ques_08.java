package Ques_08;

public class Ques_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 145;
		int digit = 4;

		for (int i = no; i > 0; i--) {
			int num = i;
			int checknum = num;
			boolean flag = true;
			while (num > 0) {
				int temp = num % 10;
				if (temp == digit) {
					flag = false;
					break;
				}
				num = num / 10;
			}

			if (flag) {
				if (checknum < no) {
					System.out.println(checknum);
					break;
				}
			}
		}
	}
}
