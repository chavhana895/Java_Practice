package Ques;

public class Basic_Kaprekare_04 {

	public static void main(String[] args) {
		
		int num=297;
		int temp=num;
		//digit count
		//num squer
		// 10 pow count
		//divid two parts
		int digCount=0;
		while(num>0) {
			digCount++;
			int temp1= num%10;
			num=num/10;
		}
		int numSqu=temp*temp;
		
		int pow=(int) Math.pow(10, digCount);
		
		int part1=numSqu%pow;
		int part2=numSqu/pow;
		
		if(temp==part1+part2) {
			System.out.println("Kaprekare");
		}else {
			System.out.println("Not");
		}
		
	}

}
