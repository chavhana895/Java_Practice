package customException;

public class Myclass {

	public static void main(String[] args) throws Exception 
	{
		int a=10;
		int b=0;
		 if(b==0)
		 {
			 throw new myOwnException("sgyfshcdsi");
		 }
		 System.out.println(a/b);
	}

}
