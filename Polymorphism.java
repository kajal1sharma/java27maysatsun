class Base{
    int x;
    int y;
    int z;

//function overoading =>you overloading same name with different definitions
    void sum(int a, int b, int ...num){
        int result =a+b;
        for(int i=0;i<num.length;i++){
            result+=num[i];
        }
        System.out.println(result);
    }
    void sum(int a , int b){
         int result = a+b;
         System.out.println(result);
    }

    void sum(int a , int b,int c){
        int result =a+b+c;
        System.out.println(result);
    }

    void difference(int a , int b){
        System.out.println("base");
        System.out.println(a-b);
    }
}
class Child extends Base{
   
    void difference(int a , int b){
        System.out.println("child");
        System.out.println(b-a);
    }
}

class Child2 extends Child{
    
    void difference(float a, float b){

    }
    int a;
    int b;

}
public class Polymorphism{
    public static void main(String[] args) {
        //   Base obj =new Base();
        //   obj.difference(20, 30);
        //   Child obj2= new Child();
        //   obj2.difference(20, 30);
          Base ref1 = new Child2();
          Child ref2= new Child2();
          Base  ref = new Child();
          ref.difference(20,30);
          ref2.difference(20,30);
          ref1.difference(20, 30);
            // Child ref1 =new Base();

    }

}