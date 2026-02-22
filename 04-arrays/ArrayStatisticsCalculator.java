import java.util.Scanner;

class ArrayStatisticsCalculator{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        double[] numbers=new double[3];
        printLine();

        for(int i=1;i<=3;i++){
            System.out.print("Enter number "+i+" :");
            numbers[i-1]=scanner.nextDouble();
        }
        
        boolean flag=true;

        while(flag){

            printLine();
            System.out.println("A.Show total");
            System.out.println("B.Show maximum number");
            System.out.println("C.Show average");
            System.out.println("X.Exit");
            printLine();

            System.out.print("Enter you choise : ");
            String letter=scanner.next();
            printLine();

            switch(letter){

                case "A":
                    System.out.println("Total of your numbers is "+total(numbers));
                    printLine();
                    break;

                case "B":
                    System.out.println("Maximum of your numbers is "+max(numbers));
                    printLine();
                    break;

                case "C":
                    System.out.println("Average of your numbers is "+average(numbers));
                    printLine();
                    break;

                case "X":
                    flag=false;
                    break;
                
                default:
                    System.out.println("Invalid entry.");
            }
        }
    }

    //calculate sum of array
    public static double total(double[] inputs){
        double sum=0;

        for(int i=0;i<inputs.length;i++){
            sum=sum+inputs[i];
        }
        return sum;
    }

    //calculate maximum of array
    public static double max(double[] inputs){
        double max=inputs[0];

        for(int i=1;i<inputs.length;i++){
            if(inputs[i]>max){
                max=inputs[i];
            }
        }
        return max;
    }

    //calculate average of array
    public static double average(double[] inputs){
        double total=0;

        for(int i=0;i<inputs.length;i++){
            total=total+inputs[i];
        }

        double average=total/inputs.length;
        return average;
    }

    //print a line
    public static void printLine(){
        System.out.println();
    }
}