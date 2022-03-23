package Interface;

public class DevJr implements Calc
{

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int mult(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2 ;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
}
