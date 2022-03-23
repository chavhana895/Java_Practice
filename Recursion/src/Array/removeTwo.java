package Array;

public class removeTwo 
{
 static int [] n = {1,2,4};
 static int [] a = {1,1,1,1,1,2,2,3,4};
 public static void main(String[] args) 
 {
    LoopI(0);
    Print(0);
 }
private static void Print(int i) 
{
	if(i<a.length)
	{
		System.out.println(a[i]);
		Print(i+1);
	}
}
private static void LoopI(int i) 
{
	if(i<n.length)
	{
		int cnt=0;
		cnt=findCnt(i,cnt,0);
		if(cnt>2)
			cnt=2;
		int [] newA=new int [a.length-cnt];
		cnt=0;	
		int newAIndex=0;
		addInNewA(i,cnt,newA,newAIndex,0);
		a=newA;
		LoopI(i+1);
	}
}
private static void addInNewA(int i, int cnt, int[] newA, int newAIndex, int j) 
{
	if(j<a.length)
	{
		if(a[j]==n[i] && cnt<2)
			cnt++;
		else
			newA[newAIndex++]=a[j];
		addInNewA(i, cnt, newA, newAIndex, j+1);
	}
}
private static int findCnt(int i, int cnt, int j) 
{
	if(j<a.length)
	{
	   if(a[j]==n[i])
		   cnt++;
		return findCnt(i, cnt, j+1);
	}
	return cnt;
}
}