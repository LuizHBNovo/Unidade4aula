import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int N1 = sc.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int N2 = sc.nextInt();

        if(N1 > N2){
            System.out.println("O Primeiro número digitado é maior que o segundo");
        }else if(N2 > N1){
            System.out.println("O segundo número digitado é maior que o primeiro");
        }else{
            System.out.println("Os dois números são iguais");
        }
        sc.close();

        
    }
}
