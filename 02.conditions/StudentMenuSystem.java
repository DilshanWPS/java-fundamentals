import java.util.Scanner;

class StudentMenuSystem{
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name=scanner.nextLine();

        System.out.print("Enter student address : ");
        String address=scanner.nextLine();

        System.out.print("Enter student result : ");
        int result=scanner.nextInt();

        System.out.println("A.Show student name");
        System.out.println("B.Show student address");
        System.out.println("C.Show student result");

        System.out.print("Enter your choice--->");
        String choice=scanner.next();

        switch(choice){
            case "A":
                System.out.println(name);
                break;
            case "B":
                System.out.println(address);
                break;
            case "C":
                if(result>=50){
                    System.out.println("Pass");
                }else{
                    System.out.println("Fail");
                }
                break;
            default:
                System.out.println("Invalid entry..");
        }
    }
}