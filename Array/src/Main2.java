class Custom
{
    public int custId;
    public String custName;
    
    public Custom(int custId,String custName)
    {
        this.custId=custId;
        this.custName=custName;
    }
    public int hashCode()
    {
        return custId;
    }
    public boolean equals(Object ob)
    {
        Custom cust=(Custom)ob;
        if (this.hashCode()==cust.hashCode())
        {
            return this.custName.equals(cust.custName);
        }
        return false;
    }
}
public class Main2
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Custom c1=new Custom(11,"Raj");
		Custom c2=new Custom(11,"Raj");
		if(c1.equals(c2))
		{
		    System.out.println("Equal");
		}
		else{
		    System.out.println("Not Equal");
		}
	}
}
