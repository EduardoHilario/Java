import java.util.Scanner;
public class Poligono{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double n, nd;
		System.out.print("Informe o numero de lados: ");
		n = leia.nextDouble();
		nd = n*(n-3)/2;
		System.out.print("A numero de diagonais do poligono e: "+nd);
	}
}