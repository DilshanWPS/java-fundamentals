class ArrayReferenceExample{
    public static void main(String args[]){
        int[] x={10,20,30,40,50,60};
        int[] y=x;
        x[0]=100;

        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }

        System.out.println();

        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }


    }
}