package Array_4_OctPractice;

public class HW_15LeadersNo {

	public static void main(String[] args) {
		int[]a= {67,1,2,56,3,15,4,5,6,7,17,8,9,10};
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
