import java.util.Scanner;
public class Hipotenusa{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double x,y,z;
		System.out.println("Informe a medida dos lados do triangulo: ");
		x = leia.nextDouble();
		y = leia.nextDouble();
		z = Math.pow(x,2) + Math.pow(y,2);
		z = Math.sqrt(z);
		System.out.println("A hipotenusa mede: " + z);
	}
}