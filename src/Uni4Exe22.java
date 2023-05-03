import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe qual destes cursos você quer saber o título: ");
        System.out.println("------------------------------------------");
        System.out.println("1 - Ciência da computação");
        System.out.println("2 - Licenciatura da computação");
        System.out.println("3 - Sistemas de informação");

        int opcao = teclado.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Opção não encontrada");
                break;
        }
        teclado.close();
    }
}
