package Ques;

public class Ques_04_SortArray {

	public static void main(String[] args) {
//		4 Take 2 integer arrays and sort them and store in same array. 
//		Can not use third array
//		e.g: Input: a1={8,2,7,5,6} a2={9,1,3,4} 
//		Output:a1={1,2,3,4,5}a2={6,7,8,9}
		
		int[] a1={8,2,7,5,6};
		int[] a2={9,1,3,4};
		
		for (int i = 0; i < a1.length+a2.length; i++) {
			for (int j = i+1; j < a1.length+a2.length; j++) {
				if(i<a1.length) {
					if(j<a1.length) {
						if(a1[i]>a1[j]) {
							int temp=a1[i];
							a1[i]=a1[j];
							a1[j]=temp;
						}
					}else {
						if(a1[i]>a2[j-a1.length]) {
							int temp=a1[i];
							a1[i]=a2[j-a1.length];
							a2[j-a1.length]=temp;
						}
					}
				}else {
					if(a2[i-a1.length]>a2[j-a1.length]) {
						int temp=a2[i-a1.length];
						a2[i-a1.length]=a2[j-a1.length];
						a2[j-a1.length]=temp;
					}
				}
			}
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");
		}
	}

}
