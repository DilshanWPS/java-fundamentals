import java.util.Scanner;
import java.sql.Connection;

class Programme1{
    public static void main(String args[]){

        Connection conn = DatabaseConnection.getConnection();
        if(conn != null) {
            System.out.println("You can now interact with MySQL!");
        }

        Scanner scanner=new Scanner(System.in);

        printLine();
        System.out.println("---welcome to day 1 java programme---");
        printLine();

        System.out.print("Enter your school name : ");
        String schoolName=scanner.nextLine();
        printLine();

        boolean flag1=true;
        String role="";
        String roleName="";

        while(flag1){
            System.out.println("Select your role..");
            System.out.println("1.Principal");
            System.out.println("2.Teacher");
            System.out.println("3.Student");
            printLine();

            System.out.print("Enter your role number : ");
            String roleNumber=scanner.next();
            printLine();

            switch(roleNumber){
                case "1":
                    role="principal";
                    roleName=getFullName(scanner);
                    flag1=false;
                    break;

                case "2":
                    role="teacher";
                    roleName=getFullName(scanner);
                    flag1=false;
                    break;

                case "3":
                    role="student";
                    roleName=getFullName(scanner);
                    flag1=false;
                    break;

                default:
                    System.out.println("Invalid number,please try again..");
                
            }  
        }

        System.out.println("-------------------- "+ role + " dashboard --------------------");
        printLine();
        System.out.println("welcome "+ roleName +" for the student management system of "+schoolName);
        printLine();

        String[] nameParts = roleName.trim().split(" ");
        String title = nameParts[0];
        String firstName = nameParts[1];
        String lastName = nameParts[2];

        UserService.saveUser(role, title, firstName, lastName);

        actions(scanner,role);
        
    }

    //method 1
    public static void printLine(){
        System.out.println();
    }

    //method 2
    public static String[] getName(Scanner scanner){
        String[] names=new String[3];

        boolean flag2=true;

        while(flag2){

            System.out.println("select your title");
            System.out.println("1.Mr");
            System.out.println("2.Mrs");
            System.out.println("3.Ms");
            printLine();
            System.out.print("Enter your number : ");
            String surname=scanner.next();
            
            switch(surname){
                case "1":
                    names[0]="Mr";
                    flag2=false;
                    break;
                case "2":
                    names[0]="Mrs";
                    flag2=false;
                    break;
                case "3":
                    names[0]="Ms";
                    flag2=false;
                    break;
                default:
                    System.out.println("Invalid entry.please try again");
                    printLine();
            }
        }
        
        printLine();

        System.out.print("Enter your first name : ");
        names[1]=scanner.next();
        printLine();

        System.out.print("Enter your last name : ");
        names[2]=scanner.next();
        printLine();

        return names;
    }

    //method 3
    public static String getFullName(Scanner scanner){
        String[] fullNameArray=getName(scanner);
        String fullName="";

        for(int i=0;i<3;i++){
            fullName=fullName + " " + fullNameArray[i];
        }

        return fullName;
    }

    //method 4
    public static void actions(Scanner scanner,String role){
        switch(role){

            case "principal":
                printLine();
                System.out.println("you can perform following tasks");
                System.out.println("1.add students");
                System.out.println("2.view students");
                System.out.println("3.get total students");
                printLine();
                System.out.print("enter your task : ");
                int selection1=scanner.nextInt();
                printLine();
                break;

            case "teacher":
                printLine();
                System.out.println("you can perform following tasks");
                System.out.println("1.add subjects");
                System.out.println("2.add student marks");
                System.out.println("3.assign students level");
                System.out.println("4.calculate student places");
                printLine();
                System.out.print("enter your task : ");
                int selection2=scanner.nextInt();
                printLine();
                break;
            
            case "student":
                printLine();
                System.out.println("you can perform following tasks");
                System.out.println("1.view");
                System.out.println("2.view your level");
                System.out.println("3.view your place");
                printLine();
                System.out.print("enter your task : ");
                int selection3=scanner.nextInt();
                printLine();
                break;

            
        }


        
    }

}

