import java.util.Scanner;

public class ex09 {
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();


        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");

            int maior = Math.max(A, B);
            System.out.println("O maior número é: " + maior);
        }

        scanner.close();
    }
}



