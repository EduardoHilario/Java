import java.util.Scanner;
import java.text.*;
public class SalMinimo{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double salm, salf, x;
		System.out.print("Informe o valor do salario minimo: ");
		salm = leia.nextDouble();
		System.out.print("Informe o salario do funcionario: ");
		salf = leia.nextDouble();
		x = salf/salm;
		System.out.println("O funcionario recebe " + casas.format(x) + " salarios minimos.");
	}
}