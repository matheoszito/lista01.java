import java.util.Scanner;

public class ex19 {
  

        public static void executar () {
            Scanner scanner = new Scanner(System.in);
    
    
            System.out.print("Digite o raio do cilindro: ");
            double raio = scanner.nextDouble();
    
            System.out.print("Digite a altura do cilindro: ");
            double altura = scanner.nextDouble();
    
          

            double volume = 3.14 * Math.pow(raio, 2) * altura;
    
          
            System.out.println("O volume do cilindro é: " + String.format("%.2f", volume));
    
           
            scanner.close();
        }
    }


