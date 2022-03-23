package CW3;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountManagement a=new AccountManagement();
		a.insertdata("somu",15,4555);
		a.displaydata();
		a.depositAmount(150000);
		a.withdrawAmount(11000);
		a.accountBalance();

	}

}
