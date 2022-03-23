
public class Methods {
	public static void main(String[] args)
	
	{
		Method list=new Method();
		for (int i = 0; i <=5; i++)
		{
			list.add(i);
		}
		System.out.println(list);
		System.out.println();
		list.remove();
		System.out.println(list);
		System.out.println();
		list.isEmpty();
		System.out.println();
		
		System.out.println("size "+list.size());
		
		System.out.println();
		System.out.println(list.set(0, 99));
		System.out.println(list);
		
		System.out.println();
		for (int i = 0; i < list.size(); i++)
		{
			
		}
		System.out.println(list.get());
	}

}
class Method
{

	int Array[]=new int[5];
	int index=0;
	public void add(int num) 
	{
		if(index>=Array.length)
		{
			int newa[]=new int[Array.length*2];
			for (int i = 0; i <index ; i++) 
			{
				newa[i]=Array[i];
			}
			Array=newa;
		}
		Array[index++]=num;
	}
	@Override
	public String toString()
	{
		String s1="";
		for (int i = 0; i < index; i++)
		{
			s1=s1+" "+Array[i];
		}
		return s1;
	}
	public void Clear()
	{
		for (int i = 0; i <=Array.length; i++)
		{
			index--;
		}
	}
	public void remove()
	{
		for (int i = index; i < index-1; i++)
		{
			Array[i]=Array[i+1];
		}
		index--;
	}
	public void isEmpty()
	{
		if(index==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	public  int size()
	{
		return index;
	}
	public int set(int ind,int value)
	{
		int old=0;
		for (int i = 0; i < Array.length; i++) 
		{
			if(ind==i)
			{
				old=Array[i];
				Array[i]=value;
			}
		}
		return old;
	}
	public int get()
	{
		return Array[index];
		
	}
	public int LastIndexOf(int a)
	{
		for (int i = index-1; i >=0; i--) 
		{
			if(Array[i]==a)
			return i;	
		}
		return -1;
	}
	public int indexof(int a) 
	{
		for (int i = 0; i < index; i++) 
		{
		   if(Array[i]==a)	
			   return i;
		}
		return -1;
	}
	
}

