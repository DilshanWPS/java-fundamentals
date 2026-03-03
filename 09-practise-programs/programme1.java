import java.util.Scanner;

class programme1{
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);

        printLine();
        System.out.println("---welcome to day 1 java programme---");
        printLine();

        System.out.print("Enter your school name : ");
        String schoolName=scanner.nextLine();
        printLine();

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
                String role="principal";
                String roleName=getFullName();
                System.out.println("-------------------- "+ role + " dasboard --------------------");
                printLine();
                System.out.println("welcome "+ roleName +" for the student management system of "+schoolName);
                printLine();

                break;
            case "2":
                break;
            case "3":
                break;
            default:
            
        }  

    }

    public static void printLine(){
        System.out.println();
    }

    public static String[] getName(){
        Scanner scanner1=new Scanner(System.in);
        String[] names=new String[3];

        boolean flag=true;

        while(flag){

            System.out.println("select your suraname");
            System.out.println("1.Mr");
            System.out.println("2.Mrs");
            System.out.println("3.Ms");
            printLine();
            System.out.print("Enter your number : ");
            String surname=scanner1.next();
            
            switch(surname){
                case "1":
                    names[0]="Mr";
                    flag=false;
                    break;
                case "2":
                    names[0]="Mrs";
                    flag=false;
                    break;
                case "3":
                    names[0]="Ms";
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid entry.please try again");
                    printLine();
            }
        }
        
        printLine();

        System.out.print("Enter your first name : ");
        names[1]=scanner1.next();
        printLine();

        System.out.print("Enter your last name : ");
        names[2]=scanner1.next();
        printLine();

        return names;
    }

    public static String getFullName(){
        String[] fullNameArray=getName();
        String fullName="";

        for(int i=0;i<3;i++){
            fullName=fullName + " " + fullNameArray[i];
        }

        return fullName;

    }

}

