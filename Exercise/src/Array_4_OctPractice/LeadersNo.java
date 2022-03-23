package Array_4_OctPractice;

public class LeadersNo {

	public static void main(String[] args) {
		int[]a= {5,7,56,6,51,23,9};
		for (int i = 0; i < a.length; i++) 
		{
			int num=a[i];
			int greaterCount=0;
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[j]>num)
					greaterCount++;
			}
			if(greaterCount==0)
				System.out.println(num);
		}


	}

}
