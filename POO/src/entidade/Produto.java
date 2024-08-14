package entidade;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Produto {
	
	Scanner sc = new Scanner(System.in);
	
	
	public String Nome;
	public int quantidade;
	public double preco;
	
	
	public void adicionarProd() {
	int qtd = validarInteiro(sc,"Informe uma quantidade valida"); 
	this.quantidade = this.quantidade + qtd;
	}
	
	public void removerProd() {
	int qtd = validarInteiro(sc,"Informe uma quantidade valida"); 
		this.quantidade = this.quantidade - qtd;
	}
	
	
	public double valorTotal() {
		double valor = quantidade * preco;
		return valor;
	}
	
	
	public  String imprimirEstoque() {
		double total = valorTotal();
		//String.formt é utilizado para formatar uma  String, permitindo retornanar ela antés de Imprimir em tela
		String Mensagem = String.format("Produto Cadastrado: %s, R$%.2f, %d unidades, Total: %.2f",Nome,preco,quantidade,total);
		return Mensagem;
	}
	
	
	
	
	
	
	
	public static int validarInteiro(Scanner sc, String mensagem) {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Entrada invalida, Por favor informe um valor Inteiro\nQuantidade: ");
				sc.next();
			}
		}
	}
	
	
	public static double validarDouble(Scanner sc, String mensagem) {
		while (true) {
			try {
				return sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.print("Entrada invalida, Por favor informe um valor correto\nPreço: ");
				sc.next();
			}
		}
	}

}
