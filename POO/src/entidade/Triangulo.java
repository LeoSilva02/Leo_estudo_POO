package entidade;

//Definindo a class 'Triangulo'
public class Triangulo {
	/*Os Atributos e metodos estão definidas como 'public' para que possam
	 * ser usados por outros arquivos.*/
	
	
	/*Definindo Atributoss da classe*/
	public double a;
	public double b;
	public double c;
	
	/*Definindo Metodo da Class*/
	public double area() {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
}
