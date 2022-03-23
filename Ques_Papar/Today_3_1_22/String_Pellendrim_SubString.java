package Today_3_1_22;

public class String_Pellendrim_SubString {

	public static void main(String[] args) {
		String s1 = "ABAAB";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 2; j <= s1.length(); j++) {
				String s2 = s1.substring(i, j);
				boolean Pellendrom = Pellendrom(s2);
				if (Pellendrom) {
					System.out.println(s2);
				}
			}
		}
	}
	private static boolean Pellendrom(String s2) {
		int i = 0;
		int j = s2.length() - 1;
		boolean istrue = true;
		while (i < j) {
			if (s2.charAt(i) != s2.charAt(j)) {
				istrue = false;
				break;
			}
			i++;
			j--;
		}
		return istrue;
	}
}
