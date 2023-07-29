interface Person{

    int hands=90;
    void run();
    void walk();
    String getName();
    boolean checkAge(int age);

}

interface Person1{
   static int count=90;
   void talk();
   //void slowTalk();
}

class Doctor implements Person,Person1{
    String name;

    public void run(){

    }
    public void walk(){

    }
    public String  getName(){
        return "nitu";
    }
    public boolean checkAge(int age){
        return true;
    }
    public void talk(){

    }

}




public class Interface {
    public static void main(String[] args) {
        Doctor d= new Doctor();
        d.getName();
    }
}
