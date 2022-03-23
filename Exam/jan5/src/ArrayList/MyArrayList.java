package ArrayList;

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
		  p[]b=(p[])new Object[size];
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
  
  boolean contains(p data)
  {
	  for (int i = 0; i < index; i++) 
	  {
		if(a[i]==data)
			return true;
	  }
	return false;
  }
}
