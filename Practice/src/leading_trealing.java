
public class leading_trealing {

	public static void main(String[] args) 
	{
       String s="     Avinash         ";
       
       int i=0;
       int j=s.length()-1;
       while(s.charAt(i)==' ')
    	   i++;
       while(s.charAt(j)==' ')
    	   j--;
       String s1="";
       
       for (int k = i; k <= j; k++) 
       {
		s1=s1+s.charAt(k);
	   }
       System.out.println(s1);
	}

}
