class MethodCallingExample{
    public static void main(String args[]){
        System.out.println("1");
        System.out.println("2");
        printLine();

        System.out.println("3");
        System.out.println("4");
        printLine();//method calling statement

        System.out.println("5");
        System.out.println("6");
        printLine();

        System.out.println("7");
        System.out.println("8");
        printLine();
        
        System.out.println("9");
        System.out.println("10");
        printLine();
    }

    public static void printLine(){
        System.out.println("----------------");
        testMethod();
    }

    public static void testMethod(){
        System.out.println("Test");
    }
}