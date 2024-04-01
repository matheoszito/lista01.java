

import java.util.Scanner;

public class ex03 {
    public static void executar() {

        Scanner scaneamento = new Scanner(System.in);

        System.out.println("Digite um número");

        int sapoA = scaneamento.nextInt();

        System.out.println("Digite um número");

        int sapoB = scaneamento.nextInt();

        if (sapoA > sapoB) {
            System.out.println("A variavel A é maior");
        } else if (sapoA < sapoB) {
            System.out.println("A variavel B é mais maior");
        } else if (sapoA == sapoB) {
            System.out.println("números informados são inválidos");
        }

        scaneamento.close();

    }

}
