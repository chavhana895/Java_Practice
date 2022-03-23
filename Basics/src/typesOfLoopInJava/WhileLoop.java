package typesOfLoopInJava;

public class WhileLoop {
	public static void main(String[] args)
	{
	  int num=5;
	  
	  int i=1;                           // Initialization
	  while(i<=10)                       // Condition
	  {
		  System.out.println(num*i);
		  i++;                           // Update Expression
	  }    
	}
}

//Time complexity = O(n)