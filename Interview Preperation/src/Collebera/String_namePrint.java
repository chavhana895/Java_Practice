package Collebera;

public class String_namePrint 
{
	public static void main(String[] args)
	{
		
	  String name="Avinash";
	  String s="i";
	  s=s.replaceAll("i", "iiiii");
	  s=s.replaceAll("i", "iiii");           //20 times name print
	  s=s.replaceAll("i", name+ "\n");
	  System.out.println(s);
	}
}