import java.util.Scanner;
public class Mponde{
	public static void main(String[] args){
		//metódo para receber dados do usuário;
		Scanner leia = new Scanner(System.in);
		//Declaração das variáveis;
		double n1, n2, media;
		//Programa;
		System.out.println("Informe as duas notas: ");
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		media = (n1+n2)/2;
		System.out.println("A media ponderada entre as notas e: " + media);
	}	
}