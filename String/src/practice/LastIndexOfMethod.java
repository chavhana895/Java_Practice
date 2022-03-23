package practice;

public class LastIndexOfMethod {

	public static void main(String[] args) 
	{
	  String s1="abcsjdabco";
	  String s2="abc";
	  
	  System.out.println(s1.lastIndexOf(s2));
	  int index=-1;
	  if(s2.length()<=s1.length())
	  {
		  int i=s1.length()-s2.length();
		  for (; i >=0; i--) 
		  {
			if(s1.charAt(i)==s2.charAt(0))
			{
				String subString="";
				for (int j = i; j < i+s2.length(); j++) 
				{
					subString=subString+s1.charAt(j);
				}
				if(subString.equals(s2))
				{
					index=i;
					break;
				}
			}
		  }
		  System.out.println(index);
	  }
	}

}
