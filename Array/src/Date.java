import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;

class AgeFinder{
	public int getAge(LocalDate dateOfBirth) {
		//Implementation required
		LocalDate x=LocalDate.now();
		LocalDate a=dateOfBirth;
		int i=x.getYear()-a.getYear();
		return i;
	}
	public LocalDate getDateAfterNDays(int noOfDays) {
		//Implementation required
		LocalDate date = LocalDate.now();  
		LocalDate LD=date.plusDays(noOfDays);
		return LD;
	}
	public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
		//Implementation required
		LocalDate dt = LocalDate.now();
		LocalDate x=dt.plusYears(year);
		//int i=x.getYear();
		LocalDate y=x.plusMonths(month);
		//int j=y.getDayOfMonth();
		LocalDate z=y.plusDays(day);
		//nt k=10;
		return z;
		
	}
}

public class Date
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    AgeFinder ag=new AgeFinder();
		System.out.print("Enter the DOB: ");
        String dobString = sc.nextLine();
        LocalDate dobLocal = LocalDate.parse(dobString);
        int x=ag.getAge(dobLocal);
        
        
        //Date dob = Date.from(dobLocal.atStartOfDay(defaultZoneId).toInstant());
        System.out.println("Your age is: "+x+" years");
        
        
        System.out.println("No of Days ");
        int dd=sc.nextInt();
        System.out.println(ag.getDateAfterNDays(dd));
        
        System.out.println("year");
        int yearInput=sc.nextInt();
        System.out.println("month");
        int monthInput=sc.nextInt();
        System.out.println("day");
        int dayInput=sc.nextInt();
		
        System.out.println("The answer is "+ag.getDateAfterXYearYMonthZDays(yearInput,monthInput,dayInput));
	}
}
