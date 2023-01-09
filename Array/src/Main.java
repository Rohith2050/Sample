
import java.util.Scanner;
abstract class RRPayementservices
{
    double balance;
    public int customerId;
    int Insufficient=1;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getCustomerID(){
        return this.customerId;
    }
    
    RRPayementservices(double balance,int customerId)
    {
        this.balance=balance;
        this.customerId=customerId;
    }
    public abstract void payBill(double amount);
    
}
class ShoppingPayment extends RRPayementservices
{
    int counter;
    String paymentId;
    ShoppingPayment(double balance,int customerId)
    {
        super(balance,customerId);
    }
    public String getPaymentId(){
        return this.paymentId;
    }
    public void payBill(double amount)
    {
    	paymentId="S5001";
        if (amount>balance)
        {
            System.out.println("Excess amount entered!!Please try again");
        }
        else{
        double rem = balance-amount;
        System.out.println("Congratulations !! You have successfully made a payment of Rs."+amount+". Payment Details are -");
        System.out.println("***********************************************************************************************");
        System.out.println("Customer ID              :"+getCustomerID());
        System.out.println("Payment ID               :"+getPaymentId());
        System.out.println("Previous Due             :Rs."+getBalance());
        System.out.println("Remaining Due            :Rs."+rem);
        }
    }
}
class CreditCardPayment extends RRPayementservices
{
    int counter;
    String paymentId;
    double cashBack;
    double balanceDue;
    CreditCardPayment(double balance,int customerId)
    {
        super(balance,customerId);
    }
    public String getPaymentId(){
        return this.paymentId;
    }
    public double getCashBack(){
        return this.cashBack;
    }
    public double getBalanceDue(){
        return this.balanceDue;
    }
    public void payBill(double amount)
    {
        paymentId="C1001";
        if (balance<amount)
        {
            cashBack = (amount-balance);
        }
        else if (amount==0) 
        {
            balanceDue=balance;
        }
        else
        {
            Insufficient=0;
        }
        
        if(Insufficient!=0)
        {
            System.out.println("Congratulations !! You have successfully made a payment of Rs."+amount+". Payment Details are -");
            System.out.println("***********************************************************************************************");
            System.out.println("Customer ID              :"+getCustomerID());
            System.out.println("Payment ID               :"+getPaymentId());
            System.out.println("Previous Due             :Rs."+getBalance());
            System.out.println("Remaining Due            :Rs."+getBalanceDue());
            System.out.println("CashBack vallet Balance  :Rs."+getCashBack());
        }
        else
        {
            System.out.println("Insufficient amount entered!!Please try again");
        }
        
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Balance ");
		double b=sc.nextDouble();
		System.out.println("Customer ID");
		int ci=sc.nextInt();
		System.out.println("Paid amount");
		double pa=sc.nextDouble();
		
		CreditCardPayment ccp=new CreditCardPayment(b,ci);
		ccp.payBill(pa);
		
		System.out.println("Balance ");
		double b1=sc.nextDouble();
		System.out.println("Customer ID");
		int ci1=sc.nextInt();
		System.out.println("Paid amount");
		double pa1=sc.nextDouble();
		ShoppingPayment sp=new ShoppingPayment(b1,ci1);
		sp.payBill(pa1);
	}
}
