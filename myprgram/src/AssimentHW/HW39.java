package AssimentHW;
import java.util.Arrays;

public class HW39 {

	public static void main(String[] args) {
		int a[]= {5, 1, 3, 6, 8, 2, 9, 0, 10};
		int inca=0,deca=0,incaindex=0,decresing=0;
		if(a[0]>a[1])
		{
			deca=a[0];
			inca=a[1];
		}
		else 
		{
			deca=a[0];
			inca=a[1];
		}
		incaindex++;
		decresing++;
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>inca)
			{
				inca=a[i];
				incaindex++;
			}
			else if(a[i]<deca)
			{
				deca=a[i];
				decresing++;
			}
			else
			{
				System.out.println("-1 \n No such sequences possible go hell");
				System.exit(0);
			}
		}
		int []incA=new int[incaindex];
	//	System.out.println(Arrays.toString(incA));
		int []Decresing=new int[decresing];
		//System.out.println(Arrays.toString(Decresing));
		deca=0; inca=0;
		if(a[0]>a[1])
		{
			Decresing[deca]=a[0];
			incA[inca]=a[1];
		}
		else 
		{
			incA[deca]=a[0];
			incA[inca]=a[1];
		}
	//	System.out.println(Arrays.toString(Decresing));
	//	System.out.println(Arrays.toString(incA));
		inca++;
		deca++;
		for (int i = 2; i < a.length; i++)
		{

			if(a[i]>inca)
			{
				incA[inca]=a[i];
				inca++;
				
			}
			else 
			{
				Decresing[deca]=a[i];
				deca++;
				
			}
		}
		System.out.println(Arrays.toString(Decresing));
		System.out.println(Arrays.toString(incA));
	}

}
