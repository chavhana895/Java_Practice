package sept24;

public class rnNameMark {

	public static void main(String[] args) {
		student s1= new student();
		s1.rn=1;
		s1.name="Somu";
		s1.marks=40;
    	System.out.println(s1.rn+" "+ s1.name+" "+s1.marks);
		
		student s2= new student();
		System.out.println(s2.rn+" "+s2.name+" "+s2.marks);
		

	}

}
