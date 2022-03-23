public class factRec 
{

public static void main(String []args)
{
   int num=5;
   int ans=factorialCalc(num);
   System.out.println(ans);

}

public static int factorialCalc(int num)
{
     if(num==0 || num==1)
     {
	   return 1;
     }
  
     int m = factorialCalc(num-1);
     int fact= num*m;
	
     return fact;	
}

}