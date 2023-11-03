package impacta.ead.estacionamento.negocio;

/**
 * 
 * Representa as informações relativas à vagas 
 * do estacionamento ou status de ocupação
 * 
 * @author LUCAS TOSHIO
 */

public class Vaga {	
	
	public static int TOTAL_VAGAS = 100;
	private static int vagasOcupadas = 0;
	
	private Vaga() {}
	
	/**
	 * Verificar a existencia de uma vaga livre no estacionamento
	 * @return true se houver alguma vaga e false se estiver lotado 
	 */
	public static boolean temVagaLivre() {
		
		// TODO implementar este metodo.
		return false;
	}
	
	/**
	 * Buscar o status atual das vagas do estacionamento
	 */
	public static void inicializarOcupadas() {
		//TODO implementar
	}
	
	/**
	 * Retorna o numero de vagas ocupadas  
	 * @return numero total de vagas ocupadas num determinado instante
	 */
	public static int ocupadas() {
		return Vaga.vagasOcupadas;
	}
	
	/**
	 * Retornar o numero de vagas livres
	 * return numero total de vagas livres num determinado instante 
	 */
	public static int livres() {
		return TOTAL_VAGAS - Vaga.vagasOcupadas;
		
	}
	
	/**
	 * Atualiza o numero de vagas ocupadas após a entrada do veiculo
	 */
	public static void entrou () {
		Vaga.vagasOcupadas ++;
	}
	
	
	
	
	
	
	
}
