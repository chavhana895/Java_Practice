package ExamPre;

public class sept23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	System.out.println("kapreskar Number");
else
	System.out.println("Not");


	}

}
