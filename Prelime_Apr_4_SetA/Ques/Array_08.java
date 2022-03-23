package Ques;

public class Array_08 {

	public static void main(String[] args) {

//		Example 1:
//			S1={‘a’,’b’,’c’,’d’};
//			S2={‘w’,’x’,’y’,’z’};
//			Output:
//			S3={‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’}.
//			Example 2:
//			S1={‘a’,’b’,’c’,’d’,’e’,’f’,’g’};
//			S2={‘w’,’x’,’y’,’z’};
//			Output:
//			S3={‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’ ,’e’,’f’ ,’g’}.
//			Example 3:
//			S1={‘a’,’b’,’c’,’d’};
//			S2={‘w’,’x’,’y’,’z’ ,’e’,’f’,’g’};
//			Output:
//			S3={‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’ ,’e’,’f’ ,’g’}

		char[] s1 = { 'a', 'b', 'c', 'd' ,'e','f','g'};
		char[] s2 = { 'w', 'x', 'y', 'z' };
		char[] s3 = new char[s1.length + s2.length];
		int index = 0;
		for (int i = 0; i < s3.length; i++) {
			if (i < s1.length)
				s3[index++] = s1[i];
			if (i < s2.length)
				s3[index++] = s2[i];
		}

		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i] + " ");
		}

	}

}
