import java.util.Scanner;
import java.text.*;
public class ConversorMoeda{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double r,d,m,l;
		System.out.print("Informe o valor em reais: ");
		r = leia.nextDouble();
		d = r/1.8;
		m = r/2;
		l = r/3.57;
		System.out.println("Dolar = "+casas.format(d));
		System.out.println("Marco Alemao = "+casas.format(m));
		System.out.println("Libra = "+casas.format(l));
	}
}