class VeryOldGenCar{
    int x;
    int y;
    VeryOldGenCar(){
        System.out.println("iam a very old gen car ");
    }
     VeryOldGenCar(int x, int y){
        this(34);
        this.y=y;
        System.out.println("iam a very old gen car para constructors ");

    }
    VeryOldGenCar(int x){
        this.x=x;
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
    OldGenCars(int seats, int tyres, int engine){//OldDenCars(int int int)
        //super()
        super(89,67);
        this.seats=seats;
        this.tyres=tyres;
        this.engine=engine;
        // System.out.println("old gen para constructor");
    }
    OldGenCars(int seats, int tyres){
        super();
        System.out.println("old gen para constructor 2");
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
        super(34,56);   
        System.out.println("iam a new generation constructors");
    }
    NewGenCars(int tyres , int window, int stering , int seats, int engine, int ac, int musicSystem){
        super(seats,tyres, engine);
        this.ac=ac;
        this.musicSystem=musicSystem;
        
        // System.out.println("iam a new para constructors");
    }
    void printInfo(){
        System.out.println("==================");
        System.out.println(this.tyres);
        System.out.println(this.window);
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
        obj.printInfo();
         NewGenCars obj2 = new NewGenCars(4, 40, 40, 30,30, 30, 20);
        obj2.printInfo();
        // OldGenCars obj = new OldGenCars();
        
        // OldGenCars obj = new OldGenCars();
        // System.out.println(obj.tyres);
        // obj.distanceTravelled();
        // NewGenCars nobj= new NewGenCars();
        // System.out.println(nobj.tyres);
        // nobj.distanceTravelled();

    }
}
