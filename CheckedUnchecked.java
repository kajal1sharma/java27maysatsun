import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class CheckedUnchecked {

    static void doMaths() throws ArithmeticException{
        //..
    }
    static void readFile() throws FileNotFoundException{
        //...
    }
    static void random() throws Exception{

    }
    static void doSomethingMore() throws FileNotFoundException,Exception{
        doMaths();//unchecked
        readFile();//checked 
        random();
        //compiler dont check for arithmetic operation 
        // FileInputStream f =new FileInputStream("abc.txt");
    }
    static void doSomething()  throws Exception
    {
        try{
           doSomethingMore();
        }
        catch(FileNotFoundException e){

        }
    }
    public static void main(String[] args)  throws Exception {
        doSomething();
    }
}
