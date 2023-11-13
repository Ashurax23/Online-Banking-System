import java.sql.*;
public class Conn {
	Connection c;
	Statement s;
	public Conn() {
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3300/bankm","root","root");
			s=c.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
