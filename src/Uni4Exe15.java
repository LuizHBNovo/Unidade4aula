import java.util.Scanner;


public class Uni4Exe15{
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);

        System.out.println("Informe a quantos meses o funcionário foi admitido? ");
        int meses = teclado.nextInt();
        System.out.println("Informe o salário atual do funcionário ");
        double salario = teclado.nextDouble();
        if(meses < 12){
            double reajuste = salario * 0.05;
            double salarioFinal = salario + reajuste;
            System.out.println("O reajuste do salário será de R$" +reajuste+" e o novo salário será de R$"+salarioFinal);
        }else if(meses >= 13 && meses <= 48){
            double reajuste = salario * 0.07;
            double salarioFinal = salario + reajuste;
            System.out.println("O reajuste do salário será de R$" +reajuste+" e o novo salário será de R$"+salarioFinal);
        }else{
            System.out.println("Sem reajuste");
        }
        teclado.close();
    }
}