package Dynamic;

public class ScopeOfVariables {
	  int i = 34;   // instance variable
	  static int z; // class variable
	  static {
	    z = 10;
	    System.out.println("inside static block: " + z);
	  }
	  void test() {
	    int k = 200;  // local variable
	    System.out.println("local variable: " + (k + i));
	  }
	  public static void main(String[] args) {
	    ScopeOfVariables obj = new ScopeOfVariables();
	    obj.test();
	    System.out.println(obj.i);
	  }
}
	      
/*
 * import java.util.Scanner;
class PlayerRating
{
    int playerPostion;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    float averageRating;
    char category;
    
    PlayerRating(int pp,String pn)
    {
        playerPostion = pp;
        playerName = pn;
    }
    public void calculateAverageRating(float criticOneRating,float criticTwoRating)
    {
        float x=criticOneRating;
        float y=criticTwoRating;
        
        averageRating=(x+y)/2;
    
    }
    public void calculateAverageRating(float criticOneRating,float criticTwoRating,float criticThreeRating)
    {
        float x=criticOneRating;
        float y=criticTwoRating;
        float z=criticThreeRating;
        
        averageRating=(x+y+z)/3;
        
    }
    public void calculateCategory()
    {
        if (averageRating>8)
        {
            category = 'A';
        }
        else if (averageRating>5 && averageRating<=8)
        {
            category = 'B';
        }
        else if (averageRating>0 && averageRating<=5)
        {
            category = 'C';
        }
    }
    public void display()
    {
        System.out.println("The player name is "+playerName);
        System.out.println("The player postion is "+playerPostion);
        System.out.println("The average rating is "+averageRating);
        System.out.println("The category is "+category);
    }
    
}
public class Main
{
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Player Postion ");
	int pp=sc.nextInt();
	sc.nextLine();
	System.out.println("Player Name ");
	String n=sc.nextLine();
	System.out.println("CriticOneRating ");
	int co=sc.nextInt();
	System.out.println("CriticTwoRating ");
	float ct=sc.nextFloat();
	
	PlayerRating pr =new PlayerRating(pp,n);
	pr.calculateAverageRating(co,ct);
	pr.calculateCategory();
	pr.display();
	System.out.println("                     ");
	System.out.println("*********************");
	
	System.out.println("Player Postion ");
	int pp1=sc.nextInt();
	sc.nextLine();
	System.out.println("Player Name ");
	String n1=sc.nextLine();
	System.out.println("CriticOneRating ");
	int co1=sc.nextInt();
	System.out.println("CriticTwoRating ");
	float ct1=sc.nextFloat();
	System.out.println("CriticThreeRating ");
	float cth1=sc.nextFloat();
	
	PlayerRating pr1 =new PlayerRating(pp1,n1);
	pr.calculateAverageRating(co1,ct1,cth1);
	pr.calculateCategory();
	pr.display();
	
	}
}

 * import java.util.Scanner;
class Employee
{
    int empId;
    String name;
    double salary;
    
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public int getEmpID(){
        return this.empId;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    
}
class PermanentEmployee extends Employee
{
    private double basicPay;
    private double hra;
    private int experiance;
    
    public double getBasicPay(){
        return this.basicPay;
    }
    public double getHra(){
        return this.hra;
    }
    public int getExperiance(){
        return this.experiance;
    }
    
    public void setBasicPay(double basicPay){
        this.basicPay = basicPay;
    }
    public void setHra(double hra){
        this.hra = hra;
    }
    public void setExperiance(int experiance){
        this.experiance = experiance;
    }
    
    public void calculateSalary()
    {
        double bp;
        if (experiance<3)
        {
            bp=basicPay;
        }
        else if (experiance>=3 && experiance<5)
        {
            bp=basicPay*5/100;
        }
        else if (experiance>=5 && experiance<10)
        {
            bp=basicPay*7/100;
        }
        else
        {
            bp=basicPay*12/100;
        }
        salary = basicPay+bp+hra;
        System.out.println("The salary for the Permanent Employee is "+salary);
    }
}
class ContractEmployee extends Employee
{
    private double wages;
    private int hours;
    
    public double getWages(){
        return this.wages;
    }
    public int getHours(){
        return this.hours;
    }
    public void setWages(double wages){
        this.wages = wages;
    }
    public void setHours(int hours){
        this.hours = hours;
    }
    public void calculateSalary()
    {
        salary = hours*wages;
        System.out.println("The salary for Contract Employee is "+salary);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		PermanentEmployee pe=new PermanentEmployee();
		ContractEmployee ce=new ContractEmployee();
		
		System.out.println("Name : ");
		pe.setName(sc.nextLine());
		System.out.println("Employee Id : ");
		pe.setEmpId(sc.nextInt());
		System.out.println("Basic Pay : ");
		pe.setBasicPay(sc.nextDouble());
		System.out.println("HRA : ");
		pe.setHra(sc.nextDouble());
		System.out.println("Experiance : ");
		pe.setExperiance(sc.nextInt());
		sc.nextLine();
		pe.calculateSalary();
		
		System.out.println("                        ");
		System.out.println("************************");
		System.out.println("                        ");
		
		System.out.println("Name : ");
		ce.setName(sc.nextLine());
		System.out.println("Employee Id : ");
		ce.setEmpId(sc.nextInt());
		System.out.println("wages : ");
		ce.setWages(sc.nextDouble());
		System.out.println("Hours : ");
		ce.setHours(sc.nextInt());
		ce.calculateSalary();
		
	}
}
class Loan
{
    int tenure;
    double principal;
    float interestRate;
    String accountNo;
    
    public double calculateEmi()
    {
        double SimpleInterest = (principal*interestRate*tenure)/100;
        double Emi=(SimpleInterest+principal)/tenure;
        return Emi;
    }
}
class HomeLoan extends Loan
{
    HomeLoan()
    {
        tenure = 5;
        principal = 20000;
        interestRate = 8.5f;
        accountNo = "Acc5846795";
    }
}
class StudyLoan extends Loan
{
    StudyLoan()
    {
        tenure = 3;
        principal = 1000000;
        interestRate = 11.2f;
        accountNo = "Acc538459";
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		HomeLoan HL =new HomeLoan();
		StudyLoan SL = new StudyLoan();
		double HomeLoan1 = HL.calculateEmi();
		double StudyLoan1 = SL.calculateEmi();
		
		System.out.println("Home Loan EMI is :"+HomeLoan1);
		System.out.println("Study Loan EMI is :"+StudyLoan1);
	}
}

 * 
 * import java.util.Scanner;
class Chocolate
{
    private int barCode=101;
    private String name="Cadbury";
    private int weight=12,cost=10;
    
    public int getBarCode(){
        return this.barCode;
    }
    public void setBarCode(int barCode){
        this.barCode = barCode;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getCost(){
        return this.cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    
    Chocolate(int bbarCode,String bname,int bweight,int bcost)
    {
        this.barCode = bbarCode;
        this.name = bname;
        this.weight = bweight;
        this.cost = bcost;
    }
    public Chocolate()
    {
        
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		Chocolate obj=new Chocolate();
		
		System.out.println("Barcode is :"+obj.getBarCode());
		System.out.println("Name is    :"+obj.getName());
		System.out.println("Weight is  :"+obj.getWeight());
		System.out.println("Cost is    :"+obj.getCost());
		
		
		System.out.println("Barcode :");
		int barCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Name    :");
		String name=sc.nextLine();
		System.out.println("Weigth  :");
		int weight=sc.nextInt();
		System.out.println("Cost    :");
		int cost=sc.nextInt();
		
		obj.setBarCode(barCode);
		obj.setName(name);
		obj.setWeight(weight);
		obj.setCost(cost);
		
		System.out.println("Barcode is :"+obj.getBarCode());
		System.out.println("Name is    :"+obj.getName());
		System.out.println("Weight is  :"+obj.getWeight());
		System.out.println("Cost is    :"+obj.getCost());
		
	}
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		double balanceAmount = 50000;
		System.out.println("Enter the withdraw amount:");
		double withdraw = sc.nextDouble();
		
		if (withdraw<0 || withdraw>balanceAmount)
		{
		    System.out.println("Withdraw Failed");
		}
		else
		{
		    balanceAmount-=withdraw;
		    System.out.println("withdraw Succeseeded");
		    System.out.println("Balance Amount "+balanceAmount);
		}
	}
}

class Rectangle
{
    private int length;
    private int breadth;
    
    public void setLength(int length){
        this.length = length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    
    public int getLength(){
        return this.length;
    }
    public int getBreadth(){
        return this.breadth;
    }
    
    public void calculatePerimeter()
    {
        int perimeter;
        perimeter=2*(this.length + this.breadth);
        System.out.println("The answer is "+perimeter);
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Rectangle obj =new Rectangle();
		obj.setLength(100);
		obj.setBreadth(100);
		obj.calculatePerimeter();
	}
}
class ScopeOfVariables
{
    int i=50;
    static int z;
    static
    {
        z=10;
        System.out.println("Inside "+z);
    }
    void test()
    {
        int k=200;
        System.out.println("Test local "+(k+i));
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ScopeOfVariables obj=new ScopeOfVariables();
		obj.test();
		System.out.println(obj.i);
	}
}

class Student
{
    private int studentId;
    private String name;
    private float qualifyingExamMarks;
    private char residentialStatus;
    private int yearOfEngg;
    
    public int getStudentId(){
        return this.studentId;
    }
    public String getName(){
        return this.name;
    }
    public float getQualifyingMarks(){
        return this.qualifyingExamMarks;
    }
    public char getResidentialStatus(){
        return this.residentialStatus;
    }
    public int getYearOfEngg(){
        return this.yearOfEngg;
    }
    
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setQualifyingExamMarks(float qualifyingExamMarks){
        this.qualifyingExamMarks = qualifyingExamMarks;
    }
    public void setResidentialStatus(char residentialStatus){
        this.residentialStatus = residentialStatus;
    }
    public void setYearOfEngg(int yearOfEngg){
        this.yearOfEngg = yearOfEngg;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc=new Scanner(System.in);
		Student sd=new Student();
		
		int studentId;
		String name;
		float qualifyingExamMarks;
		char residentialStatus;
		int yearOfEngg;
		String s;
		
		System.out.println("Enter Student ID");
		studentId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
		name=sc.nextLine();
		System.out.println("Enter Qualifying Exam Marks");
		qualifyingExamMarks=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Residential Status");
		residentialStatus=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter Year of Engg");
		yearOfEngg=sc.nextInt();
		sc.nextLine();
		
		sd.setStudentId(studentId);
		sd.setName(name);
		sd.setQualifyingExamMarks(qualifyingExamMarks);
		sd.setResidentialStatus(residentialStatus);
		sd.setYearOfEngg(yearOfEngg);
		
		if (sd.getResidentialStatus()=='H')
		{
		    s="Hostellers";
		}
		else
		{
		    s="Day Scholars";
		}
		
		System.out.println("Student Name       : "+sd.getName());
		System.out.println("Student ID         : "+sd.getStudentId());
		System.out.println("Qualifying  Marks  : "+sd.getQualifyingMarks());
		System.out.println("Year Of Engg       : "+sd.getYearOfEngg());
		System.out.println("Residential Status : "+s);
		
		
		
	}
}

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Account AC=new Account();
		
		AC.setBalance(50);
		AC.setBalance(1000);
		
		System.out.println("Account Balance ="+AC.getBalance());
		System.out.println("Account Name ="+ AC.getName(1));
	}
}

class Account
{
    private int balance;
    
    private String name="hello";
    
    public String getName(int Id){
        return this.name;
    }
    
    public int getBalance()
    {
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    
} */




