
class Student{
    static String principal="sk mishra";
    static String collegeName="UIM";
    int rollno;
    String name;

    public static void print(){
        System.out.println("hello world");
        System.out.println(principal);
        System.out.println(collegeName);
       
        }
}
public class StaticKeyWord {
    int x;
    public static void read(){
        System.out.println("hello iam read function ");
    }
    public void readnonStatic(){
        System.out.println("iam non static read func");
    }
    public void dosomething(){
        this.x=90;
        System.out.println("It does something");
        this.readnonStatic();
        read();
    }
    public static void main(String[] args) {
        //StaticKeyWord.dosomething();
        StaticKeyWord obj =new StaticKeyWord();
        obj.dosomething();
        // readnonStatic();
        // StaticKeyWord.read();
        // read();
        //     Student.print();

            //Student s1=new Student();
            // s1.print();
    //     Student.collegeName="UIT";
    //    Student st = new Student();
    //     st.rollno=90;
    //     st.name="teena";
    //     System.out.println(Student.collegeName);
    //     System.out.println(Student.principal);
    //     System.out.println(st.collegeName);
    //     Student st2 = new Student();
    //     st2.rollno=67;
    //     st2.name="Priya";

    //     Student st3 = new Student();
    //     st3.rollno=54;
    //     st3.name="Suraj";

        // st.principal="mk mehra";
        // st2.principal="mk mehra";
        // st3.principal="mk mehra";

    }
}
