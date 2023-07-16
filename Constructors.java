class Student2{
    String name=null;
    int height=157;
    int weight=50;
    int rollno=89;
//default 
    Student2(){
    //    this.name="neeta";
    //    this.height=159; 
    }
    Student2(String s, int h, int w, int r){
        this.name=s;
        this.height=h;
        this.weight=w;
        this.rollno=r;
    }
    Student2(String d, int h){
        this.name=d;
        this.height=h;
    }
    Student2(String str, float height){

    }
}

public class Constructors {
    public static void main(String[] args) {
        Student2 st=new Student2();
        Student2 st1=new Student2("neeta",167,55,76);
        Student2 st2=new Student2("tina",157, 50, 23);
        Student2 st3 =new Student2("rahul", 176); 
    }
}
