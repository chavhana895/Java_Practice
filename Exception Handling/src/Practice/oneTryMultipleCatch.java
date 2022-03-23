package Practice;

public class oneTryMultipleCatch {

	public static void main(String[] args)
	{
	 int []a= {1,2,3,4,5,6};
	 String s="abcd";
	 
	 try 
	 {
		 System.out.println(a[100]);
		 System.out.println(s.charAt(100));
     } 
	 catch(ArrayIndexOutOfBoundsException c) 
	 {
		System.out.println("Send msg to array team");
	 }
	 catch (StringIndexOutOfBoundsException s1) 
	 {
		System.out.println("Send msg to String team");
	 }
	 catch (Exception e) 
	 {
		System.out.println("Something else");
	 }
	}

}
