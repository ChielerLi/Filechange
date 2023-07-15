import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
    public static void main(String args[]) {
        try{
            FileReader fr = new FileReader("/uploads/Resume.pages");
            FileWriter fw = new FileWriter("Output.txt");
            String str = "";
            int i;
            while((i=fr.read())!=-1){
                str += (char)i;
        
            }
            fw.write(str);
            fr.close();
            fw.close();
        }catch(IOException e){
            System.out.println("Exception");
        }
    }
}
