
public class ab {

	public static void main(String[] args) {
		int []a= {1,2,9,5,7,3,6};
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
		if(a[i]<min)
		{
			min=a[i];
		}
		}
		int min2=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]!=min )
			{
			if(a[i]<min2)
				min2=a[i];
			}
		}
		int min3=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]!=min)
			{
				if (a[i]!=min2)
				{
					if(a[i]<min3)
						min3=a[i];
				}
			}
	}
		System.out.println(min3);
	}

}
