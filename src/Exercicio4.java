import java.io.IOException;
import java.util.Scanner;


public class Exercicio4 {

	 public static void main(String[] args) throws IOException {
		 
	        Scanner in = new Scanner(System.in);
	        
	        System.out.println("Digite um número real");
	        
	        double real = Double.parseDouble(in.nextLine());
	        System.out.println("O número digitado é: " + real * 2);
	        in.close();

	}

}
