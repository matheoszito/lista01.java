import java.util.Scanner;

public class ex19 {
  

        public static void executar () {
            Scanner scanner = new Scanner(System.in);
    
            // Solicita ao usuário que insira o raio e a altura do cilindro
            System.out.print("Digite o raio do cilindro: ");
            double raio = scanner.nextDouble();
    
            System.out.print("Digite a altura do cilindro: ");
            double altura = scanner.nextDouble();
    
            // Calcula o volume do cilindro
            double volume = 3.14 * Math.pow(raio, 2) * altura;
    
            // Exibe o resultado
            System.out.println("O volume do cilindro é: " + String.format("%.2f", volume));
    
            // Fecha o scanner
            scanner.close();
        }
    }


