class ArrayBasics{
    public static void main(String args[]){
        int[] numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println(numbers);//output the array reference
        System.out.println(numbers.length);

        //retrieve data from array
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
}