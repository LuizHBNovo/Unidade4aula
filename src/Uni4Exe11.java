import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento de um dos filhos: ");
        int filho1 = teclado.nextInt();
        System.out.println("Informe o ano de nascimento do segundo filho: ");
        int filho2 = teclado.nextInt();
        System.out.println("Informe o ano de nascimento do terceiro filho");
        int filho3 = teclado.nextInt();

        if(filho1 == filho2 && filho1 == filho3){
            System.out.println("Eles são trigêmeos");
        }else if(filho1 == filho2 && filho1 != filho3){
            System.out.println("Os filhos que nasceram no ano de "+filho1+" são gêmeos, ja o que nasceu em "+filho3+" é apenas irmão dos outros dois.");
        }else if(filho2 == filho3 && filho2 != filho1){
            System.out.println("Os filhos que nasceram no ano de "+filho2+" são gêmeos, ja o que nasceu em "+filho1+" é apenas irmão dos outros dois.");
        }else if(filho1 == filho3 && filho1 != filho2){
            System.out.println("Os filhos que nasceram no ano de "+filho3+" são gêmeos, ja o que nasceu em "+filho2+" é apenas irmão dos outros dois.");
        }else{
            System.out.println("Os três são apenas irmãos");
        }
        teclado.close();
    }
}
