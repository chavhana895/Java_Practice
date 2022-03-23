package Today_3_1_22;

public class String_Split_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="cPabfghiabPjklm";
		String s1="ab";

		String[] a=s.split(s1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			String temp="";
			if(s.charAt(i)==s1.charAt(0)) {
				for (int j = i; j < i+s1.length(); j++) {
					temp+=s.charAt(j);
				}
				if(temp.equals(s1)) {
					count++;
				}
			}
		}
		String[] b=new String[count+1];
		int index=0;
		String temp="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='P') {
				b[index++]=temp;
				temp="";
			}
			else {
				temp+=s.charAt(i);
			}
			if(i==s.length()-1) {
				b[index++]=temp;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
