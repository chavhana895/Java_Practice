package GetterandSetter;

public class One {
private int fees=5000;
public void setFees(int newFees)
{
if(newFees>0)
	fees=newFees;
}
public int getFees()
{
	return fees;
}
}
