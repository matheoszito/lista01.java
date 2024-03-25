import java.util.Scanner;

public class ex01 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }

        scanner.close();

    }

}
