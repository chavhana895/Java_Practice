
public class Swapping {

	public static void main(String[] args)
	{
	   float a= 12.33f;
	   float b= 12.987f;
	   System.out.println(a+"   "+b);
//	   a=a+b;
//	   b=a-b;         //using 2 veriables
//	   a=a-b;
	   
	   float temp=a;
	   a=b;
	   b=temp;                       //using third veriable
	   System.out.println(a+"  "+b);
	   
	}

}
