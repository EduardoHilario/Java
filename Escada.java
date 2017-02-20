import java.util.Scanner;
import java.text.*;
public class Escada{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double g,c,e,r;
		System.out.print("Informe o angulo em graus: ");
		g = leia.nextDouble();
		System.out.print("Informe a medida da distancia da escada com a parede: ");
		c = leia.nextDouble();
		r = g*3.14/180;
		e = c/Math.cos(r);
		System.out.print("A medida da escada e: "+casas.format(e)+" metros.");
		
	}
}