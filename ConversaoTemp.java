import java.util.Scanner;
import java.text.*;
public class ConversaoTemp{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double c,f;
		System.out.print("Informe a temperatura em graus celsius: ");
		c = leia.nextDouble();
		f = ((c/5)*9)+32;
		System.out.print("A temperatura e: "+casas.format(f)+" Fahrenheit.");
	}
}