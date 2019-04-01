import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectingDatabase {

	public static void main(String[] args) {

		String dbUrl = "jdbc:sqlserver://gameoverserve.database.windows.net:1433;database=DataBaseGO;user=adminGO@gameoverserve;password=GameOver0;";
		String user = "adminGO";
		String password = "GameOver0";

		try {
			Connection conn = DriverManager.getConnection(dbUrl, user, password);

			if (conn != null) {
				System.out.println("Connected");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
