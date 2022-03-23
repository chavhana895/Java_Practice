
public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int basicSalary=30000;
if(basicSalary<=10000)
{
	double grossSalary=basicSalary+ basicSalary*0.2+basicSalary*0.8;
	System.out.println(grossSalary);
}
else if(basicSalary<=20000)
{
	double grossSalary=basicSalary+ basicSalary*0.25+basicSalary*0.9;
	System.out.println(grossSalary);
}
else
{
	double grossSalary=basicSalary+ basicSalary*0.3+basicSalary*0.95;
	System.out.println(grossSalary);
}
	}

}
