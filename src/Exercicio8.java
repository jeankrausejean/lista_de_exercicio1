import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	       
        int ano2050 = 2050, ano_atual= 2022;
		
		System.out.println("Por favor informe seu ano de nascimento com 4 digitos: ");
        int ano_nascimento = in.nextInt();
        
        int idade = ano_atual - ano_nascimento;
        int idade2 = ano2050 - ano_nascimento;
        
        
        System.out.println("Sua idade é: " + idade + " anos.\n");
        System.out.println("Você terá em 2050: " + idade2 + " anos");
        
        in.close();
        
        
	}
}
