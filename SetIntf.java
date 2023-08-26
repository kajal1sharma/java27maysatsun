import java.util.HashSet;
import java.util.TreeSet;

public class SetIntf {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(34);
        set.add(145);
        set.add(56);
        set.add(90);
        set.add(145);
        System.out.println(set);
        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(34);
        ts.add(45);
        ts.add(90);
        ts.add(80);
        ts.add(70);
        ts.add(70);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.ceiling(46));


    }
}
