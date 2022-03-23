import java.util.Iterator;

public class TrimSpaces {

	public static void main(String[] args) 
	{
	  String s="          Avinash       ";
	  
	  int i=0;
	  int j=s.length()-1;
	  
	 while(true)
	 {
		 if(s.charAt(i)==' ')
		  i++;
		 else 
			 break;
	 }
	 
	 while(true)
	 {
		 if(s.charAt(j)==' ')
			 j--;
		 else 
			 break;
	 }
	 
	 for (int j2 = i; j2 <=j; j2++) 
	 {
	   System.out.print(s.charAt(j2));	
	 }
	}

}
