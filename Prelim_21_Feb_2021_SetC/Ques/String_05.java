package Ques;

public class String_05 {

	public static void main(String[] args) {

		String s = "   abc       def        ghi    ";

		int i = 0;
		while (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
			i++;
		}

		int j = s.length() - 1;
		while (s.charAt(j) == ' ' && s.charAt(j - 1) == ' ' && s.charAt(j - 2) == ' ') {
			j--;
		}
		for (int k = i; k <= j; k++) {
			System.out.print(s.charAt(k));
		}
		System.out.println();
		String s1 = "";
		for (int k = i; k <= j; k++) {
			int cnt = 0;
			for (int l = k; l < k + 3; l++) {
				if (s.charAt(l) == ' ')
					cnt++;
				if (l == j)
					break;
			}
			if (cnt != 3)
				s1 = s1 + s.charAt(k);
		}
		System.out.println(s1);
	}
}
