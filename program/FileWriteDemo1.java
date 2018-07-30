import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo1{
public static void main(String[] args) throws IOException{
FileWriter pw = new FileWriter("testa.txt");
pw.write("Hello World!\n !!!!!!!!!");
pw.close();
}
}