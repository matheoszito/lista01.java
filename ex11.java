import java.util.Scanner;

public class ex11 {
    


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os três valores inteiros distintos
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        // Ordena os números em ordem crescente
        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.print(numero1 + ", ");
            if (numero2 <= numero3) {
                System.out.print(numero2 + ", ");
                System.out.println(numero3);
            } else {
                System.out.print(numero3 + ", ");
                System.out.println(numero2);
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.print(numero2 + ", ");
            if (numero1 <= numero3) {
                System.out.print(numero1 + ", ");
                System.out.println(numero3);
            } else {
                System.out.print(numero3 + ", ");
                System.out.println(numero1);
            }
        } else {
            System.out.print(numero3 + ", ");
            if (numero1 <= numero2) {
                System.out.print(numero1 + ", ");
                System.out.println(numero2);
            } else {
                System.out.print(numero2 + ", ");
                System.out.println(numero1);
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}



