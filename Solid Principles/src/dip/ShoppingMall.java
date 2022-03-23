package dip;

public class ShoppingMall
{
    private static CreditCard creditCard;           //declare attributes

    public ShoppingMall(CreditCard creditCard)
    {
        this.creditCard = creditCard;
    }

    public static void doPurchaseSomething(long amount)
    {
        creditCard.doTransaction(amount);
    }

    public static void main(String[] args)
    {
        CreditCard creditCard = new CreditCard();
        ShoppingMall mall = new ShoppingMall(creditCard);
        ShoppingMall.doPurchaseSomething( 5000);
    }
}
