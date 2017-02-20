import java.util.Scanner;
public class Mult3{
	public static void main(String[] args){
		//Método Scanner;
		Scanner leia = new Scanner(System.in);
		//Declaração das variáveis;
		int n1, n2, n3, res;
		//Programa
		System.out.println("Informe 3 numeros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		res = n1*n2*n3;
		System.out.println("A Multiplicacao entre os numeros e: " + res);
	}
}