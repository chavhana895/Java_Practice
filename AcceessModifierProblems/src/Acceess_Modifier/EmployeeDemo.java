package Acceess_Modifier;

public class EmployeeDemo {
	int id;
	String name;
	int salary;
	String Dept;
	
	
	protected void emp_id()
	{
		
		System.out.println("ID="+id);
	}
	public void emp_name() 
	{
		System.out.println("Welcome  "+name);
		System.out.println("Name="+name);
	}
	private void emp_salary() 
	{
		System.out.println("Salary="+salary);
	}
	void emp_dept()
	{
		System.out.println("Dept="+Dept);
	}
}
