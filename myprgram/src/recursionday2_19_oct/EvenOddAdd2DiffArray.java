package recursionday2_19_oct;

import java.util.Arrays;

public class EvenOddAdd2DiffArray {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,8,9};
		int evencount=0;
		int count=checount(a,0,evencount);
		int EvenArray[]=new int[count];
		int Oddarray[]=new int[a.length-count];
		AddArrayElement(a,0,EvenArray,0,Oddarray,0);
		System.out.println("Evev Arrays\n"+Arrays.toString(EvenArray));
		System.out.println("odd Arrays\n"+Arrays.toString(Oddarray));
	}

	private static void AddArrayElement(int[] a, int i, int[] evenArray, int evenIndex, int[] oddarray, int oddindex) 
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
				evenArray[evenIndex++]=a[i];
			else
				oddarray[oddindex++]=a[i];
			AddArrayElement(a, ++i, evenArray, evenIndex, oddarray, oddindex);
		}
		
	}

	private static int checount(int[] a, int i, int evencount) {
		if(i<a.length)
		{
			if(a[i]%2==0)
				evencount++;
			return checount(a, ++i, evencount);
		}
		return evencount;
	}

}
