import java.util.Scanner;

public class ex05 {


 
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

    
        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        
        int temp = A;
        A = B;
        B = temp;

      
        System.out.println("\nValores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
 
    }

}




