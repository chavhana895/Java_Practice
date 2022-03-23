package HW_25;

public class MyClass {

	public static void main(String[] args) {
		
		Student a=new Student(1, 25, "Ramu");
		Student b=new Student(2, 55, "Raju");
		Student c=new Student(3, 25, "Ramesh");
		Student d=new Student(4, 75, "Radha");
		Student e=new Student(5, 55, "Rajya");
		Student f=new Student(6, 34, "Ajinkya");
		Student g=new Student(7, 25, "Prathmesh");
		Student h=new Student(8, 38, "Avinash");
		Student i=new Student(1, 25, "Radhe");
		Student j=new Student(1, 25, "Ajya");
		
		Student []s= {a,b,c,d,e,f,g,h,i,j};
		
		for (int j2 = 0; j2 < s.length; j2++)
		{
			for (int k = 0; k <s.length; k++) 
			{
				if(j2>k && s[j2].marks<s[k].marks)
				{	Student temp=s[j2];
				s[j2]=s[k];
				s[k]=temp;
				}		
			}
		}
		
		System.out.println(s[s.length-1]);

	}

}
