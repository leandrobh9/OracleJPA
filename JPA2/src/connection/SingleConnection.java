package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SingleConnection {

	public static void main(String[] args) {
		try {
			new SingleConnection().teste();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void teste() throws SQLException{

		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver" );
		} catch (Exception e) {
			System.err.println("ERROR: failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
			return;
		}
		Connection c = DriverManager.getConnection("jdbc:hsqldb:file:/opt/db/testdb;ifexists=true", "SA", "");
		PreparedStatement ps = c.prepareStatement("create table pessoa (id int, nome varchar(30))");
		boolean bool = ps.execute();
		if (bool){
			System.out.println("sim");
		}
		else {
			System.out.println("nao");
		}
	}
}
