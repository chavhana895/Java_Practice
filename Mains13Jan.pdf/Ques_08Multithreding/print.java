package Ques_08Multithreding;

public class print {

	static int i = 0;

	public static void even() {
		if (i % 2 == 0) {
			System.out.println(i);
			i++;
		}
	}

	public static void odd() {
		if (i % 2 != 0) {
			System.out.println(i);
			i++;
		}
	}

	
}
