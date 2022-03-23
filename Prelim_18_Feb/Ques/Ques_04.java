package Ques;

public class Ques_04 {

	public static void main(String[] args) {

		int[] a= {10,11,12,13,12,14,15,12,11};
		int num=12;
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num) {
				count++;
				break;
			}
		}
		
		int[] b=new int[a.length-1];
		int index=0;
		int cou=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==num && cou==0) {
				cou++;
			}else {
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
