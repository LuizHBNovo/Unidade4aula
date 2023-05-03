import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre com um valor inteiro maior do que zero: ");
        int N1 = sc.nextInt();

        if(N1 > 0 && N1%2 == 0){
            System.out.println("O Número é par");

        }else if(N1 > 0 && N1%2 == 1){
            System.out.println("O Número é ímpar");
        }
        sc.close();
    }
}
