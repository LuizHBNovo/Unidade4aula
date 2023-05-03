import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua altura em metros: ");
        double altura = teclado.nextDouble();
        System.out.println("Informe a sua massa em quilogramas: ");
        double massa = teclado.nextDouble();

        double IMC = massa/(Math.pow(altura, 2));

        if(IMC < 18.5){
            System.out.println("Magreza");
        }else if(IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Saudável");
        }else if(IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Sobrepeso");
        }else if(IMC >= 30.0 && IMC <= 34.9){
            System.out.println("Obesidade Grau 1");
        }else if(IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Obesidade Grau 2(severa)");
        }else if(IMC >= 40.0){
            System.out.println("Obesidade Grau 3(Mórbida)");
        }
        teclado.close();
    }
}
