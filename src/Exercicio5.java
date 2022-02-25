import java.util.Scanner; 


public class Exercicio5 {

  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);        
	    int num1;
	    int num2;
	        
	        System.out.print("Digite o primeiro número: ");
	        num1 = in.nextInt();
	        
	        System.out.print("Digite o segundo número: ");
	        num2 = in.nextInt();
	        
	        System.out.printf("\n%d + %d = %d\n", num1, num2, num1 + num2);
	        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
	        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
	        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
	        System.out.printf("%d / %d = %6.2f(divisão exata)", num1, num2,((double)num1 / num2));
	        
	in.close();
  }

}
