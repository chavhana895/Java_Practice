package oct14;

public class hw15 {

	public static void main(String[] args) {
		String s="Hwllo_Word";
		char[] ss=indexreturn(s);
		String sss=new String(ss);
		System.out.println(sss);
	}

		private static char[] indexreturn(String s)
		{
			char [] ss=s.toCharArray();
			char []rs=new char[ss.length-2];
			int cnt=0;
			int index=0;
			for (int i = 0; i < ss.length; i++)
			{
				if(i!=3 && i!=4)
				{
					rs[index++]=ss[i];
					cnt++;
				}
				if(cnt==0)
					rs[index++]=ss[i];
			}
			return rs;
		}
		}
		
		
		
		
		
//		char [] ss=s.toCharArray();
//		for (int i = 0; i < ss.length; i++)
//		{
//			if(i!=3 && i!=4)
//			{
//				System.out.println(ss[i]+ "   "+i);
//			}
//		}

//	}

//}

	
