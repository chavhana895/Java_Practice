package Ques;

public class String_Split_07 {

	public static void main(String[] args) {

		String s1 = "abcPjklPxyz";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'P') {
				count++;
			}
		}

		String[] a = new String[count + 1];
		int aIndex = 0;
		String temp = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'P') {
				a[aIndex++] = temp;
				temp = "";
			} 
//			else {
				temp += s1.charAt(i);
//			}
			if(i==s1.length()-1) {
				a[aIndex++]=temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
