import java.util.Scanner;

class CaseInsensitiveLetterMatcher{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter=scanner.nextLine();

        if(letter.equalsIgnoreCase("A")){
            System.out.println("Apple");
        }else if(letter.equalsIgnoreCase("B")){
            System.out.println("Banana");
        }else if(letter.equalsIgnoreCase("C")){
            System.out.println("Cat");
        }else if(letter.equalsIgnoreCase("D")){
            System.out.println("Dog");
        }else{
            System.out.println("Invalid Entry");
        }
    }
}