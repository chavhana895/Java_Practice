package Array;

public class maxAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,6,1,3,8,3,3,9,4,6,7};
		int max=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}
