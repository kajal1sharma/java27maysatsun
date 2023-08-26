import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collection2 {
 public static void main(String[] args) {
   
    Stack<Integer> st = new Stack<>();
    st.add(34);
    st.push(40);
    st.push(50);
    st.push(60);
    st.push(70);
    // System.out.println(st);
    // st.pop();
    // System.out.println(st);
    // st.pop();
    // System.out.println(st);
    // System.out.println("top element : "+st.peek());

   
    Vector<Integer> v= new Vector<>(st); 
    v.add(34);
    v.add(90);
    System.out.println(v);



    //LinkedList<Integer> list = new LinkedList<>();
    // list.add(34);
    // list.add(90);
    // list.add(80);
    // list.remove();
    // System.out.println(list.contains(90));
    // System.out.println(list);
    // System.out.println("is list empty ? : "+list.isEmpty());

//    ArrayList<Integer> arr = new ArrayList<>();
    // arr.add(45);
    // arr.add(34);
    // arr.add(78);
    // arr.remove(2);
    // System.out.println(arr.contains(34));
    // System.out.println(arr);
 }   
}
