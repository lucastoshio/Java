
package impostoDevido;
/**
*
* @author LUCAS TOSHIO
*  
*  Esse Programa cria um menu para cadastrar Ações com
*  respctivas quantidades, valor de compra e valor de venda,
*  e calcula o Lucro ou prejuizo e o imposto a ser pago.
*/
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaração de variaveis
		int opc, qntAtivos;
		String nomeAtivos;
		double valorCompra, valorVenda;
		//Instanciação dos objetos das classes Relatorio,
		// Ativos, e Scanner
		Relatorio listRelatorio = new Relatorio();
		Ativos novoAtivo = new Ativos();
		Scanner teclado = new Scanner(System.in);
		// Do While para criar  o menu, a variavel int opc é 
		// responsavel por acessar os comandos do menu
		
		do{
			System.out.println("\n---------------");
			System.out.println("       Menu       ");
			System.out.println(" Escolha uma opção ");
			System.out.println(" 1 - Inserir Ativo  ");
			System.out.println(" 2 - Listar Ativos ");
			System.out.println(" 3 - Situaçoes imposto ");
			System.out.println(" 0 - Sair ");
			// opc --> Ler opção escolhida pelo usurario
			opc = teclado.nextInt();
			// Limpeza de Buffer
			teclado.nextLine();
			
			//Switch case --> acessar os comandos escolhidos no Menu
			
			switch(opc) {
			
			case 1:
				// Receber os inputs do usuario e  delcarar as variaveis
				System.out.println("\n Nome do Ativo: ");
				nomeAtivos = teclado.nextLine();
				System.out.println("\n Quantidade : ");
				qntAtivos = teclado.nextInt();
				System.out.println("\n Valor de Compra ? : ");
				valorCompra = teclado.nextDouble();
				System.out.println("\n Valor de Venda ? : ");
				valorVenda = teclado.nextDouble();
				
				//Construindo um Ativo da classe Ativos
				novoAtivo = new Ativos(nomeAtivos, qntAtivos, valorCompra, valorVenda);
				// insere um novo Ativo na lista Relatorio
				listRelatorio.insereAtivo(novoAtivo);
				
				
				break;
				
			case 2:
				
				listRelatorio.listarAtivos();
					
				
				break;
				
			case 3:
				listRelatorio.listarSitucoes();
				
				break;
				
			case 0:
				System.out.println(" \n Saindo ..... !! ");
				break;
				
			default:
				System.out.println(" \n Opção inválida !! ");	
			}
			
		}while(opc != 0) ;

	}

}
