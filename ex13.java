import java.util.Scanner;

public class ex13 {

    

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os valores de A e B
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        // Solicita ao usuário que insira o tipo de operação (+, -, *, /)
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Verifica se o operador inserido é válido e executa a operação correspondente
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador não definido.");
                return;
        }

        // Exibe o resultado da operação
        System.out.println("Resultado da operação: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}



    
    




