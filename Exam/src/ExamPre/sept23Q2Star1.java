package ExamPre;

public class sept23Q2Star1 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j-i<=0)
					System.out.print(i+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
