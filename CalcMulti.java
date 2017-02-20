import java.util.Scanner;
public class CalcMulti{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double n;
		System.out.print("Informe um numero: ");
		n = leia.nextDouble();
		System.out.println("   " + (int)n + " x 0 = " + (int)n*0);
		System.out.println("   " + (int)n + " x 1 = " + (int)n*1);
		System.out.println("   " + (int)n + " x 2 = " + (int)n*2);
		System.out.println("   " + (int)n + " x 3 = " + (int)n*3);
		System.out.println("   " + (int)n + " x 4 = " + (int)n*4);
		System.out.println("   " + (int)n + " x 5 = " + (int)n*5);
		System.out.println("   " + (int)n + " x 6 = " + (int)n*6);
		System.out.println("   " + (int)n + " x 7 = " + (int)n*7);
		System.out.println("   " + (int)n + " x 8 = " + (int)n*8);
		System.out.println("   " + (int)n + " x 9 = " + (int)n*9);
		System.out.println("   " + (int)n + " x 10 = " + (int)n*10);
	}
}