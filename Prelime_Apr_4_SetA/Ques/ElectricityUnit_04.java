package Ques;

public class ElectricityUnit_04 {

	public static void main(String[] args) {
		
//		 For first 50 units Rs. 0.50/unit 
//		 For next 100 units Rs.0.75/unit 
//		 For next 100 units Rs. 1.20/unit 
//	  	 For unit above 250 Rs.1.50/unit
//		 An additional surcharge of 20% is added to the bill 
//		 (I/P: 30 O/P:18. i/p 130 o/p: 102. i/p 230 o/p 235.2
		
		int unit=230;
		
		double UnitBill=0;
		double bill = 0;
		
		if(unit<50) {
			bill=unit*0.50;
		}else if(unit<150) {
			bill=50*0.50 + (unit-50)* 0.75 ;
		}else if(unit<250) {
			bill=50*0.50 + 100 *0.75 + (unit-150)* 1.20 ;
		}else if(unit>250) {
			bill=50*0.50 + 100 *0.75 + 100 * 1.20 + (unit-250)* 1.50 ;
		}
		
		UnitBill=1.2*bill;
		System.out.println(UnitBill);
		
	}

}
