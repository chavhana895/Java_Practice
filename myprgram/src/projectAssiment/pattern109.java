package projectAssiment;

public class pattern109 {

	public static void main(String[] args) {
		int cnt=1;
		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				if(j+i<4)
					System.out.print(1);
				else if(j+i>=4)
					System.out.print(cnt);
				else
					System.out.print(0);
				
			}
			cnt++;
			System.out.println();
		}
	}

}
