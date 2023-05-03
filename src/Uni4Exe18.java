import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
    
        System.out.println("Informe o valor da prestação");
        double valorPrestacao = teclado.nextDouble();
        System.out.println("Informe o dia do mês que foi pago: ");
        int diaPagamento = teclado.nextInt(); 

        if(diaPagamento <= 10){
             
            valorPrestacao = valorPrestacao - (valorPrestacao * 0.1);
            System.out.println("O seu pagamento está em dia e você recebeu 10% de desconto, o valor final da prestação é de R$"+valorPrestacao);
        }else if(diaPagamento > 10 && diaPagamento  <= 15 ){
            System.out.println("Você perdeu o desconto de pagamento em dia o valor da sua prestação continua em R$"+valorPrestacao);
        }else if(diaPagamento > 15){
            int diasAtraso = diaPagamento - 15;
            double porcentagem = diasAtraso*2; 
            double multa = porcentagem/100;
            valorPrestacao = valorPrestacao + (valorPrestacao * multa);
            
            System.out.println("O seu pagamento está atrasado a "+diasAtraso+" dias e você recebeu "+porcentagem+"% de multa por esse atraso , o valor final da prestação é de R$"+valorPrestacao);
        }
        teclado.close();
    }
}
