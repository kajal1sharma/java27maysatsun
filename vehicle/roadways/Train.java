package vehicle.roadways;
import java.util.Scanner;
import java.util.*;


public class Train {
    private int distance ;
    int compartments;
    protected int engine;
    public int wheels;

    public Train(){
        System.out.println("this is default train constructor");
    }
    public Train(int dist, int comp, int eng, int wheels){
        this.distance=dist;
        this.compartments=comp;
        this.engine=eng;
        this.wheels=wheels;

    }
    public int getDistance(){
        System.out.println("This is train class");
        return distance;
    } 


}
