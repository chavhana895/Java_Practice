package Ques_08;

public class MyClass {

	public static void main(String[] args) {
		
		try {
		input(5, 0);
		}catch (Exception e) {
			System.out.println("/ by zero");
		}
		
	}
	
	public static int input(int a, int b) throws Exception {
		if(b==0) {
			throw new invalidInput("B is Zero");
		}
		int result=a/b;
		return result;
		
		
		
	}

}
