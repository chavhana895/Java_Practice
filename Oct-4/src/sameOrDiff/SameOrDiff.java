package sameOrDiff;

public class SameOrDiff {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int[]b= {1,2,3,4,5,6};
		
		if(a.length==b.length)
		{   int diffCount=0;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
					diffCount++;
					
			}
			if(diffCount==0)
				System.out.println("Same");
			else
				System.out.println("Not Same");
			
		}
		else
			System.out.println("Not Same");
	}

}
