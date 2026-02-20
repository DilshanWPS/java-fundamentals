import java.util.Scanner;

class ThreeDStudentMarksSystem{ 
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);

        System.out.println();
        System.out.println("---Welcome to student marks storing system---");
        System.out.println();

        System.out.print("1.Enter number of days-->");
        int days=scanner.nextInt();
        System.out.println();

        System.out.print("2.Enter number of students-->");
        int students=scanner.nextInt();
        System.out.println();

        System.out.print("3.Enter number of subjects-->");
        int subjects=scanner.nextInt();
        System.out.println();

        int[][][] marks=new int[days][students][subjects];

        for(int i=0;i<days;i++){

            System.out.println("---Day "+(i+1)+("---"));
            System.out.println();

            for(int j=0;j<students;j++){
               
                System.out.println("*Student "+(j+1)+"*");
                System.out.println();

                for(int k=0;k<subjects;k++){
                    System.out.println("Subject "+(k+1));
                    System.out.print("Enter marks :");
                    marks[i][j][k]=scanner.nextInt();
                    System.out.println();
                }
            }
        }

        System.out.println("Now you can get student results....");
        System.out.println("1.Get student resluts");
        System.out.println("2.Get daily results");
        System.out.println("3.Get subject resluts");
        System.out.println();

        System.out.print("What do you want? ");
        String choise=scanner.next();

        switch(choise){
            case "1":
                System.out.println("choose the student number");
                break;
            case "2":
                break;
            case "3":
                break;
            default:

        }
    }
}