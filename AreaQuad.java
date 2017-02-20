import java.util.Scanner;
public class AreaQuad{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		double l, area;
		System.out.print("Informe a medida do lado do quadrado: ");
		l = leia.nextInt();
		//qualculo de potência;
		area = Math.pow(l,2);
		System.out.println("O quadrado de lado " + l + " possui area de: " + area); 
	}
}