import java.util.Scanner;
public class AnguloTriangulo{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double a1,a2,a3;
		System.out.println("Informe os valores de 2 angulos: ");
		a1 = leia.nextDouble();
		a2 = leia.nextDouble();
		a3 = 180-(a1+a2);
		System.out.print("A medida do 3 angulo e: "+a3+" graus.");
	}
}