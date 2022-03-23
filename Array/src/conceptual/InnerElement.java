package conceptual;

public class InnerElement {

	public static void main(String[] args)
	{
int [] []a={ {1,2,3,4,5},
	         {5,3,3,6,7},
	         {3,4,2,3,6},
	         {4,2,7,8,9},
	         {4,6,3,6,9}};

int sum=0;
int cnt=0;
System.out.println("_______Inner Element________");
for (int i = 1; i < a.length-1; i++)
{
	for (int j = 1; j < a.length-1; j++)
	{
		System.out.print(a[i][j]+" ");
		cnt++;
		sum=sum+a[i][j];
	}
	System.out.println();
}
System.out.println("_________Average_________");
System.out.println(sum/cnt);
	}
}
