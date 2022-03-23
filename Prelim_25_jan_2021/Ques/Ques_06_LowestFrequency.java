package Ques;

public class Ques_06_LowestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbc";

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i-1; j >= 0; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					break;
				}
			}
			if (count == 0) {

				int charCount = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						charCount++;
					}
				}

				if (charCount <= min) {
				min=charCount;
				System.out.println(s.charAt(i)+" "+charCount);
			
				}
			}
		}

	}

}
