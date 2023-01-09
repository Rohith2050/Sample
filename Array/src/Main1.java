interface BankNew
{
    boolean applyForCreditCard(Customer customer);
}
interface IBank extends BankNew
{
    int CautionMoney=2000;
    String createAccount(Customer customer);
    double issueVehicleLoan(String vehicleType,Customer customer);
    double issueHouseLoan(Customer customer);
    double issueGoldLoan(Customer customer);
}
class Customer
{
    private String name;
    private String customerId;
    
    public String getName(){
        return this.name;
    }
    public String getCustomerId(){
        return this.customerId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
}
class ChennaiBranch implements IBank
{
    public String createAccount(Customer customer)
    {
        return "Acc54321";
    }
    public double issueVehicleLoan(String vehicleType,Customer customer)
    {
        if (vehicleType.equals("bike"))
        {
            return 10000;
        }else
        {
            return 50000;
        }
    }
    public double issueHouseLoan(Customer customer)
    {
        return 5000000;
    }
    public double issueGoldLoan(Customer customer)
    {
        return 2000000;
    }
    public boolean applyForCreditCard(Customer customer)
    {
        return true;
    }
}
public class Main1
{
	public static void main(String[] args) {
		IBank ib=new ChennaiBranch();
		Customer cu=new Customer();
		cu.setCustomerId("cu5845");
		cu.setName("Raju");
		String x=ib.createAccount(cu);
		double y=ib.issueVehicleLoan("bike",cu);
		double z=ib.issueGoldLoan(cu);
		double i=ib.issueHouseLoan(cu);
		System.out.println("Account number "+x);
		System.out.println("VehicleLoan "+y);
		System.out.println("GoldLoan "+z);
		System.out.println("HouseLoan "+i);
		System.out.println("Caution Money "+IBank.CautionMoney);
		
		BankNew ibb=new ChennaiBranch();
		boolean cc=ibb.applyForCreditCard(cu);
		System.out.println("Credit "+cc);
	}
}
