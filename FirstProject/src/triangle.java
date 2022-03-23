
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1=5;
int s2=6;
int s3=5;
if (s1==s2 && s2==s3 && s3==s1)
{
	System.out.println("Equilateral Triangle");
}
else if (s1==s2 || s2==s3|| s3==s1)
{
	System.out.println("Isosceles Triangle");
}
else 
{
	System.out.println("Scalene Triangle"
			+ "");
}
	}

}
