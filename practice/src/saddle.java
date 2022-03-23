
public class saddle {

	public static void main(String[] args) {
		int [][]a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int smallnum=0;
				int greaternum=0;
				for (int k = 0; k < a.length; k++) 
				{
					for (int k2 = 0; k2 < a.length; k2++) 
					{
						if(i==k)
						{
							if(a[i][j]>a[k][k2])
								smallnum++;
						}
						else if(j==k2)
						{
							if(a[i][j]<a[k][k2])
								greaternum++;	
						}
					}
				}
				if(greaternum==0 && smallnum==0)
					System.out.println(a[i][j]);
			}
		}
	}

}
