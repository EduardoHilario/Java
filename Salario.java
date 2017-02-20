import java.util.Scanner;
import java.text.*;
public class Salario{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.000");
		double ht, sm, he, salt, vhe, vht;
		System.out.println("Informe os dados abaixo: ");
		System.out.print("Salario minimo: ");
		sm = leia.nextDouble();
		System.out.print("Horas trabalhadas: ");
		ht = leia.nextDouble();
		System.out.print("HOras Extras trabalhadas: ");
		he = leia.nextDouble();
		vht = ht*(sm/8);
		vhe = he*(sm/4);
		salt = vht+vhe;
		System.out.print("O salario total a receber: RS " + casas.format(salt));
		
	}
} 