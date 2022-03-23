package ArrayList;

public class ArrayList<type> {
	
	private type[] a=(type[]) new Object[5];
	private int index=0;
		
	public void remove(int i) {
		
		if(i>=0) {
			if(i<index) {
				for (; i < index; i++) {
					a[i]=a[i+1];
				}
				index--;
				return;
			}
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public String toString() {
		
		String s="[";
		for (int i = 0; i < index; i++) {
			s+=a[i];
			if(i<index-1) {
				s+=", ";
			}
		}
		return s+="]";
		
	}
	
	public void print() {
		
		for (int i = 0; i < index; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public void add(type data) {
		
		if(index<a.length) {
			a[index++]=data;
		}else {
			int size=(int) (1.5*a.length);
			type[] b=(type[]) new Object[size];
			for (int i = 0; i < a.length; i++) {
				b[i]=a[i];
			}
			a=b;
			a[index++]=data;
		}
		
	}

}
