class TwoDArrayExample{
    public static void main(String args[]){
        
        int[][] x=new int[3][3];

        x[0][0]=10;
        x[0][1]=20;
        x[0][2]=30;

        x[1][0]=110;
        x[1][1]=120;
        x[1][2]=130;

        x[2][0]=210;
        x[2][1]=220;
        x[2][2]=230;

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}

