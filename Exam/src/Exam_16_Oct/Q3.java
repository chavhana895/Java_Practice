package Exam_16_Oct;

public class Q3 
{
	
		public static void main(String[] args) 
		{
			String s="aabcsdabcbcccbsiababab";
			String s1="";
			for (int i = 0; i < s.length(); i++) 
			{
				int count=0;
		 		for (int j = 0; j < s1.length(); j++) 
				{
					if(s1.charAt(j)==s.charAt(i))
						count++;	
				}
				if(count==0)
					s1=s1+s.charAt(i);	         	
			}
		char []ca=s1.toCharArray();
		int []ia=new int [ca.length];
		for (int i = 0; i < ca.length; i++) 
		{  int count=0;
		  for (int j = 0; j < s.length(); j++) 
		  {
			if(s.charAt(j)==ca[i])
				count++;
		  }	
		  ia[i]=count;
		}
		for (int i = 0; i < ia.length; i++) 
		{
			for (int j = i+1; j < ia.length; j++) 
			{   
				if(ia[i]<ia[j])
				{
					 int temp = ia[i];
					 ia[i]=ia[j];
					 ia[j]=temp;
					 
					 char temp1=ca[i];
					 ca[i]=ca[j];
					 ca[j]=temp1;
				}
				
			}
		}
		for (int i = 0; i < ia.length; i++) 
		{
			System.out.print(ca[ca.length-1]+" ");
			break;
		}
		System.out.println();
		for (int i = 0; i < ia.length; i++) 
		{
			System.out.print(ia[ia.length-1]+" ");
			break;
		}
		
		}

}
