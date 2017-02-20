import java.util.Scanner;
public class ConversorIdade{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int in,ia;
		double a, m, s, d;
		System.out.print("Informe o ano de nascimento: ");
		in = leia.nextInt();
		System.out.print("Informe o ano atual: ");
		ia = leia.nextInt();
		a = ia - in;
		m = a*12;
		s = a*52;
		d = a*365;
		System.out.println("Idade em anos: " + (int)a);
		System.out.println("Idade em meses: " + (int)m);
		System.out.println("Idade em semanas: " + (int)s);
		System.out.println("Idade em dias: " + (int)d);
		

	}
}