import java.util.Scanner;

public class ex14 {


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA (a1): ");
        double a1 = scanner.nextDouble();

        System.out.print("Digite a razão da PA (r): ");
        double r = scanner.nextDouble();

        System.out.print("Digite o valor de n (ordem do termo a ser calculado): ");
        int n = scanner.nextInt();

        double an = a1 + (n - 1) * r;

  
        System.out.println("O " + n + "-ésimo termo da PA é: " + an);


        scanner.close();
    }
}




