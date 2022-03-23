package HW;

public class HW3 {

	public static void main(String[] args) {
		
		int num=13;
		int temp=0;
		
		if(num==0 || num==1)
			System.out.println("Not a Prime No");
		else 
		{
			for (int i = 2; i <=num; i++) 
			{
				if(num%i==0)
				{
					System.out.println(num+" is not a prime no");
					temp=1;
					break;
				}	
			}
			if(temp==0)
				System.out.println(num+" is prime no");
		}
	}

}
