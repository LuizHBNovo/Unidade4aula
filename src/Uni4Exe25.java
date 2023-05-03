import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");                    
        System.out.println("2 - Diferença entre dois números.");                    
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");                    

        int opcao = teclado.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Digite o primeiro número: ");
                double numero1 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double numero2 = teclado.nextDouble();
                double soma = numero1 + numero2;
                System.out.println("A soma dos dois número é : "+soma);
                break;
            case 2: 
                System.out.println("Digite o primeiro número: ");
                double numero1_1 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double numero2_2 = teclado.nextDouble();
                double diferenca = numero1_1 - numero2_2;
                System.out.println("A diferença dos dois número é : "+diferenca);
                break;
            case 3:
                System.out.println("Digite o primeiro número: ");
                double num1 = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = teclado.nextDouble();
                double produto = num1 * num2;
                System.out.println("Produto entre dois números: "+produto);
                break;
            case 4:    
                System.out.println("Digite o primeiro número(numerador): ");
                double numerador = teclado.nextDouble();
                System.out.println("Digite o segundo número(denominador): ");
                double denominador = teclado.nextDouble();
                if(denominador == 0) {
                System.out.println("o denominador não pode ser zero.");
                }else{
                    double divisao = numerador/denominador;
                    System.out.println("O resultado da divisao dos valores é: "+divisao);
                }
                break;
            default:
                System.out.println("Opção não encontrada");
                break;
        }
        teclado.close();
    }
}
