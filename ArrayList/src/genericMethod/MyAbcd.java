package genericMethod;
public class MyAbcd <E> {
private E[] a= (E[]) new Object[5];
int index=0;
public void add(E num) 
{
	if(index>=a.length)
	{
		//grow the size of array
		E[]b =(E[])new Object[2*a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
		}
		a=b;
	}
	a[index++]=num;
}
public void remove(int i) 
{
	for (int j = i; j < index-1; j++) 
	{
		a[j]=a[j+1];
	}
	index--;
}
public void print() 
{
	for (int i = 0; i < index; i++) 
	{
		System.out.println(a[i]);
	}
}
}