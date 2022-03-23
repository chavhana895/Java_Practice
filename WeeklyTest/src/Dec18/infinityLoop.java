package Dec18;

public class infinityLoop {

	public static void main(String[] args)
	{
		System.out.println("I am in main method");
		
		main("avi");
		
	}
    public static void main(String name)
    {
	System.out.println("I am overload");
    }

    

}

