import java.util.*;

class FullNameInput{
	public static void main(String args[]){
		Scanner get_name=new Scanner(System.in);
		System.out.println("welcome to java programme 5");
		System.out.print("Enter your first name: ");
		String first_name=get_name.next();
		System.out.print("Enter your last name: ");
		String last_name=get_name.next();
		
		System.out.print("your full name is "+first_name+" "+last_name);
	}
}