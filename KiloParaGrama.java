import java.util.Scanner;
import java.text.*;
public class KiloParaGrama{
	public static void main(String[] args){
		//Metodos invocados;
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		//variaveis;
		double k, g;
		System.out.print("Informe o peso em Quilogramas: ");
		k = leia.nextDouble();
		g = k*1000;
		//(int) mostra apenas a parte inteira de um número
		System.out.println( k + " quilos equivalem a " + (int)g + " gramas.");
	}
}