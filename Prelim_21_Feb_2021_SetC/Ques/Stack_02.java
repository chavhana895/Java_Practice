package Ques;

public class Stack_02 {

	
	static int[] a=new int[5];
	static int index=0;
	public static void main(String[] args) {

		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		push(70);
		
		print();
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());

		print();
		
	}
	
	public static void push(int num) {
		
		try {
			a[index++]=num;
		}catch (Exception e) {
			index--;
			System.out.println(" Array Index Out Of Bounds Exception ");
		}
		
	}

	
	public static int pop() {
		
		if(index==0) {
			System.out.println("Stack is Empty");
			return 0;
		}else {
			
			index--;
			return a[index];
		}
		
	}
	
	public static void print() {
		for (int i = 0; i < index; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
