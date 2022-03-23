package AssimentHW;

public class HW25Asir {

	public static void main(String[] args)
	{
		
		Student1 s1=new Student1(1,"sumu",10);
		Student1 s2=new Student1(2,"gomu",20);
		Student1 s3=new Student1(3,"chinkya",30);
		Student1 s4=new Student1(4,"minkya",40);
		Student1 s5=new Student1(5,"pickya",50);
		Student1 s6=new Student1(7,"sumu",60);
		Student1 s7=new Student1(6,"sumu",70);
		Student1[] s= {s1,s2,s3,s4,s5,s6,s7};
		Student1 obj=new Student1();
		System.out.println("Student are follows :-");
		obj.Display(s);
		System.out.println("\n\nSorting Student Marks vice\n\n");
		obj.sorting(s);
		obj.Display(s);
	}

}
class Student1
{
	int marks,id;
	String name;
	public Student1(int id,  String name,int marks)
	{
		super();
		this.marks = marks;
		this.id = id;
		this.name = name;
	}
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	void Display(Student1[] s)
	{
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i].id+ "\t" + s[i].name + "\t"+s[i].marks);
		}
	}
	void sorting(Student1[] s)
	{
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s.length; j++) 
			{
				if(s[i].marks>s[j].marks)
				{
					Student1 temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	}
	
}
