import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe um número maior que zero: ");
        double numero = teclado.nextDouble();


        if(String.valueOf(numero).contains(".")){
            System.out.println("Contém casa decimal");
        }else{
            System.out.println("Não contém casa decimal");
        }
        teclado.close();
    }
}
