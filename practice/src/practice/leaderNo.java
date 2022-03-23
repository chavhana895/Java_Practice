package practice;

public class leaderNo {

	public static void main(String[] args) {
	int []a= {34,23,21,16,18,19};
	
	for (int i = 0; i < a.length; i++) 
	{ int num=a[i];
	int counterCount=0;
	for (int j =i+1; j < a.length; j++) 
	{
		if(a[j]>num)
			counterCount++;
	}
	if(counterCount==0)
		System.out.print(a[i]+" ");
	}

	}

}
