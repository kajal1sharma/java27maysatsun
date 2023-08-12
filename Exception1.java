public class Exception1 {
    public static void doSomethingEvenMore(){
        // try{
            int a=90/0;
            System.out.println("line 2 of do something even more");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("here the exception arrived");
        // }
    }
    public static void doSomethingMore(){
        System.out.println("line 1 in do something more ");
        // try{
        doSomethingEvenMore();
        // }
        // catch(Exception e){
        //     System.out.println("Exception has been handled");
        // // }
        System.out.println("line 2 in dosomething more");
    }
    public static void doSomething(){
        System.out.println("line 1 in doSomething");
       // try{
        doSomethingMore();
        // }
        // catch(Exception e){
        //     System.out.println("Exception has been handled");
        // }
        System.out.println("line 2 in doSomethign");
    }
    public static void main(String[] args) {

        System.out.println("line 1 in main");
       try{
        doSomething();
       }
        catch(Exception e){
            StackTraceElement arr[]=e.getStackTrace();
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        System.out.println("line 2 in main");



        // Exception e= new ArithmeticException();
        // Object obj =new Exception();
        // Object obj2= new Exception1();
        // try{
        //    int a=90;
        //    int b=0;
        //    int c=a/b; 
        //    System.out.println("hello world 1");
        //    System.out.println("Hello worldm 2");
        // }
        // catch(Exception e){
        //     System.out.println(e);
        //     System.out.println("hello world");
        // }
        // System.out.println("iam outside catch block");
    }
}
