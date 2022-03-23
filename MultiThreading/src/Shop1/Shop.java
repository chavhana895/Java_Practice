package Shop1;

public class Shop {
int pens=0;
public void Produce() {
	pens++;
	System.out.println("Produce "+pens);
}
public void consume() {
	pens--;
	System.out.println("consume "+pens);
}
}
