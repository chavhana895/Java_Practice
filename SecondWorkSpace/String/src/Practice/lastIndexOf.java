package Practice;

public class lastIndexOf {

	public static void main(String[] args) 
	{
      String s1="sdabjsbuabksuabf";
      String s2="ab";
      
      System.out.println(s1.lastIndexOf(s2));
      int index=-1;
      
      if(s2.length()<=s1.length())
      {
    	  int j=0;
    	  for (; j < s1.length()-s2.length()+1; j++) 
    	  {
			if(s1.charAt(j)==s2.charAt(0))
			{
				String substring="";
				for (int i = j; i < j+s2.length(); i++) 
				{
					substring=substring+s1.charAt(i);
				}
				if(substring.equals(s2))
				{
					index=j;
				}
			}
		  }
    	  System.out.println(index);
      }
	}

}
