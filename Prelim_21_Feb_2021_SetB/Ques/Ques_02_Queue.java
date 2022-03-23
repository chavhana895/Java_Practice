package Ques;

public class Ques_02_Queue {
	
	static int []a=new int[5];
	static int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		print();
		System.out.println(pop());
		push(100);
		print();
	}
	
	public static void print() {
		for (int i = 0; i < index; i++) {
//			try {
			System.out.print(a[i]+" ");
//			}catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println();
//				System.out.println("Array Index Out Of Bounds Exception");
//			}
		}
		System.out.println();
	}

	public static int pop() {
		if(index==0) {
			System.out.println("Queue is Empty");
			return 0;
		}else {
			int temp=a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i]=a[i+1];
			}
			index--;
			return temp;
		}
		
		
	}
	
	public static void push(int data) {
//		if(index<a.length) {
		try {
			a[index++]=data;
		}catch (Exception e) {
			index--;
			System.out.println("Ques is Full");
		}
//		}else{
//			System.out.println("Ques is Full");
//		}
	}
	
}
