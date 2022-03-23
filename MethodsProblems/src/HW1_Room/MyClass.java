package HW1_Room;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room a=new Room();
		a.h=12;
		a.l=10;
		a.w=10;
		System.out.println(a.whiteWashingArea());
		System.out.println(a.whiteWashingCost());
		System.out.println(a.geometricFlooringcost());
		System.out.println(a.cementFlooring());
		
	}

}
