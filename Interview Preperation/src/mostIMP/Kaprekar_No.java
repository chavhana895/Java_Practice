package mostIMP;

public class Kaprekar_No {

	public static void main(String[] args) 
	{
      int num=999;
      int cnt=0;
      int num1=num;
                                 //Kaprekar
      while(num1>0)
      {
    	  num1=num1/10;
    	  cnt++; 	  
      }
      int sq=num*num;
      int d=(int)Math.pow(10, cnt);
      int fp=sq%d;
      int sp=sq/d;
      if(fp+sp==num)
  		System.out.println("Kaprekar No");
      else 
    	  System.out.println("Not Kaprekar");
      
	}
}