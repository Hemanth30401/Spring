import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao 
{
	public static ResultSet getLogin(String userName,String password) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/workers";
		String u="root",p="ROOT#30";
		Connection con=DriverManager.getConnection(url,u,p);
		PreparedStatement pst = con.prepareStatement("SELECT * FROM HACKER WHERE USERNAME=? AND PASSWORD=?");
		pst.setString(1, userName);
		pst.setString(2, password);
		return pst.executeQuery();
	}
}
