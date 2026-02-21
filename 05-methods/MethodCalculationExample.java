class MethodCalculationExample{
    public static void main(String args[]){
        addNumbers();
    }

    public static void addNumbers(){
        int x=5;
        int y=3;

        int total=x+y;
        System.out.println("The sum of 5 and 3 is "+total);
        subNumbers();
    }

    public static void subNumbers(){
        int x=5;
        int y=3;

        int sub=x-y;
        System.out.println("The subtraction of 5 and 3 is "+sub);
    }
}