package String_12_Oct;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String s="abcdabca";
		int count=0;
		
		for (int i = 0; i < s.length(); i++)                        //Duplicate Element
		{
			for (int j = i+1; j < s.length(); j++) 
			{

				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					System.out.println(s.charAt(i));
					break;
					
				}
			}
		}
		System.out.println(count);   
	}

}
