import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;

public class ReadWrite {
    public static void main(String[] args) {
        
        //buffered writer - to create and write to a file
       /* try{
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\Zahid\\OneDrive\\Desktop\\Text file\\output.txt"));
            bw.write("hi how are you\n");
            bw.write("My name is Zahid\n");
            bw.close();
            }
            catch(Exception ex){
                return;
            
        } */

        try{
            BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Zahid\\OneDrive\\Desktop\\Text file\\output.txt"));
            String s;
            while((s = br.readLine()) !=null){
                System.out.println(s);
            }
            br.close();
        } catch(Exception ex){
            return;
        }
        




    }
    
}
