package String_13_Oct;

public class SoartingAlphaLengthEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []sa= {"jdsfgd","abcs","aaaa","abbc","sgsgfdsv"};

for(String s:sa)
{
	System.out.println(s);
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
		else if(sa[i].length()==sa[j].length())
		{
			//if(sa[i].length()c)
		}
	}
}
	
	}

}
