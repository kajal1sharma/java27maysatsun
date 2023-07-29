interface Person{

    int hands=90;
    void run();
    void walk();
    String getName();
    boolean checkAge(int age);

}

class Doctor implements Person{
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


}




public class Interface {
    public static void main(String[] args) {
        Doctor d= new Doctor();
        d.getName();
    }
}
