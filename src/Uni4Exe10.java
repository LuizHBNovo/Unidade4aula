import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade de Marquinhos: ");
        int Marquinhos = teclado.nextInt();

        System.out.println("Informe a idade de Zezinho: ");
        int Zezinho = teclado.nextInt();

        System.out.println("Informe a idade de Luluzinha");
        int Luluzinha = teclado.nextInt();

        if(Marquinhos < Zezinho && Marquinhos < Luluzinha){
            System.out.println("Marquinhos é o caçula da família");
        }else if(Zezinho < Luluzinha && Zezinho < Marquinhos){
            System.out.println("Zezinho é o caçula da família");
        }else if(Luluzinha < Marquinhos && Luluzinha < Zezinho){
            System.out.println("Luluzinha é a caçula da família");
        }
        teclado.close();
    }
}
