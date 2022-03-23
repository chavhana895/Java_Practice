package mostIMP;

public class PRIME {

	static int num=200;
   public static void main (String[] args)
   {
       for(int i=1; i<=num; i++)
       {
           
           if(isPrime(i)) 
           {
               System.out.println(i);
           }
       }
   }
   static boolean isPrime(int num1)
   {
       if(num1==1||num1==0)
    	   return false;

       for(int i=2; i<num1; i++)
       {
             if(num1%i==0)
              return false;
       }
       return true;
 }
}
