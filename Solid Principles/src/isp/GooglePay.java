package isp;

public class GooglePay implements UPIPayment,Cashback
{
    public void payMoney()
    {
        System.out.println("GooglePay Send the Money");
    }
    public void getScratchCard()
    {
        System.out.println("GooglePay gives the Scratch Card ");
    }
    public void getCashBackAsCreditBalance()
    {
        System.out.println("Get the cashback by making payments ");
    }
}
