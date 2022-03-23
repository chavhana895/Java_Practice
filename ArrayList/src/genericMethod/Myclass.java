package genericMethod;

public class Myclass {

	public static void main(String[] args) 
	{
	  MyAbcd<Student>list=new MyAbcd<Student>();
	  list.add(new Student(1,"somu",40));
	  list.add(new Student(2,"Gomu",41));
	  list.add(new Student(3,"somya",39));
	  list.add(new Student(4,"gomya",38));
	  
	  list.print();
	  System.out.println("After Remove");
	  list.remove(1);
	  list.print();
	}

}
