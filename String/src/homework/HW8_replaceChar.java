package homework;

public class HW8_replaceChar {

	public static void main(String[] args) 
	{
	  String s="aydgbdkwd";          //replace d with f
	  char []ca=s.toCharArray();
	  
	  for (int i = 0; i < ca.length; i++) 
	  {
		if(ca[i]=='d')
			ca[i]='f';
		
	  }
	  s=new String(ca);
	  System.out.println(s);
	}

}
