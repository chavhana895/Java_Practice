package copyConstructor;

public class Myclass {

	public static void main(String[] args) {
		Student s= new Student(10,"Somu",40);
		s.print();
			
		Student s1= new Student(s);
		s.print();
		
		Student s2= new Student(s1);
		s.print();
		
	}

}
