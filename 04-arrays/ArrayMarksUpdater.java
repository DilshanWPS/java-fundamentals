import java.util.Scanner;

class ArrayMarksUpdater{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("---Add additional 2 marks for subjects marks---");
        printLine();

        System.out.println("Enter current subject marks");
        printLine();

        int[] oldMarks=new int[5];

        for(int i=1;i<=5;i++){
            System.out.print("Enter subject "+i +" marks : ");
            oldMarks[i-1]=scanner.nextInt();
        }

        printLine();
        System.out.println("Your current marks");
        for(int i=0;i<oldMarks.length;i++){
            System.out.print(oldMarks[i]+" ");
        }

        printLine();

        addMarks(oldMarks);

        int[] newMarks=oldMarks;
        printLine();
        System.out.println("Your new marks");
        for(int i=0;i<newMarks.length;i++){
            System.out.print(newMarks[i]+" ");
        }
    }

    public static void printLine(){
        System.out.println();
    }

    public static void addMarks(int[] marks){

        for(int i=0;i<marks.length;i++){
          marks[i]=marks[i]+2;
        }

    }
}