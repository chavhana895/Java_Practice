package practice;

public class ReverseString {

	public static void main(String[] args) 
	{
	  String s="Avinash";
	  String s1="";
  
//	  for (int i = 0; i < s.length(); i++)
//	  {
//		s1=s.charAt(i)+s1;
//	  }
//	  s=s1;                        //reverse the String
//	  System.out.println(s1);
//	  System.out.println(s);

	  
	
	  for (int i =s.length()-1;i>=0; i--)
	  {
		System.out.print(s.charAt(i));      //reverse Print the String
	  }
	  System.out.println();
	  System.out.println(s);
	  
	  
//	  char []ch=s.toCharArray();
//	  int i=0;
//	  int j=s.length()-1;
//	  while(i<j)
//	  {
//		  char temp=ch[i];        //Reverse Print
//		  ch[i]=ch[j];
//		  ch[j]=temp;
//		  i++;j--;
//	  }
//	  String s2=new String(ch);
//	  System.out.println(s2);
//	  System.out.println(s);
	}
}