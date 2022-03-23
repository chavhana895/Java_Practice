package projectAssiment;

public class pattern77 {

	public static void main(String[] args) {
		 
		for(int i=1;i<6;i++)
		{
			int count=0;
			int temp=4;
			for(int j=0;j<5;j++)
			{
				
				if(j-i<0) 
				{
					int result=i+count;
					System.out.print(result+" ");
				}
				count=count+temp;
				temp--;
				
			}
			 
			System.out.println();
		}
		System.out.println("\t\t__\t\t__");
		int counter =1;
		for(int i=0;i<5;i++)
		{
			int counter2=counter;
			int num=4;
			for(int j=0;j<5;j++)
			{
				
				if(j-i<=0) 
				{
					System.out.print(counter2+" ");
				}
				counter2=counter2+num;
				num--;
				
			}
			counter++; 
			System.out.println();
		}
	}

}
