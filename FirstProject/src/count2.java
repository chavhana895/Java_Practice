
public class count2 {

	public static void main(String[] args) {
		int num=123456;
		int num1=num;
		int num2=0;
		
		while(num1>0)
		{
			int lastDigit=num1%10;
			num2=num2*10+lastDigit;
			num1=num1/10;
		}
		System.out.println(num2);
		
		
		
		
		
		
//		int sum=0;
//		while(num>0)
//		{
//			sum=sum+num%10;  //6  6+5  
//			num=num/10;  //12345  1234
//		}
//System.out.println(sum);
	}

}
