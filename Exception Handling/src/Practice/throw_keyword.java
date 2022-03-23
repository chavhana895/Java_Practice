package Practice;

public class throw_keyword {

	public static void main(String[] args) throws Exception
	{
        int a=5;
        int b=0 ;
        
        if(b==0)
        {
        	throw new Exception("Value of b is not equal to zero");
        }
        System.out.println(a/b);
	}

}
