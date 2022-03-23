package Sept22;

public class num71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)           //71
		{ int counter=1;
			for(int j=0;j<9;j++)
			{
				if(j<=2*i)
					System.out.print(counter);
				else 
					System.out.print(" ");
				if(j-i<0)
					counter++;
				else
					counter--;
		}
			System.out.println();
	}
		
	}

}
