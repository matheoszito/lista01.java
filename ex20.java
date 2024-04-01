import java.util.Scanner;

public class ex20 {
    


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o tempo de viagem em horas e a velocidade média
        System.out.print("Digite o tempo de viagem em horas: ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

        // Calcula a distância percorrida durante a viagem
        double distancia = tempoViagem * velocidadeMedia;

        // Calcula a quantidade de litros de combustível gasta na viagem
        double litrosCombustivel = distancia / 12; // Autonomia do veículo é de 12 km/l

        // Exibe o resultado
        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + String.format("%.2f", litrosCombustivel) + " litros");

        // Fecha o scanner
        scanner.close();
    }
}



