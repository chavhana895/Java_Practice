package dip;

public class CustomerBusinessLogic
{
    ICustomerDataAccess iCustomerDataAccess;

    public CustomerBusinessLogic(ICustomerDataAccess iCustomerDataAccess)
    {
        this.iCustomerDataAccess = DataAccessFactory.getCustomerDataAccessObj();
    }

    public String getCustomerName(int id)
    {
        return iCustomerDataAccess.getCustomerName(id);
    }
}