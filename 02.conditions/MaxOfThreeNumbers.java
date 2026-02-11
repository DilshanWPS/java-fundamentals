import java.util.*;

class MaxOfThreeNumbers{
	public static void main(String args[]){
		System.out.println("welcome to java programme 10");
		Scanner get_number=new Scanner(System.in);//creating a scanner object to use the scanner class
		
		//get 3 integer numbers from users
		System.out.print("Enter your number 1:");
		int number_1=get_number.nextInt();
		
		System.out.print("Enter your number 2:");
		int number_2=get_number.nextInt();
		
		System.out.print("Enter your number 3:");
		int number_3=get_number.nextInt();
		
		if(number_1>number_2){
			if(number_1>number_3){
				System.out.println("max number is "+number_1);
			}
		}else if(number_2>number_3){
			System.out.println("max number is "+number_2);
		}else{
			System.out.println("max number is "+number_3);
		}
	}
}