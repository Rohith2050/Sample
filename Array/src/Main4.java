public class Main4
{
		
	public static void main(String[] args) {
    int number=45687;
    String x="96459";
    String y="00000";
    int copy=number,reverse=0;
    while(number>0){
      reverse=(reverse*10)+number%10;
      number/=10;
    }
    System.out.println(reverse);
	}
	class StringBuilderDemo{

		public static void main(String[] args){

			String firstName="Sachin";
			String lastName="Tendulkar";
			String fullName=firstName+lastName;
			//'+'operator concatenates the string but creates a new object in the heap memory as sting is immutable
			System.out.println(fullName);
			StringBuilder sb=new StringBuilder(firstName);
			String fName=sb.append(lastName).toString();//toString method converts StringBuilder to String
			//StringBuilder is mutable, it appends to a single object
			System.out.println(fName);

		}
	}
}
