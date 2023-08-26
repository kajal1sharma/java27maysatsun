
import java.util.LinkedList;
import java.util.Queue;

public class QueueIntf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(123);
        q.add(56);
        q.add(78);
        q.add(90);
        q.add(23);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q);


    }
}
