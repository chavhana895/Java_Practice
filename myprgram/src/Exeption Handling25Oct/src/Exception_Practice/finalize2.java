package Exception_Practice;

public class finalize2 {

	public static void main(String[] args) {
		finalize1 ff=new finalize1();
	//	finalize2 ffff=new finalize2();
	//	ffff=null;
		ff=null;
		while(true)
		{
			System.gc();
		}
	}
//	protected void finalize() throws Throwable
//	{
//		System.out.println("harami ");
//	}
	

}
