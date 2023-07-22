
class OldGenCars{
    int tyres=90;
    int window;
    int stering;
    int seats;
    int engine;

    void speedOfTheCar(){
        System.out.println("the speed is very fast");
    }
    void distanceTravelled(){
        System.out.println("distance travelled");
    }
}

class NewGenCars extends OldGenCars{
    // int tyres;
    // int window;
    // int stering;
    // int seats;
    // int engine;
    int ac;
    int musicSystem;

    void printInfo(){
        System.out.println("==================");
        System.out.println(tyres);
        System.out.println(window);
        System.out.println(stering);
        System.out.println(seats);
        System.out.println(engine);
        System.out.println(ac);
        System.out.println(musicSystem);
        System.out.println("===================");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        OldGenCars obj = new OldGenCars();
        System.out.println(obj.tyres);
        NewGenCars nobj= new NewGenCars();
        System.out.println(nobj.tyres);

    }
}
