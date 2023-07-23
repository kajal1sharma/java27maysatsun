class Person{

    private int eyes;
    private String hairColor;
    private int fingers;
    private String name;
    private String address;

    //gettter=> get value from the object
    //setter => set the value in the object

    void setEyes(int eyes){
        this.eyes=eyes;
    }
    int getEyes(){
        return this.eyes;
    }
    void setHairColor(String color){
        this.hairColor=color;
    }
    String getHairColor(){
        return this.hairColor;
    }
    void setFinger(int finger){
        this.fingers=finger;
    }
    int getFinger(){
        return this.fingers;
    }



}

public class GetterSetter {
    public static void main(String[] args) {
        Person p= new Person();
        // p.hairColor;
        // p.hairColor="pink";
        // p.setHairColor("black");
        System.out.println(p.getHairColor());
    }
}
