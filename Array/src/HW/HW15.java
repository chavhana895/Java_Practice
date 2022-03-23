package HW;

public class HW15 {

	public static void main(String[] args)
	{
      int []a= {31,22,12,34,23,29,8,9,3,7,2};
      
       System.out.print("Leaders Numbers are: ");
      for (int i = 0; i < a.length; i++)
      {
    	  int num=a[i];
    	  int greaterCnt=0;
		for (int j = i+1; j < a.length; j++)
		{
			if(num<a[j])
				greaterCnt++;
		}
		if(greaterCnt==0)
			System.out.print(num+" ");
	  }
	}

}
