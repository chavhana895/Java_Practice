package Prelims1;
public class Myclass
{
  public static void main(String[] args) 
  { 
   String s="This is bizarre and bizarre things happen often";

  int count=0; 
  int max=Integer.MIN_VALUE;

  String s1[]=s.split(" ");
   

  for(int i=0;i<s1.length;i++)
  {
  if(s1[i].length()>max) max=s1[i].length();
  }
  for (int i=0;i<s1.length;i++)
  {
  if(s1[i].length()==max) 
  count++;
  }
  System.out.println(count) ;
 }
}