package ArrayList5;

public class MyArrayList <p>
{
 private p []a=(p[])new Object [5];
 
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
		 p[]b=(p[])new Object[size];
		 
		 for (int i = 0; i < a.length; i++)
		 {
		    b[i]=a[i];	
		 }
		 a=b;
		 a[index]=num;
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
 
 
 int size()
 {
	 return index;
 }
 
 boolean contains(p num)
 {
	 for (int i = 0; i < index; i++)
	 {
		if(a[i]==num)
			return true;
	}
	 return false;
 }
 
               
 int indexOf(p num)
 {
	 for (int i = 0; i < index; i++)
	 {
		if(a[i]==num)
			return i;
	}
	 return -1;
 }
 
 int lastIndexOf(p num)
 {
	 for (int i =index-1; i>=0; i--)
	 {
		if(a[i]==num)
			return i;
	}
	 return -1;
 }
 

 void remove(int i)
 {
	 for (int j = i; j < index; j++)
	 {
		a[j]=a[j+1];
		index--;
	}
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
