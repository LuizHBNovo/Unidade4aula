import java.util.Scanner;

public class Uni4Exe01{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        double HT = sc.nextDouble();
        System.out.println("Entre com o valor pago por hora: ");
        double VH = sc.nextDouble();
        double salarioTot = HT * VH;
        
        if(HT > 160){
            double salarioExtra = (HT - 160) * (VH/2); 

            double salarioTotal = salarioTot + salarioExtra;
            System.out.println("O salário total é de R$"+ salarioTotal);
        }else{
             System.out.println("O salário total é de R$"+salarioTot);
        }
        sc.close();
    }
}