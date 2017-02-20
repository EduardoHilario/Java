import java.util.Scanner;
import java.text.*;
public class AreaTrapezio{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		int b1, b2, alt;
		double area;
		System.out.println("Informe os dados do Trapezio: ");
		System.out.print("Base menor: ");
		b1 = leia.nextInt();
		System.out.print("Base maior: ");
		b2 = leia.nextInt();
		System.out.print("Altura: ");
		alt = leia.nextInt();
		area = ((b1 + b2)*alt)/2;
		System.out.println("A area do trapezio e: " + area);
		
	}
}