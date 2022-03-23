package srp;

public class NotificationService
{
    public void sendOTP(String medium)
    {
        if(medium.equals("email"))
        {
            System.out.println("It will be valid email only");
        }
        if(medium.equals("mobile"))
        {
            System.out.println("Confirmed mobile no only");
        }
    }
}
