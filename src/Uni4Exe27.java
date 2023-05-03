import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horaChegada;
        int minutoChegada;
        int horaSaida;
        int minutoSaida;
        int horaFinal;
        int minutoFinal;
        int totalMinutos;
        double precoFinal;

        System.out.println("Digite a hora de chegada: ");
        horaChegada = teclado.nextInt(); 
        System.out.println("Digite o minuto de chegada: "); 
        minutoChegada = teclado.nextInt();
        System.out.println("Digite a hora de saída: ");
        horaSaida = teclado.nextInt();
        System.out.println("Digite o minuto de saída: ");
        minutoSaida = teclado.nextInt();

        if(horaChegada > horaSaida){
		    horaFinal = (horaSaida + 24) - horaChegada;
	    }else{
		    horaFinal = horaSaida - horaChegada;
	    }

	    if(minutoChegada > minutoSaida){
		    minutoFinal = (minutoSaida + 60) - minutoChegada;
	    }else{
		    minutoFinal = minutoSaida - minutoChegada;
	    }

        if(minutoSaida < minutoChegada && horaFinal !=0 ){
            minutoFinal = 60 + minutoSaida -minutoChegada;
            horaFinal = horaFinal - 1;
        System.out.println("O tempo de permanência é de: " +horaFinal+":"+minutoFinal+" horas");
    }

        totalMinutos = (horaFinal * 60) + minutoFinal;
        int minutos = totalMinutos % 60;
        if(horaFinal <= 24){
            if(horaFinal == 0 && minutos <=59){
                precoFinal = 5;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 1 && minutos >= 0 && minutos <= 29){
                precoFinal = 5;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 1 && minutos > 30){
                precoFinal = 10;
                System.out.println("O valor a ser pago é de R$"+ precoFinal);
            }else if(horaFinal == 2 && minutos >=0 && minutos <= 29){
                precoFinal = 10;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 2 && minutos >= 30){
                precoFinal = 17.50;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 3 && minutos >=0 & minutos <= 29 ){
                precoFinal = 17.50;
                System.out.println("O valor a ser pago é de R$"+ precoFinal);
            }else if(horaFinal == 3 && minutos >= 30){
                precoFinal = 25;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 4 && minutos >=0 && minutos <= 29){
                precoFinal = 25;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 4 && minutos >= 30){
                precoFinal = 35;
                System.out.println("O valor a ser pago é de R$"+precoFinal);
            }else if(horaFinal == 5 && minutos >=0 && minutos <= 29){
                precoFinal = 35;
                System.out.println("O valor a ser pago é de R$" + precoFinal );
            }else if (horaFinal == 5 && minutos >= 30){
                precoFinal = 45;
                System.out.println("O valor a ser pago é de R$"+ precoFinal);
            }else if(horaFinal > 5 && minutos >= 0 && minutos <= 29){
                int calculo = horaFinal - 5;
                int valorCobrado = calculo * 10;
                precoFinal = 35 + valorCobrado;
                System.out.println("O valor a ser pago é de R$"+ precoFinal);
            }else if(horaFinal > 5 && minutos >= 30){
                int calculo = (horaFinal+ 1) - 5;
                int valorCobrado = calculo * 10;
                precoFinal = 35 + valorCobrado;
                System.out.println("O valor a ser pago é de R$"+ precoFinal);
            }
        }else{
            System.out.println("A hora não pode ser superior a 24 horas");
        }

            
            teclado.close();
    }
}
