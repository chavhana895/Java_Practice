package Implementation;

public class Replace {

	public static void main(String[] args)
	{
	  String s="abcd abcd";
	  System.out.println(s.replaceAll("a", "Avi")); //Predefined
	  
	  String[]sa=s.split("a");
	  String s2="Avi";
	  String s1="";
	  
	  for (int i = 0; i < sa.length; i++) 
	  {
		if(i==sa.length-1)
		{
			s1=s1+sa[i];
		}
		else
		{
			s1=s1+sa[i]+s2;
		}
	  }
	  System.out.println(s1);
	}
}