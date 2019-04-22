package goosebumps;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.util.FormatUtil;

public class Bibliotecas {
	private SystemInfo si = new SystemInfo();
	private HardwareAbstractionLayer hal = si.getHardware();
	private CentralProcessor cp = hal.getProcessor();
	private GlobalMemory memory = hal.getMemory();
	private ConexaoBancoJdbc conectar = new ConexaoBancoJdbc();

	public void getNameProcessor() {
		cp.getName();
		System.out.println(cp.getName());
	}

	public void getMemoryTotal() {
		memory.getTotal();
		// System.out.println(memory.getTotal());
		// System.out.println(memory.getAvailable());

		System.out.println("Memoria RAM: " + FormatUtil.formatBytes(memory.getAvailable()) + " / "
				+ FormatUtil.formatBytes(memory.getTotal()));
	}

	public void insertBanco() throws SQLException {
		String nameProcessador = cp.getName();
		conectar.conec();
		Connection statement = conectar.conec();
		String insertTable = "insert into components" + "(PROCESSADOR, MEMORIARAM)" +  
				"values" + "('paz', 'paz')";
		try {
			Statement statement2 = statement.createStatement();
			int rs;
			rs = statement2.executeUpdate(insertTable);
			System.out.println("Record is inserted into DBUSER table");
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		} finally {
			if (statement != null) {
				statement.close();
			}
//			if (conectar() != null) {
//				conectar().close();
//			}
		}
	}

}
