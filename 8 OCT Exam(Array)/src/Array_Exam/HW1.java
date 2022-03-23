package Array_Exam;

public class HW1 {

	public static void main(String[] args) {
int [] a= {21,42,83,41,53,76};
		
		int num=83;
		int counter=0;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num) 
			{
				counter++;
				index=i;
			}
		}
		if (counter==0)
			System.out.println("Not Found");
		else
			System.out.println("Found at Index: "+index);

	}

}
