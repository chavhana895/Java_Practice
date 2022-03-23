package LinkedListImplementation;

public class linkedList <p>
{
private p[] a = (p[])new Object[3];
private int index=0;

void add(p num)
{
	if(index<a.length)
	{
		a[index]=num;
		index++;
	}
	else
	{
		int size=(int)(1.5*a.length);
		p[] b=(p[])new Object[size];
		for (int i = 0; i < a.length; i++) 
		{
		  b[i]=a[i];	
		}
		a=b;
		a[index]=num;
		index++;
	}
	
	
}

}
