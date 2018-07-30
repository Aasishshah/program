import java.sql.*;


public class DatabaseConnection1{
	public static void main(String[] args){
		
		
		connectToDatabse();
	}
public static Connection connectToDatabse(){
	
	try{
	
	Class.forName("com.mysql.jdbc.Driver");          
	Connection cr = DriverManager.getConnection("jdbc:mysql://localhost:3306/csit_third","root", "");
	System.out.println("connected");
	return cr;
	}
	
    catch(Exception e){
		System.out.println("Exception: "+ e.getMessage());
		e.printStackTrace();
		return null;
	}	
	
	
 }
 
}