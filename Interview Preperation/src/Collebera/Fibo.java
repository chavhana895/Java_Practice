package Collebera;

import java.util.Arrays;

public class Fibo 
{
   public static void main(String []args) 
   {
   int num=10;
   getFibo(num);
   }
 
public static void getFibo(int num)
{
  int a=0;
  int b=1;
  int c=0;
  int []y=new int [num];
  y[0]=a;
  y[1]=b;
  
  for(int i=2;i<num;i++)
{
  c=a+b;
  y[i]=c;
  a=b;
  b=c;
}

System.out.println(Arrays.toString(y));

int i=0;
int j=y.length-1;
while(i<j)
{
  int temp=y[i];
y[i]=y[j];
y[j]=temp;
i++;j--;
}
System.out.println(Arrays.toString(y));
}
}
