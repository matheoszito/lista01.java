import java.util.Scanner;
public class ex06 {
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

      
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);


        scanner.close();
    }
}



