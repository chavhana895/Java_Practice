package Q7;

public class College {
String collegeName;
String collegeAddress;
public College(String collegeName, String collegeAddress) {
	super();
	this.collegeName = collegeName;
	this.collegeAddress = collegeAddress;
}
      void displyCollegeDetails()
      {
    	  System.out.println(collegeName+" "+collegeAddress);
      }
      Person p= new Person("Avinash",123,"Software Engineer",2,"Pune");
}
