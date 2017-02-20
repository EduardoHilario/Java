import java.util.Scanner;
public class AreaLosango{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int d1,d2;
		double area;
		System.out.println("Informe as dimensoes do Losango: ");
		System.out.print("Diagonal Menor: ");
		d1 = leia.nextInt();
		System.out.println("Diagonal Maior: ");
		d2 = leia.nextInt();
		area = (d1*d2)/2;
		System.out.println("A area do losango e: " + area);
	}
}