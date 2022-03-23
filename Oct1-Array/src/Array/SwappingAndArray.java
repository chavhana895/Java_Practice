package Array;

public class SwappingAndArray {

	public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
	int i=0;
	int j=a.length-1;
	
	while(i<j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	for (int k = 0; k < a.length; k++) {
		System.out.println(a[k]);
	}
	}

}
