package HW;

public class Methods {

	public static void main(String[] args) 
	{
	  String s="Hefshiner  Radhe%    Radhe$$";
	  
	  System.out.println("************CharAt*********");                                    //     #1
	  System.out.println(s.charAt(4));
	  System.out.println();
	  
	  System.out.println("************CodePointAt*********");                              //     #2
	  System.out.println(s.codePointAt(5));
	  System.out.println();
	  
	  System.out.println("************CompareTo*********");                                //     #3
	  System.out.println(s.compareTo("shine"));
	  System.out.println(s.compareTo("Hefshiner"));
	  System.out.println(s.compareTo("Hefshinerrrr"));
	  System.out.println(s.compareTo("Hef"));
	  System.out.println();
	  
	  System.out.println("************CompareToIgnoreCase*********");                      //     #4
	  System.out.println(s.compareToIgnoreCase("Hefshi"));
	  System.out.println(s.compareToIgnoreCase("hefShiner"));
	  System.out.println();
	  
	  System.out.println("************Concat*********");                                   //     #5
	  System.out.println(s.concat("ABC"));
	  String a=s+"ABC";
	  System.out.println(a);
	  System.out.println();
	  
	  System.out.println("************Contains*********");                                 //     #6
	  System.out.println(s.contains("shine"));
	  System.out.println(s.contains("Shine"));
	  System.out.println();
	  
	  System.out.println("************Endswith*********");                                 //     #7
	  System.out.println(s.endsWith("er"));
	  System.out.println(s.endsWith("aer"));
	  System.out.println();
	  
	  System.out.println("************Startswith*********");                               //     #8
	  System.out.println(s.startsWith("Hef"));
	  System.out.println();
	  
	  System.out.println("************Equal*********");                                    //     #9
	  System.out.println(s.equals("Hefshine"));
	  System.out.println();
	  
	  System.out.println("************IndexOf*********");                                  //     #10
	  System.out.println(s.indexOf("e"));
	  System.out.println();
	  
	  System.out.println("************lastIndexOf*********");                              //     #11
	  System.out.println(s.lastIndexOf("e"));
	  System.out.println();
	  
	  System.out.println("************length*********");                                   //     #12
	  System.out.println(s.length());
	  System.out.println();
	  
	  System.out.println("************replace*********");                                  //     #13
	  System.out.println(s.replace("e", "A"));
	  System.out.println();
	  
	  System.out.println("************split*********");                                    //     #14
	  System.out.println(s.split(" "));
	  System.out.println();
	  
	  System.out.println("************toCharArray*********");                              //     #15
	  System.out.println(s.toCharArray());
	  System.out.println();
	  
	  System.out.println("************SubString*********");                                //     #16
	  System.out.println(s.substring(3, 6));
	  System.out.println();
	  
	  System.out.println("************toUpperCase*********");                              //     #17
	  System.out.println(s.toUpperCase());
	  System.out.println();
	  
	  System.out.println("************toLowerCase*********");                              //     #18
	  System.out.println(s.toLowerCase());
	  System.out.println();
	  
	  System.out.println("************trim*********");                                     //     #19
	  System.out.println(s.trim());
	  System.out.println();
	  
	  
	}

}
