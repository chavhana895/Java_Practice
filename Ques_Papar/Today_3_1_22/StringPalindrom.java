package Today_3_1_22;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abba";
		
		char[] a=s.toCharArray();
		
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		String s2=new String(a);
		
		if(s.equals(s2)) {
			System.out.println("Pelindrom");
		}else {
			System.out.println("Not Pelindrom");
		}
		
	}

}
