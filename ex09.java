import java.util.Scanner;

public class ex09 {
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os números A e B
        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();

        // Verifica se os números são iguais
        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");

            // Identifica o maior número
            int maior = Math.max(A, B);
            System.out.println("O maior número é: " + maior);
        }

        // Fecha o scanner
        scanner.close();
    }
}



