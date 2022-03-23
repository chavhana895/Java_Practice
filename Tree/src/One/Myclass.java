package One;

public class Myclass {

	public static void main(String[] args) 
	{
	  MyTree tree=new MyTree();
	  tree.add(5);
	  tree.add(6);
	  tree.add(8);
	  tree.add(13);
	  tree.add(11);
	  tree.add(10);
	  tree.add(12);
	  
	  tree.print();     
	  
	  System.out.println("```````````````````````Size``````````````````````");
	  System.out.println(tree.size());  
	  
System.out.println("````````````````````Contains Method`````````````````");
System.out.println(tree.contains(12));

System.out.println(tree.isEmpty());
	}

}