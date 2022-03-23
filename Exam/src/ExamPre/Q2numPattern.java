package ExamPre;

public class Q2numPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<5;i++) {
	for(int j=0;j<10;j++) {
		if(j-i<=0 || j+i>=9)
			System.out.print(i+1);
		else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
