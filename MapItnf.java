import java.util.HashMap;
import java.util.Map;
public class MapItnf {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(23,"tina" );
        hm.put(90,"rahul");
        hm.put(12,"meena");
        hm.put(45, "ritu");
        hm.put(89,null);
        hm.put(67,null);
        hm.put(null, "priya");
        hm.put(45, "ramesh");

        System.out.println(hm.containsKey(45));
        System.out.println(hm.get(45));
        System.out.println(hm.remove(12));
        System.out.println(hm);
    

    Map<Integer, String> hm2 = new HashMap<Integer, String>(hm);
    System.out.println(hm2);
    }
}
