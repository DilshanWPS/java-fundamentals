public class Main{
    public static void main(String args[]){
        SampleObject object1=new SampleObject();//object creation from MyClass2
        System.out.println(object1);
        object1.myMethod();

        System.out.println(object1.x);

        SampleObject object2=new SampleObject();

        object2.x=25;

        System.out.println("This is object 1 output : "+object1.x);

        System.out.println("This is object 2 output : "+object2.x);

        System.out.println();
        ConstructorExample object3=new ConstructorExample();
        //object3.ConstructorExample(); //constructor is not normal method,so we cant access it like this

        System.out.println();
        System.out.println("--Static keyword related programs--");
        StaticKey object4=new StaticKey();
        System.out.println(object4.x);
        System.out.println(object4.y);

        System.out.println();
        StaticKey object5=new StaticKey();
        System.out.println(object5.x);
        System.out.println(object5.y);

        object4.y=100;
        System.out.println(object4.y);
        System.out.println(object5.y);

    }
}