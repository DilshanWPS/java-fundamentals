import java.util.*;

class SalaryBreakdown{
	public static void main(String args[]){

		Scanner get_salary=new Scanner(System.in);
		System.out.println("finding number of notes of your salary");
		System.out.print("Enter your salary :");
		int salary=get_salary.nextInt();
		
		System.out.println("your salary has "+ (salary/5000)+" of 5000 notes");
		salary=salary%5000;
		
		System.out.println("your salary has "+ (salary/2000)+" of 2000 notes");
		salary=salary%2000;
		
		System.out.println("your salary has "+ (salary/1000)+" of 1000 notes");
		salary=salary%1000;
		
		System.out.println("your salary has "+ (salary/500)+" of 500 notes");
		salary=salary%500;
		
		System.out.println("your salary has "+ (salary/100)+" of 100 notes");
		salary=salary%100;
		
		System.out.println("your salary has "+ (salary/50)+" of 50 notes");
		salary=salary%50;

		System.out.println("your salary has "+ (salary/10)+" of 10 coins");
		salary=salary%10;

		System.out.println("your salary has "+ (salary/5)+" of 5 coins");
		salary=salary%5;
	}
}