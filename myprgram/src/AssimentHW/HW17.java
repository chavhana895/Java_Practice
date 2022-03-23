package AssimentHW;

public class HW17 {


	public static void main(String[] args) {
		int [] Ar= {0,1,0,1,0,1,0};
		
		for(int i=0;i<Ar.length;i++)
		{
			if(Ar[i]==0)
				Ar[i]=1;
			else
				Ar[i]=0;
			
		}
		for (int i = 0; i < Ar.length; i++)
		{
			System.out.print(Ar[i]+",");
		}
	}
}
