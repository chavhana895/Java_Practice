import dip.CustomerBusinessLogic;
import dip.CustomerDataAccess;
import isp.GooglePay;
import lsps.Instagram;
import ocp.EmailNotificationService;
import srp.LoanService;

public class Application
{
    public static void main(String[] args)
    {
        LoanService l = new LoanService();                                    //srp
        l.getLoanIntrestInfo("homeloan");

        EmailNotificationService e = new EmailNotificationService();          //OCP
        e.sendOTP("Mobile");

        Instagram i = new Instagram();                                        //ilsp
        i.chatWithFriend();

        GooglePay g = new GooglePay();                                      //isp
        g.getScratchCard();

       CustomerDataAccess c = new CustomerDataAccess();               //dip
       c.getCustomerName(1);

    }
}