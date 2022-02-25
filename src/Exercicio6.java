import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1;
        float num2;
     
        System.out.print("Digite o primeiro número: ");
        num1 = in.nextFloat();
     
        System.out.print("Digite o segundo número: ");
        num2 = in.nextFloat();
     
        System.out.printf("\n%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
     
     in.close();
    }
}