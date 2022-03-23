package ocp;

public class MobileNotificationService implements NotificationService
{
    public void sendOTP(String medium)
    {
        System.out.println("Confirm first of all medium");
    }

    public void sendTransactionReport(String medium)
    {
        System.out.println("Send Transaction Report");
    }
}