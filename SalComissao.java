import java.util.Scanner;
public class SalComissao{
	public static void main(String[] args){
		//Método para receber dados;
		Scanner leia = new Scanner(System.in);
		//Variáveis;
		double sal, com, salf;
		System.out.print("Informe o salario: ");
		sal = leia.nextDouble();
		System.out.print("Informe o valor total de vendas: ");
		com = leia.nextDouble();
		com = com * 4/100;
		salf = com + sal;
		System.out.println("Valor total de comissao: RS " + com);
		System.out.println("Valor total do salario: RS " + salf);
	}
}