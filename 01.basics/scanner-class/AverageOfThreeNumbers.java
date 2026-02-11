import java.util.*;

class AverageOfThreeNumbers{
	public static void main(String args[]){
		Scanner get_number=new Scanner(System.in);
		System.out.println("welcome to java programme 4-finding average of three numbers");
		System.out.print("Enter your number 1: ");
		int number1=get_number.nextInt();
		System.out.print("Enter your number 2: ");
		int number2=get_number.nextInt();
		System.out.print("Enter your number 3: ");
		int number3=get_number.nextInt();
		int total=number1+number2+number3;
		int average=total/3;
		System.out.print("Average of your numbers is "+average);
	}
}