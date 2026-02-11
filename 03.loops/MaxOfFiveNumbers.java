import java.util.Scanner; //bp-import only needed things,dont import all the things

class MaxOfFiveNumbers{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in); //creating scanner object that is called as "scanner"

        int count=5;

        System.out.print("Enter number 1 :");
        int maxNumber=scanner.nextInt();

        for(int i=2;i<=count;i++){
            System.out.print("Enter number "+i+" :");
            int number=scanner.nextInt();
            if(number>maxNumber){
                maxNumber=number;
            }
        }

        System.out.println("Maximum number is "+maxNumber);
    }
}