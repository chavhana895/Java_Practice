package ArrayList;

public class MyLinkedList <p>
{
 private p[]a= (p[]) new Object[3];
 int index=0;
 
 public void add(p num)
 {
	 if(index<a.length)
	 {
		 a[index]=num;
		 index++;
	 }
	 else
	 {
		 int size=(int) (1.5*a.length);
		 p[] b = (p[]) new Object[size];
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
		System.out.print(a[i]+" ");
	}
	 System.out.println();
 }
 
 
 public void remove(int i)
 {
	 for (int j = i; j < index-1; j++) 
	 {
		a[j]=a[j+1];
	}
	 index--;
 }

}