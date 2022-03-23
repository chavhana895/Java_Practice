package practice;

public class char5Booklet {

	public static void main(String[] args) {
		for(int i=0;i<13 ;i++) {
			for(int j=0;j<7 ;j++) {
			if(j+i<7 || j-i<=6)	
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
