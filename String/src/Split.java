
public class Split {

	public static void main(String[] args)
	{
	  String s="abc pqr lmn xyz";
	  String [] sa=s.split(" ");
	  for (int i =sa.length-1; i>=0; i--) 
	  {
	    System.out.println(sa[i]);	
     }
	}

}
