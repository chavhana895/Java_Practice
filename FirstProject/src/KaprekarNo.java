
public class KaprekarNo {

	public static void main(String[] args) {
int num=99;
int num1=num;
int noOfDigit=0;
while(num1>0)
{
	noOfDigit++;
	num1=num1/10;
}
int sq=num*num;
int d=(int)Math.pow(10,noOfDigit);
if(sq/d+sq%d==num)
	System.out.println("kaprekar No");
else
	System.out.println("Not");
  }
}
