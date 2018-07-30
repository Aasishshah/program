import java.uti.*;
import java.sql.*;
public class ViewDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Roll NO. to display info.:"");
		int rollNo=Integer.parseInt(sc.nextLine());
		Connection cn = DatabaseConnection.getConnection();
		Statement stat= cn.createStatement();
		String sqlQuery="select * from student where roll_no="+rollNo;
		ResultSet rs= stat.executeQuery(sql.Query);
		
		while (rs.next())
		{
			int roll=Integer.parseInt(rs.getString("roll_name"));
			String name= rs.getString("name");
			String address=rs.getString("address");
			System.out.println("Roll NO: "+roll);
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			}
			else
	
	}catch (SQLException e){
		e.printStackTrace();
	}
}

	
	