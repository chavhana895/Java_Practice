package Array_Exam;

public class Q4 {

	public static void main(String[] args) {
		int [][]a= {{6,3,1},
				{9,2,8},
				{2,4,5}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a.length; j++) 
			{   if(a[i])
				int smallerCount=0;
				int greaterCount=0;
				for (int i2 = 0; i2 < a.length; i2++) 
				{
					for (int j2 = 0; j2 < a.length; j2++) 
					{
						if(j2==j)
						greaterCount++;
					}
					
				}
			}
		}
		}
	}


