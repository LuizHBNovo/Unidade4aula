import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o peso da carta em gramas: ");
        double peso = teclado.nextDouble();
        if(peso <= 50){
            double valorPago = 0.45;
            System.out.println("Valor a ser pago é de R$"+valorPago);
        }else{
            double pesoExcedido = peso - 50;
            double qtAdicional = (pesoExcedido/20)+1;
            double valorPago = 0.45 + 0.45 * qtAdicional; 
            System.out.println("Valor a ser pago é de R$"+valorPago);
        }
        teclado.close();
    }
}
