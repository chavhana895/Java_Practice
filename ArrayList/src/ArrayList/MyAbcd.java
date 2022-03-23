package ArrayList;

public class MyAbcd {
private int []a=new int[5];
int index=0;
public void add(int num) 
{
	if(index>=a.length)
	{
		//grow the size of array
		int []b =new int[2*a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		a=b;
	}
	a[index++]=num;
}
public void print() 
{
	for (int i = 0; i < index; i++) 
	{
		System.out.println(a[i]);
	}
}
}