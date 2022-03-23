package Ques;

public class Ques_07Exception {

	public static void main(String[] args) {
//		7. Write a program to find frequency of each character
//		in a string
		
		String s="aabbccccddddeeeeeeffffff";
		
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				int charCount=0;
				for (int j = 0; j < s.length(); j++) {
					if(s.charAt(i)==s.charAt(j)) {
						charCount++;
					}
				}
				System.out.println(s.charAt(i)+" "+charCount);
			}
		}
		
	}

}
