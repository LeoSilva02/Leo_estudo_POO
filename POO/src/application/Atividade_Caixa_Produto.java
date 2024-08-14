package application;

import java.util.Scanner;
import entidade.Produto;

public class Atividade_Caixa_Produto {

	public static void main(String[] args) {
 String mensagem;
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();

		System.out.println("Preencha os dados abaixo:");
		System.out.print("Nome do Produto: ");
		prod.Nome = sc.next();
		System.out.print("Preço: ");
		prod.preco = prod.validarDouble(sc,"Informe o Valor corretamente \nPreço: ");
		System.out.print("Quantidade: ");
		prod.quantidade = prod.validarInteiro(sc, "Informe uma quantidade valida \nQuantidade: ");
		
		mensagem = prod.imprimirEstoque();
	    System.out.println(mensagem+"\n");
		
		System.out.print("Informe quantos produtos deseja Adicionar: ");
		prod.adicionarProd();
		mensagem = prod.imprimirEstoque();
	    System.out.println(mensagem+"\n");
	    
	    System.out.print("Informe quantos produtos deseja remover: ");
	    prod.removerProd();
	    mensagem = prod.imprimirEstoque();
	    System.out.println(mensagem+"\n");
	    
			
	}
	
	
	
	
	
	
	
	
	
	

}
