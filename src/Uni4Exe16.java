
import java.util.Scanner;
public class Uni4Exe16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a idade do primeiro Homem: ");
        int idadeHomem1 = teclado.nextInt();
        System.out.println("Informe a idade do segundo Homem: ");
        int idadeHomem2 = teclado.nextInt();
        System.out.println("Informe a idade da primeira Mulher: ");
        int idadeMulher1 = teclado.nextInt();
        System.out.println("Informe a idade da segunda Mulher: ");
        int idadeMulher2 = teclado.nextInt();

        if(idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2){
            int somaIdade = idadeHomem1 + idadeMulher2;
            int produtoIdade = idadeHomem2 * idadeMulher1;
            System.out.println("A soma da idade do homem mais velho com a idade da mulher mais nova é "+somaIdade);
            System.out.println("O produto das idades do homem mais novo com a mulher mais velha é "+produtoIdade);
        }else if(idadeHomem2 > idadeHomem1 && idadeMulher2 > idadeMulher1){
            int somaIdade = idadeHomem2 + idadeMulher1;
            int produtoIdade = idadeHomem1 * idadeMulher2;
            System.out.println("A soma da idade do homem mais velho com a idade da mulher mais nova é "+somaIdade);
            System.out.println("O produto das idades do homem mais novo com a mulher mais velha é "+produtoIdade);
        }
        teclado.close();
    }
}
