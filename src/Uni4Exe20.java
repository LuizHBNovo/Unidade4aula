import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota 1");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Informe a nota 2");
        double nota2 = teclado.nextDouble();
        
        System.out.println("Informe a nota 3");
        double nota3 = teclado.nextDouble();
        
        System.out.println("Informe a nota dos exercícios");
        double notaExe = teclado.nextDouble();

        double media = (nota1 + nota2*2 + nota3*3 + notaExe)/7;

        if(media >= 9.0){
            System.out.println("Aprovado");
            System.out.println("Média de aproveitamento 9.0");
        }else if(media >= 7.5 && media < 9.0){
            System.out.println("Aprovado");
            System.out.println("Média de aproveitamento 7.5 a 9.0");
        }else if(media >= 6.0 && media < 7.5){
            System.out.println("Aprovado");
            System.out.println("Média de aproveitamento 6.5 a 7.5");
        }else if(media >= 4.0 && media < 6.0){
            System.out.println("Reprovado");
            System.out.println("Média de aproveitamento 4.0 a 6.5");
        }else if(media < 4.0){
            System.out.println("Reprovado");
            System.out.println("Média de aproveitamento 4.0");
        }
        teclado.close();
    }
}
