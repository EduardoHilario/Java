import java.util.Scanner;
import java.text.*;
public class Peso{
	public static void main(String[] args){
		//Metodo para receber dados;
		Scanner leia = new Scanner(System.in);
		//Metodo para controlar casas decimais;
		DecimalFormat casas = new DecimalFormat("0.000");
		//variaveis;
		double p1, np;
		//programa
		System.out.print("Informe seu peso[kg]: ");
		p1 = leia.nextDouble();
		np = p1 + (p1*15/100);
		System.out.println("Caso engorde 15% pesara: " + casas.format(np) + " quilogramas.");
		np = p1 - (p1*20/100);
		System.out.println("Caso emagreca 20% pesara: " + casas.format(np) + " quilogramas.");
	}
}