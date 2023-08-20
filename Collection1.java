import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

class Xyz{
    int a;
    int b;

    Xyz(){

    }
    Xyz(int a , int b){
        this.a=a;
        this.b=b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
}
public class Collection1 {
    public static void main(String[] args) {


        Stack<Xyz> st = new Stack<Xyz>();
        Stack<Xyz> st2 = new Stack<Xyz>();
        Xyz obj1 = new Xyz(23, 30);
        Xyz obj2 =new Xyz(23, 90);
        Xyz obj3 = new Xyz(50, 550);

        st.push(obj1);
        st.push(obj2);
        st.push(obj3);
        st2.push(obj1);
        st2.push(obj2);
        st2.push(obj3);

        st.addAll(st2);
        System.out.println(st);
        Xyz ref = st.peek();
        System.out.print(ref.getA()+"  ");
        System.out.println(ref.getB());
        st.pop();
        ref = st.peek();
        System.out.print(ref.getA()+"  ");
        System.out.println(ref.getB());



        // Collection ref = new ArrayList<>();
        // ArrayList<Integer> arr= new ArrayList<Integer>();
        // arr.add(78);
        // arr.add(90);
        // arr.add(56);
        // arr.add(34);
        // arr.add(123); 
        // arr.remove(3);
        // System.out.println(arr);
        // System.out.println(arr.isEmpty());
        // Stack<Integer> st = new Stack<>();
        // st.add(45);
        // st.add(67);
        // st.push(34);
        // Integer i = st.pop();

        // System.out.println(i);
        // System.out.println(st.peek());

      
        // System.out.println(arr.size());
        // System.out.println(arr);
        // Integer wrapper of int data type 
        // it converts primitive int into an object
        // int a=90;
        // String s="hello";
        // Integer i=a;
         
    }
}
