package Ques_03;

public class Employee {

	int salary;
	int age;
	String name;
	
	public Employee(int salary, int age, String name) {
		
		this.salary=salary;
		this.age=age;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", age=" + age + ", name=" + name + "]";
	}
	
}
