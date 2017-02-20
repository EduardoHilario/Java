import java.util.Scanner;
public class IluminaCasa{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double c,l,p,a;
		System.out.print("Informe o comprimento: ");
		c = leia.nextDouble();
		System.out.print("Informe a largura: ");
		l = leia.nextDouble();
		a = l*c;
		p = a*18;
		System.out.println("Area = "+a+" metros");
		System.out.println("Potencia = "+p+" Wats");
	}
}