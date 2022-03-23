package Ques;

public class Ques_05_Array0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 18, 12, 17, 15, 6 };
		int[] b = { 9, 1, 3, 4};
		
		for (int i = 0; i < a.length+b.length; i++) {
			for (int j = i+1; j < a.length+b.length; j++) {
				if(i<a.length) {
					if(j<a.length) {
						if(a[i]>a[j]) {
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}else {
						if(a[i]>b[j-a.length]) {
							int temp=a[i];
							a[i]=b[j-a.length];
							b[j-a.length]=temp;
						}
					}
				}else {
					if(b[i-a.length]>b[j-a.length]) {
						int temp=b[i-a.length];
						b[i-a.length]=b[j-a.length];
						b[j-a.length]=temp;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
