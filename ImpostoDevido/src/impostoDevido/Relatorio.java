package impostoDevido;

import java.util.ArrayList;

public class Relatorio {
	// CRIANDO UMA LISTA dos Ativos- > gerarRelatorio
	ArrayList<Ativos> listaRelatorio;
	
	//Construtor Relatorio 
	public Relatorio() {	
		this.listaRelatorio = new ArrayList<>();
	}
	//Esse metodo Insere um ativo na Lista Relatorio
	void insereAtivo(Ativos novoAtivo) {
		novoAtivo.calculaimposto();
		listaRelatorio.add(novoAtivo);
		
		//Esse metodo Imprime a Lista completa Relatorio
	}
	void listarAtivos() {
		System.out.println("\n Lista de ativos:  ");
		for(Ativos posicaoAtivo:listaRelatorio){
			posicaoAtivo.listar();	
		}
	}
	//Esse metodo Imprime a Lista Situações
	void listarSitucoes() {
			for(Ativos posicaoAtivo:listaRelatorio) {
				posicaoAtivo.Situcoes();
			}	
		}
}
