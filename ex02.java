// Escreva um algoritmo que leia dois números digitados pelo usuário e exiba
// oresultado da sua soma.

import java.util.Scanner;

public class ex02 {
    public static void executar() {

        Scanner scaneamento = new Scanner(System.in);

        System.out.println("digite um número");

        int sapo = scaneamento.nextInt();

        System.out.println("digite um número");

        int sapo2 = scaneamento.nextInt();

        int resultado = sapo + sapo2;

        System.out.println("O resultado é: " + resultado);

        scaneamento.close();

    }

}
