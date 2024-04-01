import java.util.Scanner;

public class ex15 {


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as coordenadas dos pontos P1 e P2
        System.out.println("Digite as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("\nDigite as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Calcula a distância entre os pontos
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Exibe o resultado
        System.out.println("\nA distância entre os pontos P1 e P2 é: " + String.format("%.2f", distancia));

        // Fecha o scanner
        scanner.close();
    }
}



