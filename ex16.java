import java.util.Scanner;

public class ex16 {
    


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média aritmética das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe o resultado
        System.out.println("A média aritmética das notas é: " + String.format("%.2f", media));

        // Fecha o scanner
        scanner.close();
    }
}



