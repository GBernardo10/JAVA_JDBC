
public class Bibliotecas {
	// atributos da classe
	public String nomeComputador;
	public double temperaturaMaximaPermitida;
	public double temperaturaMinimaPermitida;
	public double temperaturaAtual = 0.0;

	// construtor que eu criei para a classe.
	public public Bibliotecas(String nomeComputador, double temperaturaMaximaPermitida,
			double temperaturaMinimaPermitida) {
		this.nomeComputador = nomeComputador;
		this.temperaturaMaximaPermitida = temperaturaMaximaPermitida;
		this.temperaturaMinimaPermitida = temperaturaMinimaPermitida;
	}

	public void TemperaturaDentroDoPermitido() {
		// mostra a temperatura atual
		System.out.println("Temperatura: " + temperaturaAtual);
		// verifica se a temperatua esta abaixo do permitido
		if (temperaturaAtual < temperaturaMinimaPermitida) {
			System.out.println("Temperatura abaixo do permitido, Alerta!!");
		}
		// verifica se a temperatura esta acima do permitido
		else if (temperaturaAtual > temperaturaMaximaPermitida) {
			System.out.println("Temperatura acima do permitido, Alerta!!");
		} else {
			System.out.println("Temperatura OK!!");
		}
	}

}
