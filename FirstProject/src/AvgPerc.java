
public class AvgPerc {

	public static void main(String[] args) {
	 int m1=40;
			 int m2=41;
			 int m3=42;
			 int m4=40;
			 int m5=41;
			 int m6=42;
			 int total=m1+m2+m3+m4+m5+m6;
			 int avg=total/6;
			 if(avg>=90)
				 System.out.println("A");
			 else if(avg<90 && avg>=80)
				 System.out.println("B");
			 else if(avg<80 && avg>=70)
				 System.out.println("C");
			 else
				 System.out.println("D");
			 
				 
	}

}
