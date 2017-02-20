import java.util.Scanner;
public class Horas{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double h,m,s;
		System.out.print("Informe a hora: ");
		h = leia.nextDouble();
		System.out.print("Informe os minutos: ");
		m = leia.nextDouble();
		System.out.println(h+" horas equivalem a "+h*60+" minutos.");
		System.out.println("No total temos "+((h*60)+m)+" minutos.");
		s = (h*60+m)*60;
		System.out.print("No Total temos "+s+" segundo.");
	}
}