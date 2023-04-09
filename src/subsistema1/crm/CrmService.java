package subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String regiao,String  Continente,String Oceano,String cep) {
		System.out.println("Cidade  salva no sistema de CRM:");
		System.out.println("Cidade: " +regiao);
		System.out.println("Cep:" + cep);
		System.out.println("Oceano: " + Oceano);
	}
}
