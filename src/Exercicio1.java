import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, digite o 1� nome: ");
		String nome1 = leitor.nextLine();
	
		System.out.println("Por favor, digite o 2� nome: ");
		String nome2 = leitor.nextLine();
		
		System.out.println("Por favor, digite o 3� nome: ");
		String nome3 = leitor.nextLine();
		
		System.out.println("Os nomes digitados foram: \n" + nome1 + ",\n" + nome2 + " e \n"+ nome3 + ".");
		leitor.close();
		
	}

}
