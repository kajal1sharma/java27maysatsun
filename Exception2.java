

public class Exception2 {
    public static void main(String[] args) {
       

        try{
            // int i=90;
            String name="tina";//i want to make my own exception based on application requiremt
            if(name.equals("reena")){

            }
            else{
                Exception ref = new Exception("only reena can access my application");
                 throw ref;
            }
        }
        catch(Exception e){
            System.out.println("i have handled it");
        }
        finally{
            //clean up codes
            System.out.println("this block will always run whethher the exception comes or not");
        }




        // try{
        //     int a=0;
            
        // }
        // catch(Exception e){
        //     try{

        //     }
        //     catch(Exception e1){

        //     }
        // }



        // try{
        //     // int a=90/0;
        //     // String s="";
        //     // s=null;
        //     // s.equals("kdfsknf");
        //     int []arr =new int[6];
        //     arr[9]=90;

        // }
        
        // catch(ArithmeticException e){
        //     System.out.println("this is arithmetic block");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("this is array block");
        // }
        //  catch(Exception e){
        //     System.out.println(e);
        // }
        
       
    }
}
