package mostIMP;

public class pellNo {

	public static void main(String[] args)
	{
     int num=1;
     int num1=2;
     int sum=0;
     System.out.print(num+"  "+num1);
     
     for (int i = 0; i <10; i++) 
     {
		sum=num1*2+num;
		num=num1;
		num1=sum;
		System.out.print(sum+"  ");
	  }
	}

}
