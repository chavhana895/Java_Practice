package HW1;

public class MyClass {

	public static void main(String[] args) {
		Employee a=new Employee();
		a.name="raju";
		a.age=22;
		a.phonenumber=123456;
		a.address="katraj";
		a.salary=15000;
		a.printdatabyEmployee();
		
		Manager b=new Manager();
		b.name="ramesh";
		b.age=23;
		b.phonenumber=554554;
		b.address="pune";
		b.salary=20000;
		b.printdatabyManager();
		

	}

}
