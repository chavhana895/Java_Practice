package Ques;

public class Ques_05_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefabcdefgh";  
		String a="";
		int start=0;
		int end = 0;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			int j = i+1;
			for (; j < s.length(); j++) {
				
				int cou=0;
				for (int k = i; k < j; k++) {
					if(s.charAt(j)==s.charAt(k)) {
						cou++;
						break;
					}
				}
				if(cou!=0) {
					break;
				}
				if(j==s.length()) {
					break;
				}
			}
			int lenSub=j-i;
			if(lenSub>max) {
				max=lenSub;
				start=i;
				end=j-1;
			}
		}
		System.out.println(max);
		for (int i = start; i <= end; i++) {
			System.out.print(s.charAt(i));
		}
	}

}
