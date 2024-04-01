import java.util.Scanner;

public class ex12 {
   


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número do mês
        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();

        // Verifica se o número do mês é válido e mostra o mês correspondente
        switch(numeroMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }

        // Fecha o scanner
        scanner.close();
    }
}



