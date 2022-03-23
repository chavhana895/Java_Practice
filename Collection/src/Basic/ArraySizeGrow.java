package Basic;

public class ArraySizeGrow 
{
  private int [] a= new int[3];
 
 
  private int index =0;
  
  void add(int num)
  {
     if(index<a.length)
  {
	  a[index]=num;
	  index++;
  }
  else
  {
	 int size=(int)(1.5*a.length);
	 int [] b = new int[size];
	 for (int i = 0; i < a.length; i++) 
	 {
		b[i]=a[i];
    }
	a=b;
	a[index++]=num;
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
}
