import java.util.Scanner;

class MenuDrivenCalculator{
    public static void main(String args[]){
        System.out.println("Simple calculator by using methods");
        printLine();
        System.out.print("Enter number 1 : ");
        Scanner scanner=new Scanner(System.in);
        double number1=scanner.nextInt();
        printLine();
        System.out.print("Enter number 2 : ");
        double number2=scanner.nextInt();
        boolean flag=true;

        while(flag){
            printLine();
            System.out.println("Lets calculate following values,what do you want?");
            printLine();
            System.out.println("A.Addition");
            System.out.println("B.Subtraction");
            System.out.println("C.Division");
            System.out.println("D.Multiply");
            System.out.println("E.Exit");
            printLine();
            System.out.print("Enter your letter : ");
            String letter=scanner.next();

            switch(letter){
                case "A":
                    addition(number1,number2);
                    break;
                case "B":
                    substract(number1,number2);
                    break;
                case "C":
                    divide(number1,number2);
                    break;
                case "D":
                    multiply(number1,number2);
                    break;
                case "E":
                    printLine();
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid Entry..");
            }
        }  
    }

    public static void addition(double input1,double input2){
        int total=input1+input2;
        printLine();
        System.out.println("Addition of two numbers is "+total);
    }

    public static void substract(double input1,double input2){
        if(input1>input2){
            int subtract=input1-input2;
            printLine();
            System.out.println("Subtraction of two numbers is "+subtract);
        }else{
            int subtract=input2-input1;
            printLine();
            System.out.println("Subtraction of two numbers is "+subtract);
        }
    }

    public static void multiply(double input1,double input2){
        int multiplication=input1*input2;
        printLine();
        System.out.println("Multiplication of two numbers is "+multiplication);
    }

    public static void divide(double input1,double input2){
        int division=input1/input2;
        printLine();
        System.out.println("Division of two numbers is "+division);
    }

    public static void printLine(){
        System.out.println();
    }
}