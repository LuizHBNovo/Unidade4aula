import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

        char opcao = teclado.next().charAt(0);

        switch(opcao){
            case 'T':
                System.out.println("Informe a base do triângulo: ");
                double baseTriangulo = teclado.nextDouble();
                System.out.println("Informe a altura do triângulo: ");
                double altura = teclado.nextDouble();
                double area = (baseTriangulo*altura)/2;
                System.out.println("Área do triangulo: "+area);
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado: ");
                int lado = teclado.nextInt();
                int areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: "+areaQuadrado);
                break;
            case 'R':
                System.out.println("Digite a base do retângulo: ");
                int baseRetangulo = teclado.nextInt(); 
                System.out.println("Digite a altura do retângulo:");
                int alturaRetangulo = teclado.nextInt();
                int areaRetangulo = baseRetangulo * alturaRetangulo;
                System.out.println("Área do retângulo: "+areaRetangulo);
                break;
            case 'C':
                System.out.println("Digite o raio do circulo: ");
                double raio = teclado.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do circulo: "+df.format(areaCirculo));
                break;
            default:
                System.out.println("Opcao inválida");
        }
        teclado.close();
    }
}
