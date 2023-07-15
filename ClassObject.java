
class Human{
    int a;
    int b;
    int c;
}
class Car{
    int x=10;
    char y='a';
    float f=45.54f;
    boolean b=true;
    Human h1=new Human();

    public void printInfo(){
            System.out.println("integral data type "+this.x);
            System.out.println("char data type "+this.y);
            System.out.println("float data type "+this.f);
            System.out.println("boolean data type "+this.b );
            System.out.println("reference type variable "+this.h1);
    }

}
public class ClassObject {
    
    public static void main(String[] args) {
       Car c= new Car();
       c.x=100;
       c.b=false;
       c.f=90.343f;

       c.printInfo();
       Car c2= new Car();
       c2.x=10000;
       c2.b=true;
       c2.f=12.12f;
       
       c2.printInfo();
        //local variables must be initialized before use
    //    int a;

    //    a=90;
    //    System.out.println(a);
    //    Human h1;
    //    h1=null;
    //    System.out.println(h1);
        // Car c1=new Car();   
        

    }
}
