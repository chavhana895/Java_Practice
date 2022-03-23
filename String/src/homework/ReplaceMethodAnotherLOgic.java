package homework;

public class ReplaceMethodAnotherLOgic {

	public static void main(String[] args) 
	{
	  String s="Sarang";
	  String []sa=s.split("a");   //replace A with P
	  String s1="";
	  
	  for (int i = 0; i < sa.length; i++) 
	  {
		if(i==sa.length-1)
		{
			s1=s1+sa[i];
		}
		else
			s1=s1+sa[i]+'P';
	 }
	  System.out.println(s1);
	}

}
