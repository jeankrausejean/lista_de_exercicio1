import java.util.Scanner;
import java.util.Calendar;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, digite sua idade: ");
        Calendar calendario = Calendar.getInstance();
        
        System.out.printf("O ano do seu nascimento é " + (calendario.get(Calendar.YEAR) - entrada.nextInt()) + ".");
        entrada.close();
        
    }
}
