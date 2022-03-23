package Array_BubleSorting;

public class Sorting {

	public static void main(String[] args) {
		
		int []a= {9,1,2,3,7,4,5,6};
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(i<j && a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	}

}
