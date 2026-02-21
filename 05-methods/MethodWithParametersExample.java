import java.util.Scanner;

class MethodWithParametersExample{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers..");
        System.out.print("Enter number 1 :");
        int number1=scanner.nextInt();
        System.out.print("Enter number 2 :");
        int number2=scanner.nextInt();

        getSum(number1,number2);
    }

    public static void getSum(int input1,int input2){
        int total=input1+input2;
        System.out.println("Sum of your numbers is "+total);
    }
}