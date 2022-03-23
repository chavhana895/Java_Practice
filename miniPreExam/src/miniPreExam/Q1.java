package miniPreExam;

public class Q1 
{

	public static void main(String[] args) 
	{
     double unit=30;  
     double bill=0;
     double finalbill=0;
     
     if(unit<=50)
    	 bill=unit*0.50;
     else if(unit<=150)
    	 bill=(50*0.50)+(100-unit)*0.75;
     else if(unit<=250)
    	 bill=(50*0.50)+(100*0.75)+(100-unit*1.20);
     else
    	 bill=(50*50)+(100*0.75)+(100*1.20)+(unit-250)*1.50;
     finalbill=bill*1.20;
     System.out.println(finalbill); 		
	}

}
