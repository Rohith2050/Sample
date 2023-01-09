class StudentRegistration
{
    private String studentName;
    private double age;
    private int admissionNumber;
    private int rollNumber;
    private int counter=1001;
    
    StudentRegistration(String studentName,double age,int admissionNumber)
    {
        this.studentName=studentName;
        this.age=age;
        this.admissionNumber=admissionNumber;
    }
    public String getStudentName(){
        return this.studentName;
    }
    public double getAge(){
        return this.age;
    }
    public int getAdmissionNumber(){
        return this.admissionNumber;
    }
    public int getRollNumber(){
        return this.rollNumber;
    }
    public void generateRollNumber()
    {
        rollNumber=counter;
        System.out.println("Roll Number      :"+rollNumber);
        counter++;
    }
    public int hashCode()
    {
        return admissionNumber;
    }
    public boolean equals(Object obj)
    {
        StudentRegistration sr=(StudentRegistration)obj;
        if (this.hashCode()==sr.hashCode())
        {
            return this.studentName.equals(sr.studentName);
        }
        return false;
    }
}
public class Main3
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		StudentRegistration s=new StudentRegistration("Peter",23,5001);
		StudentRegistration s1=new StudentRegistration("Peter",24,5003);
		
		if(s.equals(s1))
		{
		    System.out.println("Already generated");
		}else{
		    System.out.println("Student Name     :"+s1.getStudentName());
		    System.out.println("Admission Number :"+s1.getAdmissionNumber());
		    s.generateRollNumber();
		}
	}
}
