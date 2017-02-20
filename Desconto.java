import java.util.Scanner;
public class Desconto{
	public static void main(String[] args){
		//Método para receber dados;
		Scanner leia = new Scanner(System.in);
		//Variáveis
		double p, pf;
		//programa
		System.out.print("Informe o valor do produto: ");
		p = leia.nextDouble();
		pf = p - (p*10/100);
		System.out.println("Valor do produto com desconto: RS" + pf);
	}
}