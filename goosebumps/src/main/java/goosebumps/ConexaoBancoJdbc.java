package goosebumps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBancoJdbc {
	public String dbUrl = "jdbc:sqlserver://gameoverserve.database.windows.net:1433;database=DataBaseGO;user=adminGO@gameoverserve;password=GameOver0;";
	public String user = "adminGO";
	public String password = "GameOver0";

	public Connection conec() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, user, password);
		return conn;
	}

	public void conexao() {
		try {
			Connection conn = DriverManager.getConnection(dbUrl, user, password);

			if (conn != null) {
				System.out.println("Connected");

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public boolean hasConnected() throws Exception {
		Connection conectado = DriverManager.getConnection(dbUrl, user, password);
		if (conectado == null) {
			System.out.println("Erro de conexao com o banco");
		}
		return false;
	}

	public void selectBanco() throws SQLException {
		Connection statement = conec();
		try {
			Statement statement2 = statement.createStatement();
			ResultSet rs;

			rs = statement2.executeQuery("select  * from components");
			while (rs.next()) {
				String processador = rs.getString("PROCESSADOR");
				int linha = rs.getRow();
				System.out.println("ID: " + linha + " Componente: " + processador);
			}
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (conec() != null) {
				conec().close();
			}
		}
	}

	/*
	 * @SuppressWarnings("null") public void conectarBanco() { Connection connection
	 * = null; try { Connection schema = DriverManager.getConnection(dbUrl, user,
	 * password); schema.getSchema();
	 * System.out.println("Successful connection - Schema: " + schema);
	 * 
	 * String selectSql = "select  * from components"; try (Statement statement =
	 * connection.createStatement(); ResultSet resultSet =
	 * statement.executeQuery(selectSql)) {
	 * System.out.println("Top 20 categories:"); while (resultSet.next()) {
	 * System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)); }
	 * connection.close(); }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */
}
