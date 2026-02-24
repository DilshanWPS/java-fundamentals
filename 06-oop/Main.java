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
    }
}