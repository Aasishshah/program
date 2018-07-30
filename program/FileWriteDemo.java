import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo{
public static void main(String[] args){
	FileWriter  pw = null;
	try{
 pw = new FileWriter("test.txt");
pw.write("Hello World!");
//pw.Close();
	}catch(IOException ioe){
		ioe.printStackTrace();
	}finally{
		try{
		pw.close();
		}catch(IOException ioe){
		}
	}
}
}