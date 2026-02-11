import java.util.*;

class GradeCalculator{
	public static void main(String args[]){
		Scanner get_marks=new Scanner(System.in);
		
		System.out.print("Enter your marks:");
		int marks=get_marks.nextInt();
		
		if(marks>=75){
			System.out.println("A");
		}else if(marks>65){
			System.out.println("B");
		}else if(marks>55){
			System.out.println("C");
		}else if(marks>35){
			System.out.println("S");
		}else{
			System.out.println("F");
		}
		
	}
}