class VeryOldGenCar{
    int x;
    int y;
    // VeryOldGenCar(){
    //     System.out.println("iam a very old gen car ");
    // }
     VeryOldGenCar(int x, int y){
        System.out.println("iam a very old gen car para constructors ");
    }
}
class OldGenCars extends VeryOldGenCar{
    int tyres=90;
    int window;
    int stering;
    int seats;
    int engine;

    // OldGenCars(){
    //     //super()
    //     super(67,89);
    //     System.out.println("old gen constructors");
    // }
    OldGenCars(int seats, int tyres, int engine){
        //super()
        super(89,67);
        System.out.println("old gen para constructor");
    }
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

    NewGenCars(){
        System.out.println("iam a new generation constructors");
    }
    NewGenCars(int tyres , int window, int stering , int seats, int engine, int ac, int musicSystem){
        System.out.println("iam a new para constructors");
    }
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
        NewGenCars obj = new NewGenCars(4, 40, 40, 30,30, 30, 20);
        // OldGenCars obj = new OldGenCars();
        
        // OldGenCars obj = new OldGenCars();
        // System.out.println(obj.tyres);
        // obj.distanceTravelled();
        // NewGenCars nobj= new NewGenCars();
        // System.out.println(nobj.tyres);
        // nobj.distanceTravelled();

    }
}
