package Ques;

public class Ques_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcPjklPxyz";
		int count=0;
		for (int i = 0; i <s1.length() ; i++) {
			if(s1.charAt(i)=='P') {
				count++;
			}
		}
		
		String[] a=new String[count+1];
		int Aindex=0;
		String temp="";
		int i = 0;
		for (; i < s1.length(); i++) {
			if(s1.charAt(i)=='P') {
				a[Aindex++]=temp;
				temp="";
			}
//			else {
				temp+=s1.charAt(i);
//			}
			if(i==s1.length()-1) {
				a[Aindex++]=temp;
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}

}
