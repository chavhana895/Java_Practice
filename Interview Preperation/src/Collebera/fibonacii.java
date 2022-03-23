package Collebera;
import java.util.*;

public class fibonacii {

	public static void main(String[] args)
	{
      int a=0,b=1,c=0;
      int []a1=new int [10];
      a1[0]=a;
      a1[1]=b;
      
      for (int i = 2; i < a1.length; i++)
      {
		c=a+b;
		a1[i]=c;
		a=b;
		b=c;
	  }
      
      System.out.println(Arrays.toString(a1));
      
      int i=0;
      int j=a1.length-1;
      while(i<j)
      {
    	  int temp=a1[i];
    	  a1[i]=a1[j];
    	  a1[j]=temp;
    	  i++;
    	  j--;
      }
      System.out.println(Arrays.toString(a1)); 
	}
}