package String_13_Oct;

public class RemoveElement {

	public static void main(String[] args) {
		String s="abcd";      //two times  HW25
		
		String s1="";
	
		for (int i = 0; i < s.length(); i++) 
		{
		  char ch=s.charAt(i);
		  int count=0;
		  for (int j = 0; j <s.length(); j++)
		  {
			if(s.charAt(j)==ch)
				count++;
	    	}
		  if(count==1)
			  s1=s1+ch+ch;
		  else
			  s1=s1+ch;
		  
		}
		System.out.println(s1);
		
	}
}


