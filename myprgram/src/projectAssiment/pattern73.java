package projectAssiment;

public class pattern73 {

	public static void main(String[] args)
	{
		int mid_Point=0;
		for(int i=0;i<9;i=i+2)
		{
			int count=1;
			for(int j=0;j<9;j++)
			{
				
				if(j-i<=0) 
				{
					if(j<mid_Point)
						System.out.print((char)(count+++64)+" ");
					else
						System.out.print((char)(count--+64)+" ");
				}
				
			}
			System.out.println();
			mid_Point++;
		}

	}

}
