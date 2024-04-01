import java.util.Scanner;

public class ex18 {


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média harmônica das notas
        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        // Exibe o resultado
        System.out.println("A média harmônica das notas é: " + String.format("%.2f", mediaHarmonica));

        // Fecha o scanner
        scanner.close();
    }
}



