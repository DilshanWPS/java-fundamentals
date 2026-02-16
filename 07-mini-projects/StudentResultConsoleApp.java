import java.util.Scanner;

class StudentResultConsoleApp{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
    
        while(true){

            System.out.println("Do you want to add new student(Y/N)?");
            System.out.print("-->");
            String answer=scanner.next();

            switch(answer){
                case "Y":
                    System.out.print("Enter student name : ");
                    String name=scanner.next();
                    System.out.print("Enter student address : ");
                    String address=scanner.next();
                    System.out.print("Enter number of subjects : ");
                    int numberOfSubjects=scanner.nextInt();
                    int maxMarks=0;
                    int sumMarks=0;
                    for(int i=1;i<=numberOfSubjects;i++){
                        System.out.print("Enter subject "+ i + " marks : ");
                        int marks=scanner.nextInt();

                        if(marks>maxMarks){
                            maxMarks=marks;
                        }
                        sumMarks=sumMarks+marks;
                    }
                    float averageMarks=(float)sumMarks/numberOfSubjects;
              

                    while(true){
                        System.out.println();
                        System.out.println("Select your choise");
                        System.out.println("A.Show student details");
                        System.out.println("B.Show maximum marks");
                        System.out.println("C.Show average marks");
                        System.out.println("D.Show student result");
                        System.out.println("X.Exit");
                        System.out.println();
                        System.out.print("Select your choise : ");
                        String choise=scanner.next();

                        switch(choise){
                            case "A":
                                System.out.println("Student name is "+name);
                                System.out.println("Student address is "+address);
                                break;
                            case "B":
                                System.out.println("Maximum mark is "+maxMarks);
                                break;
                            case "C":
                                System.out.println("Average mark is "+averageMarks);
                                break;
                            case "D":
                                if(averageMarks>=50){
                                    System.out.println("Pass");
                                }else{
                                    System.out.println("Fail");
                                }
                                break;
                            case "X":
                               return;
                            default:
                                System.out.println("Invalid enter..");
                        } 
                    }
                case "N":
                    return;
                default:
                    System.out.println("Invalid letter....");
            } 
        }
    }
}