import java.util.Scanner;

public class Troca {
    int a;
    int b;
    int aux;

    public int trocaA(){
       this.aux = this.b;
    return this.aux;
   }
    public int trocaB(){
       this.b = this.a;
    return this.a;
    }
    public void mostrar(){
       
        System.out.println("1º Valor era: "+this.a+" \nAgora vale: "+trocaA()+"   \n");
       
        System.out.println("2º Valor era: "+this.b+" \nAgora vale: "+trocaB()+"   ");
        

}
    public static void main(String[] args) {
        Troca tr = new Troca();
        Scanner ent = new Scanner(System.in);
        System.out.println("1º Valor: ");
        tr.a = ent.nextInt();
        System.out.println("2º Valor: ");
        tr.b = ent.nextInt();

        tr.mostrar();
        ent.close();

    }
}