import java.util.*;

interface RoomBillComponent
{
    double TAX=0.12d;
    double EXTRA_PERSON_CHARGE=500.00d;
    double FOOD_CHARGE=800.00d;
    public float calculateBill();
}

class RoomDetails implements RoomBillComponent
{
    int billId;
    String customerName;
    String typeOfRoom;
    int noOfExtraPersons;
    int noOfDaysOfStay;
    static int counter=1;
    double baseRoomFare;
    
    RoomDetails(String customerName,String typeOfRoom,int noOfExtraPersons,int noOfDaysOfStay)
    {
        this.customerName=customerName;
        this.typeOfRoom=typeOfRoom;
        this.noOfExtraPersons=noOfExtraPersons;
        this.noOfDaysOfStay=noOfDaysOfStay;
    }
    public int getBillId(){
        billId=100;
        billId=billId+counter;
        return this.billId;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getTypeOfRoom(){
        return this.typeOfRoom;
    }
    public int getNoOfExtraPersons(){
        return this.noOfExtraPersons;
    }
    public int getNoOfDaysOfStay(){
        return this.noOfDaysOfStay;
    }
    
    public boolean validateNoOfDaysOfStay()
    {
        if (noOfDaysOfStay<=15 && noOfDaysOfStay>=0)
        {
            return true;
        }else{
            return false;
        }
    }
    public boolean validateNoOfExtraPerson()
    {
        if (noOfExtraPersons<=2 & noOfExtraPersons>=0)
        {
            return true;
        }else{
            return false;
        }
    }
    public boolean validateTypeOfRoom()
    {
        if(typeOfRoom.equals("Standard"))
        {
            this.baseRoomFare =2500;
            return true;
        }else if(typeOfRoom.equals("Deluxe"))
        {
            this.baseRoomFare =3500;
            return true;
        }else if(typeOfRoom.equals("Cottage"))
        {
            this.baseRoomFare=5500;
            return true;
        }else{
            return false;
        }
    }
    public float calculateBill()
    {
        if (validateTypeOfRoom() || validateNoOfDaysOfStay() || validateNoOfExtraPerson())
        {
            float bill,totalBill;
            bill = (float) ((noOfDaysOfStay*baseRoomFare)+noOfDaysOfStay*(FOOD_CHARGE)+(EXTRA_PERSON_CHARGE*noOfExtraPersons));
            totalBill = (float) (bill+TAX*bill);
            return totalBill;
        }else
        {
            System.out.println("Error");
        }
		return billId;
    }
}

public class HomeStayBooking
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Customer Name :");
		String customerName=sc.nextLine();
		System.out.print("Type Of Room :");
		String typeOfRoom=sc.nextLine();
		System.out.print("Extra Persons :");
		int extraPersons=sc.nextInt();
		System.out.print("Number of Days of Stay :");
		int noOfDays=sc.nextInt();

		RoomDetails rd=new RoomDetails(customerName,typeOfRoom,extraPersons,noOfDays);
		
		System.out.println("BillId:"+rd.getBillId());
		System.out.println("customer Name:"+rd.getCustomerName());
		System.out.println("No Of Days Of Stay:"+rd.getNoOfDaysOfStay());
		System.out.println("Total Bill:"+rd.calculateBill());
	}
}
