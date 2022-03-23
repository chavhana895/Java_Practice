package ClassWork;

public class SoartingStringLength {

	public static void main(String[] args) {

    String []sa={"dfgf ffsfsfielf kjfsf sfo hdsh"};
    
    for(String s:sa)
    {
    	System.out.println(s);
    }
    
    for (int i = 0; i < sa.length; i++)
    {
		for (int j =i+1; j < sa.length; j++) 
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
    System.out.println("After");
    System.out.println();
    for(String s:sa)
    {
    	System.out.println(s);
    }

}
}