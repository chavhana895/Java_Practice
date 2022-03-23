package AssimentHW;
/* )Write a program to Find unique Pair Of Integers in Array whose Sum is Given Number. (Variations) Given array 
: [2, 4, 3, 5, 6, -2, 4, 7, 8, 9]
Given sum : 7 
Integer numbers, whose sum is equal to value : (2, 5) (4, 3) (-2, 9) . .(April Monthly).
\*/
public class HW38 {

	public static void main(String[] args) {
		int a[]= {2, 4, 3, 5, 6, -2, 7, 8, 9};
		int num=7,count=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]+a[j]==num)
				{
					System.err.println(a[i]+"   "+a[j]);
					count++;
				}
			}
		}
		System.out.println("Number of Pairs :-  "+count);
	}

}
