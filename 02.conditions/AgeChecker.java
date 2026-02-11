import java.util.*;

class AgeChecker{
	
	public static void main(String args[]){
		Scanner get_age=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=get_age.nextInt();
		
		if(age>=18){
			System.out.println("you can watch the movie");
		}else{
			System.out.println("you cannot watch the movie");
		}
	}
}