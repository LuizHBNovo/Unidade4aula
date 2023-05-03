
import java.util.Scanner;
public class Uni4Exe17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a sua renda anual: ");
        double salario = teclado.nextDouble();
        System.out.println("Informe quantos dependentes: ");
        double dependentes = teclado.nextDouble();

        if(dependentes > 0){
            double qtdPorcentagem = (dependentes * 2)/100;
            double desconto = salario * qtdPorcentagem;
            double salarioLiquido = salario - desconto; 
            if(salarioLiquido <= 2000){
                System.out.println("Não paga imposto");
            }else if(salarioLiquido > 2000 && salarioLiquido < 5000){
                 salarioLiquido = (salarioLiquido * 0.05);
                System.out.println("Tera que pagar imposto de 5% e o valor do imposto é de R$"+salarioLiquido);
            }else if(salarioLiquido > 5000 && salarioLiquido < 10000){
                salarioLiquido = (salarioLiquido * 0.1) ;
               System.out.println("Tera que pagar imposto de 10% e o valor do imposto é de R$"+salarioLiquido);
            }else if(salarioLiquido > 10000){
                salarioLiquido = (salarioLiquido * 0.15) ;
               System.out.println("Tera que pagar imposto de 15% e o valor do imposto é de R$"+salarioLiquido);
            }
        }else if(salario <2000){
            System.out.println("Não paga imposto");
        }else if(salario > 2000 && salario < 5000){
             salario = salario * 0.05 ;
            System.out.println("Tera que pagar imposto de 5% e o valor do imposto é de R$"+salario);
        }else if(salario > 5000 && salario < 10000){
            salario = salario * 0.1;
           System.out.println("Tera que pagar imposto de 10% e o valor do imposto é de R$"+salario);
        }else if(salario > 10000){
            salario = salario * 0.15;
           System.out.println("Tera que pagar imposto de 15% e o valor do imposto é de R$"+salario);
        }
        teclado.close();
    }
}

  
