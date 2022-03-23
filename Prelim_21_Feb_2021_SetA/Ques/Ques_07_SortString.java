package Ques;

public class Ques_07_SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="456123";
		char[] a=s1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		String s2=new String(a);
		System.out.println(a);
		
	}

}
