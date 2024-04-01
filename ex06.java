import java.util.Scanner;
public class ex06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Realiza a conversão para Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;

        // Exibe o resultado da conversão
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        // Fecha o scanner
        scanner.close();
    }
}



