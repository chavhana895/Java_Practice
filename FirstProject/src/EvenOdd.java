
public class EvenOdd {

	public static void main(String[] args) {
		int start=100;
		int end=120;
		System.out.println("All Even Numbers");
		for(int i=start; i<=end;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
System.out.println("All odd Numbers");
for(int i=start;i<=end;i++)
{
	if(i%2!=0)
		System.out.println(i);
}
	}

}
