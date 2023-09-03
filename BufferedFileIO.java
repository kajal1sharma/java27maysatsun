import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileIO {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader f = new FileReader("abc.txt");
        BufferedReader br =new BufferedReader(f);

        // String s = br.readLine();
        // while(s!=null){
        //     System.out.println(s);
        //     s= br.readLine();
        // }

        

        br.close();
        f.close();
    }
}
