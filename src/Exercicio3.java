import java.util.Scanner;

public class Exercicio3 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       
		        System.out.println("Digite o seu nome: ");
		        String nome = in.nextLine();
	            
	            System.out.println("Informe a sua idade: ");
	            int idade = in.nextInt();
	            
	            System.out.println("Informe seu sal�rio: ");
	            double salario = in.nextDouble();
	       
	            System.out.print("Ol�; Meu nome � "+nome);
	            System.out.print(",\ntenho "+idade + " anos ");
	            System.out.print("e meu sal�rio � R$" + salario + ".");
	            in.close();

	}

}
