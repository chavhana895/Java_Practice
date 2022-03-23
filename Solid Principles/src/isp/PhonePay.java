package isp;

public class PhonePay implements UPIPayment
{
    public void payMoney()
    {
        System.out.println("PhonePay have the feature to making the payment");
    }
    public void getScratchCard()
    {
        System.out.println("PhonePay gives the scratch card by making the payment ");
    }
}
