package Array;

public class SaddlePoint {

	public static void main(String[] args) {
		int [][]a= {
				{6,3,1},
				{9,7,8},
				{2,4,5}};
		int saddle=0;
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{  
				int element=a[i][j];
				int row=i;
				int col=j;
				int SmallerElementsInRow=0;
				for (int i2 = 0; i2 < a.length; i2++) 
				{
					for (int j2 = 0; j2 < a.length; j2++) 
					{
						if(i2==row)
						{
							if(a[i2][j2]<element)
								SmallerElementsInRow++;
						}
					}
				}
				int greaterElementInCol=0;
				for (int i2 = 0; i2 < a.length; i2++) 
				{
					for (int j2 = 0; j2 < a.length; j2++) 
					{
						if(j2==col)
						{
							
							if(a[i2][j2]>element)
							greaterElementInCol++;
						}
					}
				}
				if(SmallerElementsInRow==0 && greaterElementInCol==0)
				{
					saddle=a[i][j];
					count++;
				}
			}
		}
		if(count!=0)
			System.out.println("Sadle No: "+saddle);
		else
			System.out.println("Not Found");
		
		}

		
	}


