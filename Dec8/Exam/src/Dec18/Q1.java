package Dec18;

public class Q1 {

	public static void main(String[] args) 
	{
	   generatePattern(0,0);
	}

	private static void generatePattern(int i, int j) 
	{
       if(i<5)
       {
    	   if(j+i>4)
				System.out.print("*");
			else
				System.out.print(" ");
    	   if(j<5)
    		   j++;
    	   else if(j==5)
    	   {
    		    j=0; i++;
    		   System.out.println();
    		   
    	   }
    	   generatePattern(i, j);
       }
	}

}