package CW5_CopyConstructor;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(1,"somu",40);
		s1.print();
		
		Student s2=new Student(s1);
		s2.print();
		
		Student s3=new Student(s2);
		s3.print();
		
		//Student s4=s1;//we dont use this because it dont create the object it only copy that object
		//s4.print();
		
	}

}
