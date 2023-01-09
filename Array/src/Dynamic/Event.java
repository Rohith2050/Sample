package Dynamic;

import java.util.Scanner;
class EventRegistration
{
    private String name;
    String nameOfEvent;
    private double registrationFee;
    int baseFee;
    EventRegistration(String name,String nameOfEvent)
    {
        this.name = name;
        this.nameOfEvent =nameOfEvent;
    }
    public String getName(){
        return this.name;
    }
    public String getNameOfEvent(){
        return this.nameOfEvent;
    }
    public double getRegistrationFee(){
        return this.registrationFee;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNameOfEvent(String nameOfEvent){
        this.nameOfEvent = nameOfEvent;
    }
    public void setRegistrationFee(double registrationFee){
        this.registrationFee = registrationFee;
    }
    public void registerEvent(int noOfParticipant,int baseFee)
    {
        registrationFee = baseFee*noOfParticipant;
        System.out.println("Thank you "+name+" for your participation.Your registration Fee is "+registrationFee);
        System.out.println("You are participant no : "+noOfParticipant);
    }
}
class SingleEventRegistration extends EventRegistration
{
    private int participantNo;
    public int getParticipantNo(){
        return this.participantNo;
    }
    public void set(int participantNo){
        this.participantNo = participantNo;
    }
    SingleEventRegistration(String a,String b,int c)
    {
        super(a,b);
        this.participantNo = c;
    }
    public void registerEvent(int participantNo)
    {
        if (nameOfEvent.equals("ShakeALeg"))
        {
            baseFee=100;
        }else if (nameOfEvent.equals("Sing&Win"))
        {
            baseFee=150;
        }
        else if (nameOfEvent.equals("PlayAway"))
        {
            baseFee=130;
        }else
        {
            System.out.println("Please choose a valid Event");
        }
        System.out.println(baseFee);
        super.registerEvent(participantNo,baseFee);
    }
}
class TeamEventRegistration extends EventRegistration
{
    int noOfParticipant;
    int teamNo;
    
    public int getNoOfParticipant(){
        return this.noOfParticipant;
    }
    public int getTeamNo(){
        return this.teamNo;
    }
    public void setNoOfParticipant(int noOfParticipant){
        this.noOfParticipant = noOfParticipant;
    }
    public void setTeamNo(int teamNo){
        this.teamNo = teamNo;
    }
    TeamEventRegistration(String a,String b,int c,int d)
    {
        super(a,b);
        this.teamNo=d;
        this.noOfParticipant =c;
    }
    public void registerEvent(int noOfParticipant)
    {
        if (nameOfEvent.equals("ShakeALeg"))
        {
            baseFee=50;
        }else if (nameOfEvent.equals("Sing&Win"))
        {
            baseFee=60;
        }
        else if (nameOfEvent.equals("PlayAway"))
        {
            baseFee=100;
        }else if (nameOfEvent.equals("Actathon"))
        {
            baseFee=80;
        }
        else
        {
            System.out.println("Please choose a valid Event");
        }
        super.registerEvent(noOfParticipant,baseFee);
    }
}
public class Event
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("name ");
		String n=sc.nextLine();
		System.out.println("nameOfEvent ");
		String noe=sc.nextLine();
		System.out.println("participantNo ");
		int pn=sc.nextInt();
		sc.nextLine();
		
		SingleEventRegistration se=new SingleEventRegistration(n,noe,pn);
		se.registerEvent(pn);
		
		System.out.println("name ");
		String n1=sc.nextLine();
		System.out.println("nameOfEvent ");
		String noe1=sc.nextLine();
		System.out.println("teamNo ");
		int t1=sc.nextInt();
		System.out.println("No of participant");
		int pn1=sc.nextInt();
		
		TeamEventRegistration te =new TeamEventRegistration(n1,noe1,t1,pn1);
		te.registerEvent(pn1);
		
	}
	
}
