package AssimentHW;

public class Hw24 {

	public static void main(String[] args) {
		
			int a[]= {1,2,4,6,7,8};
			int temp=a[0];
			for (int i = 0; i < a.length-1; i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			System.out.println("Element ship to left");
			for (int i = 0; i < a.length; i++)
			{
				System.out.print(" "+a[i]);
			}
			///  unother Logic for Right ship satring loop form end 
			temp=a[a.length-1];
			for (int i = a.length -1; i > 0; i--)
			{
				a[i]=a[i-1];
			} 
			a[0]=temp;
			System.out.println("\nElement ship to right");
			for (int i = 0; i < a.length; i++)
			{
				System.out.print(" "+a[i]);
			}
			
		}

}

