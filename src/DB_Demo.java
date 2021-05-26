import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Demo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Employee";
	    String user = "root";
	    String password = "";
	    Connection con= DriverManager.getConnection(url, user, password);
	    if (con == null) {
	         System.out.println("JDBC connection is not established");
	         return;
	      } else
	         System.out.println("Congratulations," + 
	              " JDBC connection is established successfully.\n");
	    con.close();
			}}
