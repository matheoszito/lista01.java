import java.util.Scanner;

public class ex05 {


    /**
     * 
     */
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os valores de A e B
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Exibe os valores originais de A e B
        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        // Realiza a troca de valores entre A e B
        int temp = A;
        A = B;
        B = temp;

        // Exibe os valores após a troca
        System.out.println("\nValores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        // Fecha o scanner
        scanner.close();
 
    }

}




