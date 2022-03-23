package Array_Exam;

public class Q2 
{

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5};
		
for (int i = 0; i < a.length; i++) 
{
	int temp=a[i];
	int start=0;
	for (int j = 0; j < a.length; j--)
	{
		if(a[j]<temp)
		{
			start=j+1;
			break;
		}
	}
	for (int k = i-1; k >= start; k--) 
	{
		a[k+1]=a[k];
	}
	a[start]=temp;
    }
for (int i = 0; i < a.length; i++) 
{
	System.out.println(a[i]+" ");
}

	}

	}
