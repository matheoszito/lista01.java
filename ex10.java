import java.util.Scanner;

public class ex10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Número por extenso: Um");
                break;
            case 2:
                System.out.println("Número por extenso: Dois");
                break;
            case 3:
                System.out.println("Número por extenso: Três");
                break;
            case 4:
                System.out.println("Número por extenso: Quatro");
                break;
            case 5:
                System.out.println("Número por extenso: Cinco");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }

        
        scanner.close();
    }
}



