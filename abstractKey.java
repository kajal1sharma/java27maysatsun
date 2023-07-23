
abstract class Vehicle{
 int seat;
    int fuelCapacity;
    int runningCapacity;
    int wheels;

    void distanceTravelled(){
        System.out.println("n amount of distance has been travelled by the vehicle");
    }

   abstract void ModeOfTRansport();
}

abstract class TwoWheeler extends Vehicle{
   abstract void ModeOfTRansport();
}

class MotorCycle extends TwoWheeler{
    void ModeOfTRansport(){
        System.out.println("land");
     }
}
class Ship extends Vehicle{
    void ModeOfTRansport(){
        System.out.println("water");
    }
}

public class abstractKey {
public static void main(String[] args) {
  //  Vehicle v= new Vehicle();
   // v.ModeOfTRansport();
    MotorCycle m = new MotorCycle();
    m.ModeOfTRansport();

    
}    
}
