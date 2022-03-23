package Today_3_1_22;

public class Count_Of_Zeros {

	public static void main(String[] args) {
		
		int[] a= {1,0,1,0,1,0,1,0};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			while(a[i]==0) {
				count++;
				break;
			}
		}
		System.out.println(count);
		System.out.println();
	}

}
