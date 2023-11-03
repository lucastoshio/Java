
package impostoDevido;
/**
*
* @author LUCAS TOSHIO
*  
*  A classe ativos cria os objetos e metodos 
*  necessarios para criar um ativo 
*/


public class Ativos {
	// Declaração de variaveis e
	private String nomeAtivos, situacao;
	private int qntAtivos;
	private double valorCompra, valorVenda, impostoDevido, lucro, lucroTotal = 0;
	
	//Contrutor vazio para não dar erro, pois as varieveis estão nullas 
	public Ativos() {
	}
	
	//Contrutor Ativos, realiza captura das variaveis 
	public Ativos (String nomeAtivos, int qntAtivos, double valorCompra, double valorVenda) {
		setNomeAtivos(nomeAtivos);
		setQntAtivos(qntAtivos);
		setValorCompra(valorCompra);
		setValorVenda(valorVenda);	
	}

	
	// Esse metodo  listar() serve para imprimir a lista
	void listar() {
		System.out.println("\n +---------------+ ");
		System.out.println("\n Ativo: " + this.nomeAtivos);
		System.out.println("\n Quantidade de Ativos : " + this.qntAtivos);
		System.out.println("\n Valor de Compra: " + this.valorCompra);
		System.out.println("\n Valor de venda : " + this.valorVenda);
		System.out.println("\n +---------------+ ");
		
	}
	// Esse metodo calcula o Lucro ou prejuizo e o imposto a ser pago se houver lucro
	void calculaimposto() {
		
		lucro = qntAtivos * (valorVenda - valorCompra);
		lucroTotal = + lucro;
		if ((lucro )< 0) {
			this.situacao = ("No Ativo " + nomeAtivos + " voce esta no prejuizo de: " + lucroTotal + " reais e não deve imposto nesse ativo");
		} else {
			impostoDevido = 0.2*(lucro);
			this.situacao = ( " No Ativo " + nomeAtivos + " Voce teve Lucro de: " + lucroTotal + 
					"  Reais e deve imposto no valor de: " + impostoDevido );
		}
	}
	// Esse metodo imprime a situação no ativo informado
		void Situcoes() {
			
			System.out.println("\n Sua situação é: " + this.situacao );	
		}
		
		
		
		
		
	
	// métodos de acesso e de modificação Getters e setters
	public String getNomeAtivos() {
		return nomeAtivos;
	}

	public void setNomeAtivos(String nomeAtivos) {
		this.nomeAtivos = nomeAtivos;
	}

	public int getQntAtivos() {
		return qntAtivos;
	}

	public void setQntAtivos(int qntAtivos) {
		this.qntAtivos = qntAtivos;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}


	public double getValorVenda() {
		return valorVenda;
	}


	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

}
	

