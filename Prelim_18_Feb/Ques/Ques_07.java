package Ques;

public class Ques_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abpqabcpqapq";
		String s2="pq";
		int index=0;
		int cnt=0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				String sub="";
				for (int j = i; j < i+s2.length(); j++) {
					sub+=s1.charAt(j);
				}
				if(sub.equals(s2)) 
				{
					index=i;
					cnt++;
				}
				if(cnt==2)
					System.out.println(index);
			}
		}
	
	}

}
