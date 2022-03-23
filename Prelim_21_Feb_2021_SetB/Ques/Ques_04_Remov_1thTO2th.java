package Ques;

public class Ques_04_Remov_1thTO2th {

	public static void main(String[] args) {
		
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4};
		
		for (int i = 0; i < n.length; i++) {
			
			int count=0;
			
			for (int j = 0; j < a.length; j++) {
				if(n[i]==a[j]) {
					count++;
				}
			}
			if(count>2) {
				count=2;
			}
			
			int[] temp=new int[a.length-count];
			int index=0;
			count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]==n[i] && count<2) {
					count++;
				}else {
					temp[index++]=a[j];
				}
			}
			a=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
