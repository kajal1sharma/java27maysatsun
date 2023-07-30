//final function and polymorphism
//final classes cannot be inherited

//class abstract, final, public, default
final class Mobile{

    String name;
   // final String number="99309039240293";
    static final String number;
    static {
        int a=90;
        if(a==90){
        number="45345";
        }
        else{
            number="4584956";
        }
    }
    // Mobile(String num){
    //     this.number = num;
    // }
     final void dialNumber(){
        System.out.println("iam dialing a number");    
    }
}

// class Abc extends Mobile{
//     // void dialNumber(){
//     //     System.out.println("iam not dialing a number");
//     // }
// }

public class FinalKey {
    public static void main(String[] args) {
        

        Mobile m1= new Mobile();
        Mobile m2 =new Mobile();



        // Abc obj= new Abc();
        // obj.dialNumber();

        // System.out.println(Mobile.number);

        // Mobile m1= new Mobile("1234");
        // //m1.number="43423";
        // Mobile m2=new Mobile("34654");
        // Mobile m3= new Mobile("453544");
    }
}
