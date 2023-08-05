//when both of the classes are not in the same package 
import vehicle.roadways.*;
import vehicle.roadways.Train;



public class TestVehicle extends Train{
    int x;
    int y;
    // Train z=new Train(23, 34, 54, 56);
    // static Train a;
    // void getTrainInfo(){
    //     System.out.println(this.z.wheels);
    //     System.out.println(this.z.distance);
    //     System.out.println(this.z.engine);
    //     System.out.println(this.z.compartments);
    // }
    void getTrainInfo(){
        System.out.println(this.wheels);
        System.out.println(this.engine);
        // System.out.println(this.compartments);
        // System.out.println(this.distance);
    }
    public static void main(String[] args) {
        // Train obj = new Train(30, 40, 2, 100);
        // // obj.distance=900;
        // // obj.getDistance();
        // System.out.println(obj.distance);
        // System.out.println(obj.compartments);
        // System.out.println(obj.engine);
        // System.out.println(obj.wheels);

    }
}


class A extends TestVehicle{
    void getInfo(){
        System.out.println(this.engine);
    }
}