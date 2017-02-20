import java.util.Scanner;
import java.text.*;
public class SaldoConta{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double sal, conta1, conta2;
		System.out.print("Informe o salario: ");
		sal = leia.nextDouble();
		System.out.print("Informe o valor da conta 1: ");
		conta1 = leia.nextDouble();
		sal = sal - (conta1 + (conta1 * 2/100));
		System.out.print("informe o valor da conta 2: ");
		conta2 = leia.nextDouble();
		sal = sal - (conta2 + (conta2 * 2/100));
		System.out.println("O saldo da conta e: RS" + casas.format(sal));
	}
}