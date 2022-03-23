package HW;

public class HW3 {

	public static void main(String[] args)
	{
	  int [] a = {12,9,25,16,25,43,25,25,24};
	  
	  int cnt=0;
	  for (int i = 0; i < a.length; i++)
	  {
		if(a[i]==25)
		  cnt++;
	  }
	  int [] b = new int[a.length-cnt];
	  int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]!=25)
			{
				b[j]=a[i];
				j++;
			}
			i++;
		}
		a=b;
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[j2]);
		}
	}

}
