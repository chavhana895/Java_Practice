package methd2;

public class Myclass {

	public static void main(String[] args) throws Exception {
		Abcd abcd=new Abcd();
		Thread1 t1=new Thread1(abcd);
		Thread2 t2=new Thread2(abcd);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(abcd.count);
	}

}
