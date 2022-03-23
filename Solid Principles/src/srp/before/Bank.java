package srp.before;

public class Bank                                             //Violation of code
{
    public void getLoanIntrestInfo(String loanType)
    {
        if (loanType.equals("homeloan"))
        {
            System.out.println("Rate of interest for Home Loan will be 8.5% ");
        }
        else if (loanType.equals("PersonalLoan"))
        {
            System.out.println("Rate of interest for Home PersonalLoan will be 12.5% ");
        }
        else if (loanType.equals("CarLoan"))
        {
            System.out.println("Rate of interest for Home Loan will be 9% ");
        }
        else
        {
            System.out.println("Rate of interest for Home Loan will be 9% ");
        }
    }

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

    public void printPassbook()
    {
        System.out.println("Passbook will be print");
    }
}
