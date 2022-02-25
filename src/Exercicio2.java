import java.util.Scanner;
import java.io.IOException;


public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, media;
		
		System.out.println("Digite a 1º nota: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("A soma de suas notas foram: " + soma);
		
		media = soma / 2;
		System.out.println("Sua média foi: " + media);
		in.close();
	}
	
}
