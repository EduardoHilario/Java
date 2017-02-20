import java.util.Scanner;
import java.text.*;
public class Divi{
	public static void main(String[] args){
		//Metodo para receber informações de usuário;
		Scanner leia = new Scanner(System.in);
		//Metodo para controlar casas decimais;
		DecimalFormat casas = new DecimalFormat("0.00");
		//Variáveis
		double n1, n2, divi;
		//programa
		System.out.println("Informe dois numeros: ");
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		divi = n1/n2;
		System.out.println("A divisao entre os numeros e: " + casas.format(divi));
	}
}