package String_14_Oct;

public class IndexOfMethod {
     static String s1="fgsdfgbdnu";
     static String s2="hbsfv";
	public static void main(String[] args) {
		
		int result1=s1.indexOf(s2);
		System.out.println(result1);
		int result2=myIndexOf();
		System.out.println(result2);
	}
	private static int myIndexOf() {
		if(s2.length()>s1.length())	
		return -1;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				int s1Index=i+1;
				int s2Index=1;
				int counter=1;
				while(s1Index<s1.length()&& s2Index<s2.length())
				{
					if(s1.charAt(s1Index)==s2.charAt(s2Index))
						counter++;
					s1Index++;
					s2Index++;
				}
				if(counter==s2.length())
					return i;
			}
		}
		return -1;
	}

}
