package impacta.ead.estacionamento.utilitario;

import impacta.ead.estacionamento.negocio.Movimentacao;

/**
 * @author Lucas Toshio
 * Representa uma classe de apoio as demais do sistema
 */
public class EstacionamentoUtil {
	/**
	 * Valida a placa com o padrao LLL-NNNN
	 * L = LETRA 
	 * N = NUMERO
	 * @param placa Placa do veiculo
	 * @return true se atender o padrão e false senão 
	 */
	public boolean validarPadraoPlaca(String placa) {
		//TODO implementar
		return false;
	}
	/**
	 * O calculo do valor da estada do veiculo baseado
	 * no tarifario e na entrada e saida do veiculo
	 * 
	 * Altera a propria instacia do parametro
	 * 
	 * @param movimentacao Istancia da movimentacao
	 */
	public void calcularPagamento(Movimentacao movimentacao) {
		//TODO implementar
		
	}

}
