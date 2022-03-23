package isp.before;

public class User implements InternetBanking
{

    public void payment()
    {
        System.out.println("This feature required to user ");
    }

    public void donateToCharity()
    {
        System.out.println("Its totally depends on user");            //Not Applicable
    }
}
