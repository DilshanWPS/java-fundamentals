import java.util.Scanner;
class SwitchLetterWordMatcher{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter=scanner.next();

        switch(letter){
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Banana");
                break;
            case "C":
                System.out.println("Cat");
                break;
            case "D":
                System.out.println("Dog");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}