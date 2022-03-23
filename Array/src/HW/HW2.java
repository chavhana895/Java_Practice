package HW;

public class HW2 {

	public static void main(String[] args)
	{
      int [] a = {24,13,25,28,34,12,18};
      int num=14;
      int cnt=0;
      for (int i = 0; i < a.length; i++)
      {
		if(a[i]==num)
	    cnt++;
	  }
      if(cnt==0)
    	  System.out.println("Not Found");
      else
    	  System.out.println("Found");
	}

}
