import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int primeiro = teclado.nextInt();

        System.out.println("Informe outro número inteiro: ");
        int segundo = teclado.nextInt();

        if(primeiro>segundo && primeiro%segundo == 0){
            System.out.println("Os números "+primeiro+" e "+segundo+" são multiplos");
        }else{
            System.out.println("Os números não são multiplos");
        }
        teclado.close();
    }
}
