import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapItnf {
    public static void main(String[] args) {


        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(34,"tina");
        tm.put(90,"pooja");
        tm.put(45,"rita");
        tm.put(56,"tina1");
        tm.put(78,"pooja1");
        tm.put(80,null);
        tm.put(80, "ganesh");
        //tm.put(null,"gita");
        System.out.println(tm);
        System.out.println(tm.containsKey(90));
        System.out.println(tm.get(80));
        


    //     HashMap<Integer,String> hm = new HashMap<>();

    //     hm.put(23,"tina" );
    //     hm.put(90,"rahul");
    //     hm.put(12,"meena");
    //     hm.put(45, "ritu");
    //     hm.put(89,null);
    //     hm.put(67,null);
    //     hm.put(null, "priya");
    //     hm.put(45, "ramesh");

    //     System.out.println(hm.containsKey(45));
    //     System.out.println(hm.get(45));
    //     System.out.println(hm.remove(12));
    //     System.out.println(hm);
    

    // Map<Integer, String> hm2 = new HashMap<Integer, String>(hm);
    // System.out.println(hm2);

    }
}
