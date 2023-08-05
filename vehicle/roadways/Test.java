package vehicle.roadways;

interface Abc{
    void print();
}
public class Test extends Truck implements Abc{
    int x;
    int y;
    // Truck t= new Truck();

    // void getInfo(){
    //     System.out.println(this.t.capacity);
    //     System.out.println(t.engine);
    //     System.out.println(t.wheels);
    // }
    public void print(){

    }
    void getInfo(){
        System.out.println(this.capacity);
        System.out.println(this.engine);
        System.out.println(this.wheels);
    }
   public void getInfoTruck(){
        System.out.println("hey this is a function of truck");
    }
}
