package Ques;

public class Ques_02_String_SplitMethod {

	public static void main(String[] args) {
//		2 Split String without using split() method and store in
//		String array
		
		String s="abc defg hij klm";
		
//		String[] a=s.split(" ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		String[] a1=new String[count+1];
		int index=0;
		String temp="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				a1[index++]=temp;
				temp="";
			}else {
				temp+=s.charAt(i);
			}
			if(i==s.length()-1) {
				a1[index++]=temp;
			}
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}
	
}
