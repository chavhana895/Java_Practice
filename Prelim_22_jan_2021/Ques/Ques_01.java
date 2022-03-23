package Ques;

public class Ques_01 {

	public static void main(String[] args) {

		int days = 403;

		int years = days / 365;
		if (years > 0)
			System.out.println("years: " + years);
		days = days % 365;
		int month = days / 30;
		if (month > 0)
			System.out.println("month: " + month);
		days = days % 30;
		int week = days / 7;
		if (week > 0)
			System.out.println("week:" + week);
		int day = days % 7;
		if (day > 0)
			System.out.println("day: " + day);
	}

}
