package application;

import java.util.Locale;
import java.util.Scanner;
import entidade.Triangulo;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		//double p;
		
		
		
		Triangulo x, y; // Declarando 'x' e 'y' como variáveis do tipo Triangulo, que é uma Objeto
		x = new Triangulo(); // Instanciando o objeto Triangulo na variável 'x'
		y = new Triangulo(); // Instanciando o objeto Triangulo na variável 'y'
		
		/* OBS: Ao instanciar o objeto Triangulo, as variáveis dela são alocadas na área de memória Heap
		 * Heap: É a área da memória onde são criados os objetos dinâmicos durante a execução
		 * Stack: É a área da memória onde são criadas as variáveis estáticas e as variáveis locais, ou seja, aquelas declaradas em métodos, além das variáveis que são referências a objetos
		 * Ao utilizar atributos de um objeto, a variável na Stack que armazena a instância terá o endereço de memória que aponta para o objeto no Heap
		 */
		
		System.out.println("Inform os valores do lado X do triangulo");
		x.a = sc.nextDouble(); // Salvando valor na variável a da classe Triangulo
		x.b = sc.nextDouble();// Salvando valor na variável b da classe Triangulo
		x.c = sc.nextDouble();// Salvando valor na variável c da classe Triangulo
		System.out.println("Inform os valores do lado Y do triangulo");
		y.a = sc.nextDouble();// Salvando valor na variável a da classe Triangulo
		y.b = sc.nextDouble();// Salvando valor na variável b da classe Triangulo
		y.c = sc.nextDouble();// Salvando valor na variável c da classe Triangulo		
		
		/*Está sendo utilizado um metodo da class Triangulo, com isso evitamos repetição de código e atribuimos
		 * a responsabilidade da funcionalidade a class 'relacionada' ou 'coerente' a ela.
		 */
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do Triangulo X : %.4f%n",areaX );
		System.out.printf("Área do Triangulo Y: %.4f%n",areaY );
		
		if(areaX>areaY) {
			System.out.println("O maior é X");
		}else {
			System.out.println("O maior é Y");
		}

		sc.close();
		

	}

}
