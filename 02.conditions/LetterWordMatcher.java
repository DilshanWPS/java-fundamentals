import java.util.Scanner;

class LetterWordMatcher{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter=scanner.nextLine();

        if(letter.equals("A")){
            System.out.println("Apple");
        }else if(letter.equals("B")){
            System.out.println("Banana");
        }else if(letter.equals("C")){
            System.out.println("Cat");
        }else if(letter.equals("D")){
            System.out.println("Dog");
        }else{
            System.out.println("Invalid Entry");
        }
    }
}