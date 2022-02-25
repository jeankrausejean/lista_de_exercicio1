import java.util.Scanner;

public class Exercicio3 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       
		        System.out.println("Digite o seu nome: ");
		        String nome = in.nextLine();
	            
	            System.out.println("Informe a sua idade: ");
	            int idade = in.nextInt();
	            
	            System.out.println("Informe seu salário: ");
	            double salario = in.nextDouble();
	       
	            System.out.print("Olá; Meu nome é "+nome);
	            System.out.print(",\ntenho "+idade + " anos ");
	            System.out.print("e meu salário é R$" + salario + ".");
	            in.close();

	}

}
