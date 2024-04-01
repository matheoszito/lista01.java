import java.util.Scanner;

public class ex16 {
    


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

       
        double media = (nota1 + nota2 + nota3) / 3;

   
        System.out.println("A média aritmética das notas é: " + String.format("%.2f", media));

        scanner.close();
    }
}



