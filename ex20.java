import java.util.Scanner;

public class ex20 {
    


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o tempo de viagem em horas: ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

       
        double distancia = tempoViagem * velocidadeMedia;

      
        double litrosCombustivel = distancia / 12; 
       
        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + String.format("%.2f", litrosCombustivel) + " litros");

   
        scanner.close();
    }
}



