
// class Human2Exception extends Exception {

//     int age;
//      Human2Exception(){

//     }
//     Human2Exception(String msg){
//         super(msg);

//     }

//     public void setAge(int age) throws Human2Exception {
//         if(age>100){
//             throw new Human2Exception("this age is not valid");
//         }
//         this.age = age;
//     }
//     public int getAge() {
//         return age;
//     }



// } 

public class Exception3 {
    public static void doSomething() throws Exception{
        Exception e =new Exception("something went wrong");
        throw e;
    //    try{
    //     throw e;
    //    }
    //    catch(Exception e2){
    //     System.out.println(e2);
    //    }
    }
    public static void main(String[] args) {
     
        
        try{
        
            doSomething();
        }
        catch(Exception e){
            System.out.println(e);
        }
        //    try{
            //if(human>100){
                // Human2Exception e =new Human2Exception("this age is not allowed");
                // throw e;
                // Exception e= new Exception("this age is not right");
                // throw e;
                // Human2Exception h= new Human2Exception();
                // h.setAge(102);
            //}
        //}
        
        // catch(Human2Exception e){
        //     System.out.println(e.getMessage());
        // }
        // catch(Exception e){

        // }
    }
}
