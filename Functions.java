import java.util.Scanner;

public class Functions {

    // public static void doSum(){//function definition 
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter first number");
    //     int a =sc.nextInt();
    //     System.out.println("Enter second number");
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println(sum);
    // }

//logic bind named scope {}

        // public static float doSum(){//function definition
        //    int a=90;
        //    int b=80;
        //    int sum=a+b;
        //    char ch='a';
        //    float f=90.334f;
        //    return f;
        // }
        
        // public static int calculateMarks(int num1,int num2, int num3, int num4, int num5 ){
        //     int sum =num1+num2+num3+num4+num5;
        //     return sum;
        // }

        public static void doSomethingEvenMore(){
            System.out.println("hello this is final line ");
        }
        public static void dosomethingMore(){
            System.out.println("hello this is line 3");
            doSomethingEvenMore();
            System.out.println("hello this is line 4");
            doSomethingEvenMore();
        }
        public static void doSomething(){
            System.out.println("helllo this is line 1");
            dosomethingMore();
            System.out.println("helllo this is line 2");
        }
    public static void main(String[] args) {
     

        doSomething();
       System.out.println("i have returned to main funciton");

        // int tiaMarks = calculateMarks(45, 67, 56,78,89);
        // int riaMarks = calculateMarks(78,90,67,68,89);
        // int reetaMarks=calculateMarks(89,67,67,78,98);

        // int totalClassMarks = (tiaMarks+riaMarks+reetaMarks)/3;
        // System.out.println(totalClassMarks);





        // float a= doSum();
        // System.out.println(a);



        // doSum();//function call

        //int a=0,b=89;
        // doSum();//function calling
        // doSum();
        // doSum();
        // doSum();

    }
}
