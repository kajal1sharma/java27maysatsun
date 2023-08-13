

public class Exception2 {
    public static void main(String[] args) {
       
        try{
            // int a=90/0;
            // String s="";
            // s=null;
            // s.equals("kdfsknf");
            int []arr =new int[6];
            arr[9]=90;

        }
        
        catch(ArithmeticException e){
            System.out.println("this is arithmetic block");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("this is array block");
        }
         catch(Exception e){
            System.out.println(e);
        }
       
    }
}
