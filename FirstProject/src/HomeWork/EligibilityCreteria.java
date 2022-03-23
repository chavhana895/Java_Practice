package HomeWork;

import java.util.Scanner;

public class EligibilityCreteria {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sub marks");
	    int Maths=sc.nextInt();
		int Phy=sc.nextInt();
		int Chem=sc.nextInt();
		
		if(Maths>=65 && Phy>=55 && Chem>=50)
		{
			if((Maths+Phy+Chem)>=190 || (Maths+Phy>=140))
					{
						System.out.println("eligible");
					}
			
		
			else {
				System.out.println("not elligible");
			}

	    }
		else {
			System.out.println("not eligible");
		}
		}
	}
