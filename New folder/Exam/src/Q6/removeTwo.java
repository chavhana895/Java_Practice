package Q6;

public class removeTwo {
	static int []n= {1,2,4};
		static int [] a= {1,1,1,1,1,2,2,3,4};
		public static void main(String[] args)
		{
			LoopI(0);
			print(0);
		}
		private static void print(int i)
		{
			for ( int j= 0; j < a.length; j++)
			{
				System.out.println(a[j]);
			}
		}
		private static int[] LoopI(int i)
		{
		   if(i<a.length)
		   {
			   int cnt=0;
			   cnt= newCount(i,cnt,0);
			   if(cnt>2)
			   {
				   cnt=2;
			   }
			  int[]   newA=new int[a.length-cnt];
			  int newIndex=0;
			  for (int j = 0; j < newA.length; j++) 
			   {
				newA[newIndex++]=a[j];
			   }
			  a=newA;
		   }
		return a;
		}
		private static int newCount(int i, int cnt, int j)
		{
			if(j<a.length)
			{
				if(a[j]==n[i]  && cnt<2)
				{
					cnt++;
				}
			}
			return cnt;
		}
	
}
