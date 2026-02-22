import java.util.Scanner;

class MethodOverloadingExample{
    public static void main(String args[]){

        myMethod();
        System.out.println("---Method overloading java programe---");
        myMethod();

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name=scanner.next();
        myMethod();

        System.out.print("Enter your age(years) : ");
        int age=scanner.nextInt();
        myMethod();

        System.out.println("Enter two numbers for addition");
        System.out.print("Enter number 1 : ");
        double number1=scanner.nextDouble();
        System.out.print("Enter number 2 : ");
        double number2=scanner.nextDouble();
        myMethod();

        myMethod(name);
        myMethod();

        myMethod(age);
        myMethod();

        double addition=myMethod(number1,number2);
        System.out.println("Addition of two numbers is "+addition);
        myMethod();
    }

    public static void myMethod(){
        System.out.println();
    }

    public static void myMethod(String input1){
        System.out.println("Your name is "+input1);
    }

    public static void myMethod(int input2){
        System.out.println("Your age is "+input2);
    }

    public static double myMethod(double input3,double input4){
        double total=input3+input4;
        return total;
    }
}