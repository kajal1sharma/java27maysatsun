import java.io.File;
import java.io.IOException;

public class FileIo {
    public static void main(String[] args) throws IOException  {
        

        File f6 = new File("./temp/temp2");
        File f7 = new File(f6,"text.doc");
        f7.createNewFile();

        // File f5 = new File("./temp", "temp2");
        // f5.mkdir();


        // File f4 = new File("./../temp/abc.txt");
        // f4.createNewFile();

        // File f3 = new File("C:/Users/ashis/Desktop/java27satsun/Test.txt");
        // f3.createNewFile();
        // File f2= new File("temp");
        // if(f2.exists()==false){
        //     f2.mkdir();
        // }
        // File f = new File("abc.txt");
        // System.out.println(f.exists());
        
        // if(f.exists()==false){
        //     f.createNewFile();
        // }

      


    }
}
