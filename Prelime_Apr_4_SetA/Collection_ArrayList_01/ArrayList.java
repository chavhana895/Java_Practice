package Collection_ArrayList_01;

public class ArrayList <type> {
	
	private type[] a;
	private int index=0;
	
	public ArrayList(int size1) {
		super();
		this.a =(type[])new Object[size1];
	}

	
	public ArrayList() {
		super();
		this.a =(type[])new Object[5];
	}
	
	public void print() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	
	public void add(type data) {
		
		if(index<a.length) {
			a[index++]=data;
		}else {
			int size=(int) (1.5*a.length);
			type[] b=(type[])new Object[size];
			for (int i = 0; i < a.length; i++) {
				b[i]=a[i];
			}
			a=b;
			a[index++]=data;
		}
		
	}

}
