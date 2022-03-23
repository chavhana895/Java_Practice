package HW;
public class HW3 {

	public static void main(String[] args) {
		int []a= {1,3,2,5,4,5,5,5,8,9};
		int num=5;
		int counter=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==num)
			{
				
				counter++;
			}
			if(counter==0)
			System.out.println("Not");
			else
				System.out.println(a[i]);
		}
	}

}
