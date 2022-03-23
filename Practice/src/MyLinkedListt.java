
public class MyLinkedListt <p>
{

	private p[] a =(p[])new  Object[3];
	private int index=0;
	
void add(p data)
{
	if(index<a.length)
	{
		a[index]=data;
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
		a[index]=data;
		index++;
	}
}

void print()
{
	for (int i = 0; i < index; i++) 
	{
	  System.out.println(a[i]);	
	}
}

p get(int i)
{
	return a[i];
}


void remove(int i)
{
	for (int j = i; j < index; j++) 
	{
		a[j]=a[j+1];
	}
	index--;
}

public String toString()
{
	String s="[";
	for (int i = 0; i < index; i++) 
	{
		s=s+a[i];
		if(i+1!=index)
		{
			s=s+", ";
		}
		
	}
	s=s+"]";
	return s;
}
}