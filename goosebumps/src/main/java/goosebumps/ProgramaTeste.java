package goosebumps;

public class ProgramaTeste {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// final Bibliotecas bibliotecas = new Bibliotecas("Dell", 50.0, 10.0);
		final ConexaoBancoJdbc conexaoBancoJdbc = new ConexaoBancoJdbc();
		final Bibliotecas oshi = new Bibliotecas();
		/*
		 * Thread simuladorAlerta = new Thread() { public void run() { while (true) {
		 * bibliotecas.setTemperatura(Math.random() * 100);
		 * bibliotecas.TemperaturaDentroDoPermitido(); try { Thread.sleep(2000); } catch
		 * (InterruptedException ex) {
		 * 
		 * }
		 * 
		 * }
		 * 
		 * } }; simuladorAlerta.start();
		 */
//		
		Thread conexaoBanco = new Thread() {
			@Override
			public void run() {
				conexaoBancoJdbc.conexao();
				try {
					if (conexaoBancoJdbc.hasConnected()) {
						conexaoBancoJdbc.hasConnected();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// TODO Auto-generated method stub
			}
		};
		
		conexaoBanco.start();
		
		Thread falhaConexaoAlerta = new Thread() {
			public void run() {
				try {
					if(conexaoBancoJdbc.hasConnected()) {
						conexaoBancoJdbc.hasConnected();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		falhaConexaoAlerta.start();
		
		Thread getHardwareOshi = new Thread() {
			public void run() {
				oshi.getNameProcessor();
				oshi.getMemoryTotal();
			}
		};
		getHardwareOshi.start();
		
		conexaoBancoJdbc.selectBanco();
		//oshi.insertBanco();
	}

}
