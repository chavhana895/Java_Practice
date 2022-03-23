package String_13_Oct;

import java.util.Arrays;

public class SoartingAlphaLengthEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []sa= {"jdsfgd","abcs","aaaa","abbc","sgsgfdsv"};

for(String s:sa)
{
	System.out.print(s+" ");
}
for (int i = 0; i < sa.length; i++) 
{
	for (int j = 0; j < sa.length; j++) 
	{
		if(sa[i].length()>sa[j].length())
		{
			String temp=sa[i];
			sa[i]=sa[j];
			sa[j]=temp;
		}
		
	}
}
System.out.println();

for(String s1:sa)
{
	System.out.print(s1+" ");
}
//System.out.println(Arrays.toString(sa));
	
	}

}
