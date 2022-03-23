package typesOfLoopInJava;

public class DoWhile {

	public static void main(String[] args)
	{
	  int num=5;
		
	  int i=1;            //Initialization
	  do                //This loop execute at least once
	  {
		System.out.println(num*i);
		i++;              //Increment or Decrement
	  }
	  while(i<=10);      //condition
	  
	  //Time Complexity O(n)
	}
}