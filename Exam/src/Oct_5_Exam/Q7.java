package Oct_5_Exam;

public class Q7 {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},
				{7,8,9},
				{2,34,3}};
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
					System.out.println(a[i][j]);
			}
		}

	}

}
