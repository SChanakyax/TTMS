package dbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection connect() {
		Connection con=null;
		try {
		Class.forName("org.sqlite.JDBC");
		con=DriverManager.getConnection("jdbc:sqlite:timedb.db");
		System.out.println("Connected");
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e+"");
		}
		return con;
	}

}
