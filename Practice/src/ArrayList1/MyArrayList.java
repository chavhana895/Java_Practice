package ArrayList1;

public class MyArrayList <p>
{
	private p[] a=(p[]) new Object[3];
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
			p[] b = (p[])new Object[size];
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
			System.out.print(a[i]+" ");
		}
		System.out.println();
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
	
	int size()
	{
		return index;
	}
	
	void remove(int i)
	{
		for (int j = i; j < index-1; j++) 
		{
		  a[j]=a[j+1];
		}
		index--;
	}
	
	p get(int i)
	{
		return a[i];
	}
	
	boolean contains(p data)
	{
		for (int i = 0; i < index; i++) 
		{
			if(a[i]==data)
				return true;
		}
		return false;
	}
	
	int indexOf(p data)
	{
		for (int i = 0; i < index; i++) 
		{
			if(a[i]==data)
				return i;
		 }
		return -1;
	}
	
	int lastIndexOf(p data)
	{
		for (int i = index-1; i>=0;i--) 
		{
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	
	 p []  toArray()
	{
		 p[] b= (p[])new Object[index];
		for (int i = 0; i < index; i++) 
		{
			b[i]=a[i];
		}
		return b;
		
	}
}
