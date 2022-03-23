package string2.oct13;

public class hw34 {

	public static void main(String[] args)
	{
		String ss="aaa aa aaaa bbbbb ccccc";
		String[] sss=ss.split(" ");
		for (int i = 0; i < sss.length; i++)
		{
			for (int j = 0; j < sss.length; j++)
			{
				if(sss[i].length()< sss[j].length())
				{
					String temp=sss[i];
					sss[i]=sss[j];
					sss[j]=temp;
				}
			}
			
		}

		System.out.println("smallest :- "+sss[0]);
		System.out.println("Largest :- "+sss[sss.length-1]);

	}

}
