import java.util.Scanner;
public class Sub{
	public static void main(String[] args){
		//Declaração do método Scanner;
		Scanner leia = new Scanner(System.in);
		//Declaração das variáveis;
		double n1,n2,sub;
		//programa
		System.out.println("Informe 2 valores: ");
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		sub = n1 - n2;
		System.out.println("A subtracao dos numeros e: " + sub);
	}
}