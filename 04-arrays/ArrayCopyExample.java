class ArrayCopyExample{
    public static void main(String args[]){
        int[] x={10,20,30,40,50};
        int[] y=new int[x.length];

        for(int i=0;i<x.length;i++){
            y[i]=x[i];
        }

        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
    }
}