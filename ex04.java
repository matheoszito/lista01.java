// Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos.

import java.util.Scanner;

public class ex04 {

    public static void executar() {


        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Realiza as operações
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        // Exibe os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}

        
    



