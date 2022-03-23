package HW_8;

public class Demo {
public int division(int devidend,int divisor) 
{
	if(divisor==0)
		throw new ArithmeticException("Cant divide by zero");
	
	return devidend/divisor;
	
}
}
