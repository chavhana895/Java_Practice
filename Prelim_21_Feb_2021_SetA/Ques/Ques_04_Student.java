package Ques;

public class Ques_04_Student {

	public static void main(String[] args) {
		
		Student[] a=new Student[10];
		
		a[0]=new Student(1, 52, "Somu");
		a[1]=new Student(2, 50, "Somya");
		a[2]=new Student(3, 30, "Sonu");
		a[3]=new Student(4, 52, "Sonya");
		a[4]=new Student(5, 52, "Gomya");
		a[5]=new Student(6, 40, "Gomu");
		a[6]=new Student(7, 45, "Pepu");
		a[7]=new Student(8, 51, "Pepya");
		a[8]=new Student(9, 55, "Suklin");
		a[9]=new Student(10, 20, "Vivek");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].marks>a[j].marks) {
					Student temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	

}

class Student{
	
	int Rno;
	int marks;
	String name;
	
	public Student(int Rno, int marks, String name) {
		
		this.Rno=Rno;
		this.marks=marks;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Student [Rno=" + Rno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	
}