import java.util.Scanner;
public class Esfera{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double r,p,a,v;
		System.out.print("Informe o raio da esfera: ");
		r = leia.nextDouble();
		p = 2*3.14*r;
		a = 3.14*(r*r);
		v = (3.14*Math.pow(r,3)/4)*3;
		System.out.println("O perimetro da esfera e: "+p);
		System.out.println("A area da esfera e: "+a);
		System.out.println("O volume da esfera e: "+v);
	}
}