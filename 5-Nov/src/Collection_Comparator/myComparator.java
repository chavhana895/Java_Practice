package Collection_Comparator;

import java.util.Comparator;

public class myComparator implements Comparator<Student> 
{

	@Override
	public int compare(Student s1, Student s2) 
	{
		if(s1.name.length()>s2.name.length())
		return 10;
		else if(s1.name.length()<s2.name.length())
			return -100;
		else
			return 0;
	}

}
