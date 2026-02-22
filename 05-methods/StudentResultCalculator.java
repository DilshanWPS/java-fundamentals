import java.util.Scanner;

class StudentResultCalculator{
    public static void main(String args[]){

        System.out.println("Return type methods..");
        Scanner scanner=new Scanner(System.in);
        printLine();

        System.out.print("Enter your name : ");
        String name=scanner.next();
        printLine();

        System.out.print("Enter your physics marks : ");
        double marks1=scanner.nextDouble();
        printLine();

        System.out.print("Enter your chemistry marks : ");
        double marks2=scanner.nextDouble();
        printLine();

        System.out.print("Enter your biology marks : ");
        double marks3=scanner.nextDouble();
        printLine();

        double studentAvg=findAverage(marks1,marks2,marks3);

        System.out.println("Your average marks is "+studentAvg);
        printLine();

        System.out.println("Your exam result is "+result(studentAvg));
        printLine();
    }

    public static void printLine(){
        System.out.println();
    }

    public static double findAverage(double number1,double number2,double number3){
        double average=(number1+number2+number3)/3;
        return average;
    }

    public static String result(double averageMarks){
        if(averageMarks>=50){
            return "pass";
        }else{
            return "fail";
        }
    }
}