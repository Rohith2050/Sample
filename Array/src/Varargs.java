class Loan
{
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter;

    public int getLoanCounter(){
        return this.loanCounter;
    }
    Loan()
    {
        
    }
    public int getLoanNo(){
        return this.loanNo;
    }
    public int getAccountNo(){
        return this.accountNo;
    }
    public int getCustomerNo(){
        return this.customerNo;
    }
    public float getLoanAmount(){
        return this.loanAmount;
    }
    public int getLoanDuration(){
        return this.loanDuration;
    }
    public float getInterest(){
        return this.interest;
    }
    public void setLoanNo(int loanNo){
        this.loanNo = loanNo;
    }
    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }
    public void setCustomerNo(int customerNo){
        this.customerNo = customerNo;
    }
    public void setLoanAmount(float loanAmount){
        this.loanAmount=loanAmount ;
    }
    public void setLoanDuration(int loanDuration){
        this.loanDuration = loanDuration;
    }
    public void setInterest(float interest){
        this.interest = interest;
    }
    Loan(int accountNo,int customerNo,float loanAmount,int loanDuration,float interest)
    {
        this.accountNo=accountNo;
        this.customerNo=customerNo;
        this.loanAmount=loanAmount;
        this.loanDuration=loanDuration;
        this.interest=interest;
        loanCounter++;
    }
    public int reward(int...fixedAmount)
    {
        int x=fixedAmount[0];
        for(int i:fixedAmount)
        {
            if (i>x)
            {
                x=i;
            }
        }
        return x;
    }
}
public class Varargs
{
	public static void main(String[] args) {
	    Loan l=new Loan(50,100,2f,5,8.5f);
	    int a=l.getLoanCounter();
	    System.out.println(a);
	    int x=l.reward(10,20,30,40,50);
	    System.out.println(x);
	    
	}
}
