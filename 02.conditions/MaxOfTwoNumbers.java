import java.util.*;

class MaxOfTwoNumbers{
	
	public static void main(String args[]){
		System.out.println("welcome to java programe 8-finding the maximum number");
		Scanner get_numbers=new Scanner(System.in);
		
		System.out.print("Enter your number 1: ");
		int number_1=get_numbers.nextInt();
		
		System.out.print("Enter your number 2: ");
		int number_2=get_numbers.nextInt();
		
		if(number_1>number_2){
			System.out.println("maximum number is "+number_1);
		}
		else if(number_2>number_1){
			System.out.println("maximum number is "+number_2);
		}else{
			System.out.println("you have entered the same number");
		}
	}
}
