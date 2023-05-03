import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número da primeira carta: ");
        int carta1 = teclado.nextInt();
        System.out.println("Informe o número da segunda carta:");
        int carta2 = teclado.nextInt();
        System.out.println("Informe o número da terceira carta:");
        int carta3 = teclado.nextInt();

        if(carta1 == 1 || carta1 == 2 || carta1 == 3 ){
            int qtdCartasBoas = 1;
            if(carta2 == 1 || carta2 == 2 || carta2 == 3){
                qtdCartasBoas = qtdCartasBoas +1;
                if(carta3 == 1 || carta3 == 2 || carta3 == 3){
                    qtdCartasBoas ++;
                    if(qtdCartasBoas == 1){
                        System.out.println("TRUCO");
                    }
                    if(qtdCartasBoas == 2){
                        System.out.println("SEIS");
                    }
                    if(qtdCartasBoas == 3){
                        System.out.println("NOVE");
                    }
                }else  if(qtdCartasBoas == 2 ){
                    System.out.println("SEIS");
                    }
            }else if(carta3 == 1 || carta3 == 2 || carta3 == 3){
                qtdCartasBoas ++;
                if(qtdCartasBoas == 1){
                    System.out.println("TRUCO");
                }
                if(qtdCartasBoas == 2){
                    System.out.println("SEIS");
                }
            }else if(qtdCartasBoas == 1){
                System.out.println("TRUCO");
            }
        }else if(carta2 == 1 || carta2 == 2 || carta2 == 3){
            int qtdCartasBoas = 1;
            if(carta3 == 1 || carta3 == 2 || carta3 == 3){
                qtdCartasBoas ++;
                if(qtdCartasBoas == 1){
                    System.out.println("TRUCO");
                }
                if(qtdCartasBoas == 2){
                    System.out.println("SEIS");
                }
            }else if(qtdCartasBoas == 1 ){
                System.out.println("TRUCO");
            }
        }else if(carta3 == 1 || carta3 == 2 || carta3 == 3){
            int qtdCartasBoas = 1;
            if(qtdCartasBoas == 1){
                System.out.println("TRUCO");
            }
        }else{
        }
        teclado.close();
    
}
}
