package methodHw1;

public class Myclass {

	public static void main(String[] args) {
		ROOM a= new ROOM();
		a.h=12;
		a.l=10;
		a.w=10;
		
		System.out.println(a.whiteWashingArea());
		System.out.println(a.whiteWashingcost());
		System.out.println(a.geometricalflooringCost());
		System.out.println(a.cementFlooring());
		

	}

}
