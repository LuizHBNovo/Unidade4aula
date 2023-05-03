import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o sexo:");
        char resposta = sc.next().charAt(0);
        
        if (resposta == 'm' || resposta == 'M'){
            System.out.println("Masculino");
        }else if(resposta == 'f' || resposta == 'F'){
            System.out.println("feminino");
        }else if(resposta == 'i' || resposta == 'I'){
            System.out.println("Não informado");
        }else{
            System.out.println("Entrada Incorreta");
        }
        sc.close();        
    }
}
