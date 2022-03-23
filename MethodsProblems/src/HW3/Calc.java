package HW3;

public class Calc {
	int add(int num1, int num2)
	{
		int result=num1+num2;
		return result;
	}
	void sub(int num1, int num2)
	{
		int result = num1-num2;
		System.out.println(result);
	}
	int mult()
	{
		int num1=8;
		int num2=3;
		int result=num1*num2;
		return result;
	}
	void div()
	{
		int num1=10;
		int num2=2;
		int result=num1/num2;
		System.out.println(result);
	}
}
