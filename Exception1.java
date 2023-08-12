public class Exception1 {
    public static void main(String[] args) {

        // Exception e= new ArithmeticException();
        // Object obj =new Exception();
        // Object obj2= new Exception1();
        try{
           int a=90;
           int b=0;
           int c=a/b; 
           System.out.println("hello world 1");
           System.out.println("Hello worldm 2");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("hello world");
        }
        System.out.println("iam outside catch block");
    }
}
