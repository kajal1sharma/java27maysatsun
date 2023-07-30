
import parent.child.Abc;

public class TestPackage {
    public static void main(String[] args) {
        Abc obj = new Abc();
        System.out.println(obj.sum(34,67));
        obj.setx(10);
        obj.sety(30);
        obj.setz(45);
        System.out.println(obj.getx());
         System.out.println(obj.gety());
          System.out.println(obj.getz());

    }
}
