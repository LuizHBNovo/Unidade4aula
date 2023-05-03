import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a opção de ordenação dos três numeros (1, 2, 3)");
        System.out.println("--------------------------------------------------------");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - O maior valor fica entre os outros");

        int opcao = teclado.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Informe um valor");
                int valor1 = teclado.nextInt();
                System.out.println("Informe mais um valor");
                int valor2 = teclado.nextInt();
                System.out.println("Informe o último valor");
                int valor3 = teclado.nextInt();
                if(valor1 < valor2 && valor2 < valor3)
                System.out.println(valor1 +", "+ valor2 +", "+ valor3);
                else if(valor1 < valor3 && valor3 < valor2)
                System.out.println(valor1 +", "+ valor3 +", "+ valor2);
                else if(valor2 < valor1 && valor1 < valor3)
                System.out.println(valor2 +", "+ valor1 +", "+ valor3);
                else if(valor2 < valor3 && valor3 < valor1)
                System.out.println(valor2 +", "+ valor3 +", "+ valor1);
                else if(valor3 < valor2 && valor2< valor1)
                System.out.println(valor3 +", "+ valor2 +", "+ valor1);
                else if(valor3< valor1 && valor1 < valor2)
                System.out.println(valor3 +", "+ valor1 +", "+ valor2);
                break;
            case 2: 
                System.out.println("Informe um valor");
                int valor1_1 = teclado.nextInt();
                System.out.println("Informe mais um valor");
                int valor2_1 = teclado.nextInt();
                System.out.println("Informe o último valor");
                int valor3_1 = teclado.nextInt();
                if(valor1_1 > valor2_1 && valor2_1 > valor3_1)
                System.out.println(valor1_1 +", "+ valor2_1 +", "+ valor3_1);
                else if(valor1_1 > valor3_1 && valor3_1 > valor2_1)
                System.out.println(valor1_1 +", "+ valor3_1 +", "+ valor2_1);
                else if(valor2_1 > valor1_1 && valor1_1 > valor3_1)
                System.out.println(valor2_1 +", "+ valor1_1 +", "+ valor3_1);
                else if(valor2_1 > valor3_1 && valor3_1 > valor1_1)
                System.out.println(valor2_1 +", "+ valor3_1 +", "+ valor1_1);
                else if(valor3_1 > valor2_1 && valor2_1 > valor1_1)
                System.out.println(valor3_1 +", "+ valor2_1 +", "+ valor1_1);
                else if(valor3_1 > valor1_1 && valor1_1 > valor2_1)
                System.out.println(valor3_1 +", "+ valor1_1 +", "+ valor2_1);
                break;  
            case 3:
                System.out.println("Informe um valor");
                int valor1_ = teclado.nextInt();
                System.out.println("Informe mais um valor");
                int valor2_ = teclado.nextInt();
                System.out.println("Informe o último valor");
                int valor3_ = teclado.nextInt();
                if(valor1_ > valor2_ && valor2_ > valor3_)
                System.out.println(valor3_ +", "+ valor1_ +", "+ valor2_);
                else if(valor1_ > valor3_ && valor3_ > valor2_)
                System.out.println(valor2_ +", "+ valor1_ +", "+ valor3_);
                else if(valor2_ > valor1_ && valor1_ > valor3_)
                System.out.println(valor3_ +", "+ valor2_ +", "+ valor1_);
                else if(valor2_ > valor3_ && valor3_ > valor1_)
                System.out.println(valor1_ +", "+ valor2_ +", "+ valor3_);
                else if(valor3_ > valor2_ && valor2_ > valor1_)
                System.out.println(valor1_ +", "+ valor3_ +", "+ valor2_);
                else if(valor3_ > valor1_ && valor1_ > valor2_)
                System.out.println(valor2_ +", "+ valor3_ +", "+ valor1_);
                break; 
            default:
                System.out.println("Opção não encontrada");
                break;
        }
        teclado.close();
    }
}
