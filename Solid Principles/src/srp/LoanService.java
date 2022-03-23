package srp;

public class LoanService
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
}
