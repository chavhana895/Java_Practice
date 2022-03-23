package AssimentHW;

public class HW27 {

	public static void main(String[] args) {
		String[] S1={"a","b","c","d"};
		String []S2={"w","x","y","z"};
		
		String []s3=new String[S1.length+S2.length];
	//	System.out.println(s3.length);
		int index1=0;
		int index2=0;
		for (int i = 0; i < s3.length; i++)
		{
			
			s3[i]=S1[index1];
			i++;
			index1++;
			s3[i]=S2[index2];
			index2++;

		}
		for (int i = 0; i < s3.length; i++)
		{
			System.out.print(s3[i]+" ");
		}

	}

}
