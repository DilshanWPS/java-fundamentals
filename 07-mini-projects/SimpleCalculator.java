import java.util.Scanner;

class SimpleCalculator{
    public static void main(String args[]){
        System.out.println("-------Welcome to the simple calculator-------");
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter number 1 : ");
        double number1=scanner.nextDouble();
        System.out.print("Enter number 2 : ");
        double number2=scanner.nextDouble();

        double maximum=0;
        double minimum=0;
        double substraction=0;
        double division=0;

        double addition=number1+number2;

        double average=addition/2;

        if(number1>number2){
            substraction=number1-number2;
            maximum=number1;
            minimum=number2;
        }else if(number2>number1){
            substraction=number2-number1;
            maximum=number2;
            minimum=number1;
        }else{
            System.out.println("Both numbers are same...");
        }

        if(number1==0){
            division=number1/number2;
        }else if(number2==0){
            division=number2/number1;
        }else if(number1==0 && number2==0){
            System.out.println("Zero issue....Cant perform division");
        }

        double multiply=number1*number2;

        boolean flag=true;

        while(flag){
            System.out.println();
            System.out.println("Please choose the calculation");
            System.out.println("1.Add numbers");
            System.out.println("2.Substract numbers");
            System.out.println("3.Multiply numbers");
            System.out.println("4.Divide numbers");
            System.out.println("5.Find maximum");
            System.out.println("6.Find minimum");
            System.out.println("7.Average numbers");
            System.out.println("8.Exit");
            System.out.println();
            System.out.print("Enter a number : ");
            String selection=scanner.next();

            switch(selection){
                case "1":
                    System.out.println("Sum of two numbers is "+addition);
                    break;
                case "2":
                    System.out.println("Substraction of two numbers is "+substraction);
                    break;
                case "3":
                    System.out.println("Multiplication of two numbers is "+multiply);
                    break;
                case "4":
                    System.out.println("Division of two numbers is "+division);
                    break;
                case "5":
                    System.out.println("Maximum of two numbers is "+maximum);
                    break;
                case "6":
                    System.out.println("Minimum of two numbers is "+minimum);
                    break;
                case "7":
                    System.out.println("Average of two numbers is "+average);
                    break;
                case "8":
                    System.out.println("Thank you..");
                    flag=false;
            }
        }   
    }
}