import java.util.Scanner;

class StudentMarksManager{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter student name : ");
        String name=scanner.next();

        System.out.print("Enter student address : ");
        String address=scanner.next();

        System.out.print("Enter number of subjects : ");
        int numberOfSubjects=scanner.nextInt();

        int[] subjectMarks=new int[numberOfSubjects];

        int total=0;
        int maximum=0;

        for(int i=1;i<=numberOfSubjects;i++){
            System.out.print("Enter subject " +i+" marks : ");
            int marks=scanner.nextInt();
            total=total+marks;
            if(maximum<marks){
                maximum=marks;
            }
            subjectMarks[i-1]=marks;
        }
        
        System.out.println();
        boolean flag=true;
        while(flag){
            System.out.println("Choose your requirement.");
            System.out.println();
            System.out.println("A.Show student details.");
            System.out.println("B.Show all marks.");
            System.out.println("C.Show maximum marks.");
            System.out.println("D.Show total marks.");
            System.out.println("E.Exit..");
            System.out.println();

            System.out.print("Enter your letter : ");
            String letter=scanner.next();

            switch(letter){
                case "A":
                    System.out.println("Student name is "+ name );
                    System.out.println("Student address is "+ address);
                    System.out.println();
                    break;
                case "B":
                    System.out.println("Student marks are..");
                    for(int i=0;i<subjectMarks.length;i++){
                       System.out.println("Subject "+(i+1)+" mark is "+subjectMarks[i]);
                    }
                    System.out.println();
                    break;
                case "C":
                    System.out.println("Maximum mark is "+ maximum );
                    System.out.println();
                    break;
                case "D":
                    System.out.println("Total mark is "+ total );
                    System.out.println();
                    break;
                case "E":
                    System.out.println("Thank you....");
                    System.exit(0);
                default:
                    System.out.println("Invalid entry...");

            }
        }
    }
}