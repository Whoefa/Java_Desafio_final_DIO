package subsistema2.cep;

public class Regiao {

	private static Regiao informacoes = new Regiao();

	private Regiao() {
		super();
	}

	public static Regiao getInformacoes() {
		return informacoes;
	}
	
	public String Continente (String regiao) {
		return "Europeu";
	}
	
	public String Oceano (String regiao) {
		return "Atlântico";
	}
}
