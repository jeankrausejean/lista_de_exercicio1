import java.util.Scanner;
import java.util.Locale;


public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
	    double cotacao_dolar, valor_dolar,valor_real;

	    System.out.print("Conversor de dólar em real\n\n");

	    System.out.print("Digite a cotação do dolar: ");
	    cotacao_dolar = entrada.nextDouble();

	    System.out.print("Digite o valor em Real: ");
	    valor_real = entrada.nextDouble();

	    valor_dolar = valor_real / cotacao_dolar;

	    System.out.print("O Valor em Dolar é " + valor_dolar + "\n");
	    
	    entrada.close();

	}

}
