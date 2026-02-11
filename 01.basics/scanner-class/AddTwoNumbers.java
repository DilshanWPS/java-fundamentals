import java.util.*;

class AddTwoNumbers{
	public static void main(String args[]){
		Scanner get_number=new Scanner(System.in);
		System.out.println("welcome to java programme 3-adding two numbers");
		System.out.print("Enter your number 1: ");
		int number1=get_number.nextInt();
		System.out.print("Enter your number 2: ");
		int number2=get_number.nextInt();
		int total=number1+number2;
		System.out.print("Total of your numbers is "+total);
	}
	
	
}