package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.Regiao;

public class Facade {

	public void migrarCliente(String regiao, String cep) {
		String Continente = Regiao.getInformacoes().Continente(regiao);
		String Oceano = Regiao.getInformacoes().Oceano(regiao);
		
		CrmService.gravarCliente(regiao,Continente,Oceano,cep);
	}
}
