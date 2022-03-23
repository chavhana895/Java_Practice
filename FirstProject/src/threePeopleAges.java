
public class threePeopleAges {

	public static void main(String[] args) {
		int P1=12;
		int P2=14;
		int P3=24;
		
		if(P1>P3 && P1>P2) 
			System.out.println("P1 is oldest");
			else if (P2>P1 && P2>P3)
				System.out.println("P2 is oldest");
			else if(P3>P1 && P3>P2)
				System.out.println("P3 is oldest");
		
			else if(P1<P3 && P1<P2) 
			System.out.println("P1 is Youngest");
			else if (P2<P1 && P2<P3)
				System.out.println("P2 is Youngest");
			else if(P3<P1 && P3<P2)
				System.out.println("P3 is Youngest");
		
		
			

	}

}
