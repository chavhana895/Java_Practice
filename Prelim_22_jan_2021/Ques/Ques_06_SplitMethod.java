package Ques;

public class Ques_06_SplitMethod {

	public static void main(String[] args) {
		
		String s1="bcadeafg";
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)=='a') {
				count++;
			}
		}
		String[] a=new String[count+1];
		int aIndex=0;
		String temp="";
		int i = 0;
		for (; i < s1.length(); i++) {
			if(s1.charAt(i)=='a') {
				a[aIndex++]=temp;
				temp="";
			}else {
				temp+=s1.charAt(i);
			}
		}
		if(i==s1.length()) {
			a[aIndex++]=temp;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}

}
